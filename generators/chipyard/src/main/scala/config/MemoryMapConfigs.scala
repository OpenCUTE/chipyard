package chipyard.config

import org.chipsalliance.cde.config.Config
import freechips.rocketchip.subsystem._
import freechips.rocketchip.devices.tilelink.{BootROMLocated, CLINTKey, PLICKey}
import freechips.rocketchip.resources.{ReservedMemoryRegion, ReservedMemoryRegionsKey}
import sifive.blocks.devices.uart.PeripheryUARTKey
import chipyard.clocking.ChipyardPRCIControlKey
import testchipip.boot.{BootAddrRegKey, CustomBootPinKey}
import freechips.rocketchip.util.SystemFileName
import java.nio.file.{Files, Paths}

case class MemoryMapRegion(binding: String, base: BigInt, size: BigInt)

/** Apply supported layout parameters to real devices, retaining their implementation.
  * Fixed windows are checked against the elaborated DTS by the target compiler.
  */
class WithOpenCUTEMemoryMap(regions: Seq[MemoryMapRegion], reserved: Seq[ReservedMemoryRegion])
  extends Config((site, here, up) => {
    def find(binding: String) = regions.find(_.binding == binding)
    def bootAddress(r: MemoryMapRegion): BigInt = {
      val spans = reserved.filter(x => x.base >= r.base && x.base + x.size <= r.base + r.size).sortBy(_.base)
      val boundaries = Seq(r.base) ++ spans.flatMap(x => Seq(x.base, x.base + x.size)) ++ Seq(r.base + r.size)
      boundaries.grouped(2).map(x => (x.head, x.last - x.head)).filter(_._2 > 0).toSeq.maxBy(_._2)._1
    }
    def bootImage(): SystemFileName = {
      val xlen = site(MaxXLen)
      val data = os.read.bytes(os.resource / os.RelPath(s"opencute/bootrom/bootrom.rv$xlen.img"))
      def patch(marker: BigInt, address: BigInt): Unit = {
        require(address >= 0 && address < (BigInt(1) << xlen), "boot address exceeds XLEN")
        def bytes(value: BigInt) = (0 until xlen / 8).map(i => ((value >> (i * 8)) & 255).toByte).toArray
        val pattern = bytes(marker)
        val positions = data.indices.filter(i => i + pattern.length <= data.length && data.slice(i, i + pattern.length).sameElements(pattern))
        require(positions.size == 1, "invalid OpenCUTE bootrom template")
        Array.copy(bytes(address), 0, data, positions.head, pattern.length)
      }
      val clint = site(CLINTKey).get.baseAddress
      val bootReg = site(BootAddrRegKey).get.bootRegAddress
      patch(BigInt("13579bdf", 16), clint)
      patch(BigInt("2468ace0", 16), bootReg)
      val path = Paths.get(site(chipyard.stage.phases.TargetDirKey), s"opencute-bootrom-$xlen-${clint.toString(16)}-${bootReg.toString(16)}.img")
      Files.createDirectories(path.getParent)
      Files.write(path, data)
      SystemFileName(path.toString)
    }
    {
      case ExtMem => find("external_ram") match {
        case Some(r) =>
          val m = up(ExtMem, site).getOrElse(throw new IllegalArgumentException("external_ram needs ExtMem"))
          require(m.incohBase.isEmpty, "explicit memory map requires a declared incoherent alias")
          Some(m.copy(master = m.master.copy(base = r.base, size = r.size)))
        case None => up(ExtMem, site)
      }
      case BootROMLocated(loc) => find("boot_rom") match {
        case Some(r) =>
          val roms = up(BootROMLocated(loc), site)
          if (loc == InSubsystem) {
            require(roms.size == 1, "boot_rom binding requires one boot ROM")
            roms.map(x => x.copy(address = r.base, size = r.size.toInt,
              hang = r.base + (x.hang - x.address), contentFileName = bootImage()))
          } else roms
        case None => up(BootROMLocated(loc), site)
      }
      case PeripheryUARTKey => find("uart") match {
        case Some(r) =>
          val devices = up(PeripheryUARTKey, site)
          require(devices.size == 1, "uart binding requires one UART")
          devices.map(_.copy(address = r.base))
        case None => up(PeripheryUARTKey, site)
      }
      case CLINTKey => find("clint") match {
        case Some(r) => Some(up(CLINTKey, site).getOrElse(throw new IllegalArgumentException("missing CLINT")).copy(baseAddress = r.base))
        case None => up(CLINTKey, site)
      }
      case PLICKey => find("plic") match {
        case Some(r) => Some(up(PLICKey, site).getOrElse(throw new IllegalArgumentException("missing PLIC")).copy(baseAddress = r.base))
        case None => up(PLICKey, site)
      }
      case ChipyardPRCIControlKey => find("prci_clock") match {
        case Some(r) => up(ChipyardPRCIControlKey, site).copy(baseAddress = r.base)
        case None => up(ChipyardPRCIControlKey, site)
      }
      case BootAddrRegKey => find("external_ram") match {
        case Some(r) => up(BootAddrRegKey, site).map(_.copy(defaultBootAddress = bootAddress(r)))
        case None => up(BootAddrRegKey, site)
      }
      case CustomBootPinKey => find("external_ram") match {
        case Some(r) => up(CustomBootPinKey, site).map(_.copy(customBootAddress = bootAddress(r)))
        case None => up(CustomBootPinKey, site)
      }
      case ReservedMemoryRegionsKey => reserved
    }
  })
