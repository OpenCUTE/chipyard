package chipyard

import org.chipsalliance.cde.config.{Config}
import saturn.common.{VectorParams}
import freechips.rocketchip.subsystem.InTile
import cute._


class VerifyL2DramPerformenceTest1CUTEM256Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = CuteParams.dram_L2_8Tops_PerformanceTestParams.copy(Debug = CuteDebugParams.CMLDebugEnable)) ++
  new cute.WithCUTE(Seq(0)) ++
  new chipyard.config.WithSystemBusWidth(256) ++
  new boom.v3.common.WithNSmallBooms(1) ++                          // small boom config
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(dataBits = 256) ++ //设置访存总线的位宽
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB=512,outerLatencyCycles=100) ++
  new chipyard.config.AbstractConfig)

class L2DramPerformenceTest1CUTEM64Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = CuteParams.dram_L2_8Tops_PerformanceTestParams) ++
  new cute.WithCUTE(Seq(0)) ++
  new chipyard.config.WithSystemBusWidth(256) ++
  new boom.v3.common.WithNSmallBooms(1) ++                          // small boom config
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(dataBits = 64) ++ //设置访存总线的位宽
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB=512,outerLatencyCycles=100) ++
  new chipyard.config.AbstractConfig)

class L2DramPerformenceTest1CUTEM128Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = CuteParams.dram_L2_8Tops_PerformanceTestParams) ++
  new cute.WithCUTE(Seq(0)) ++
  new chipyard.config.WithSystemBusWidth(256) ++
  new boom.v3.common.WithNSmallBooms(1) ++                          // small boom config
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(dataBits = 128) ++ //设置访存总线的位宽
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB=512,outerLatencyCycles=100) ++
  new chipyard.config.AbstractConfig)

class L2DramPerformenceTest1CUTEM256Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = CuteParams.dram_L2_8Tops_PerformanceTestParams) ++
  new cute.WithCUTE(Seq(0)) ++
  new chipyard.config.WithSystemBusWidth(256) ++
  new boom.v3.common.WithNSmallBooms(1) ++                          // small boom config
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(dataBits = 256) ++ //设置访存总线的位宽
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB=512,outerLatencyCycles=100) ++
  new chipyard.config.AbstractConfig)

class L2DramPerformenceTest4CUTEM64Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = CuteParams.dram_L2_8Tops_PerformanceTestParams) ++
  new cute.WithCUTE(Seq(0,1,2,3)) ++
  new chipyard.config.WithSystemBusWidth(256) ++
  new boom.v3.common.WithNSmallBooms(4) ++                          // small boom config
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(dataBits = 64) ++ //设置访存总线的位宽
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB=512,outerLatencyCycles=100) ++
  new chipyard.config.AbstractConfig)
class L2DramPerformenceTest4CUTEM128Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = CuteParams.dram_L2_8Tops_PerformanceTestParams) ++
  new cute.WithCUTE(Seq(0,1,2,3)) ++
  new chipyard.config.WithSystemBusWidth(256) ++
  new boom.v3.common.WithNSmallBooms(4) ++                          // small boom config
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(dataBits = 128) ++ //设置访存总线的位宽
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB=512,outerLatencyCycles=100) ++
  new chipyard.config.AbstractConfig)

class L2DramPerformenceTest4CUTEM256Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = CuteParams.dram_L2_8Tops_PerformanceTestParams) ++
  new cute.WithCUTE(Seq(0,1,2,3)) ++
  new chipyard.config.WithSystemBusWidth(256) ++
  new boom.v3.common.WithNSmallBooms(4) ++                          // small boom config
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(dataBits = 256) ++ //设置访存总线的位宽
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB=512,outerLatencyCycles=100) ++
  new chipyard.config.AbstractConfig)

class YJPFPGACUTESmallBoomConfig extends Config(
  new cute.WithCUTE(Seq(0)) ++
  new chipyard.config.WithSystemBusWidth(256) ++
  new boom.v3.common.WithNSmallBoomsMMIOSpeedUp(1) ++                          // small boom config
  new chipyard.config.YJPAbstractConfig)

class CUTESmallBoomConfig extends Config(
  new cute.WithCUTE(Seq(0)) ++
  new chipyard.config.WithSystemBusWidth(256) ++
  new boom.v3.common.WithNSmallBooms(1) ++                          // small boom config
  new chipyard.config.AbstractConfig)

class CUTEShuttle512D512V256M4CoreConfig extends Config(
  new cute.WithCUTE(Seq(0,1,2,3)) ++
  new saturn.shuttle.WithShuttleVectorUnit(512, 512, VectorParams.refParams) ++
  new chipyard.config.WithSystemBusWidth(256) ++
  new shuttle.common.WithTCM ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(4) ++
  new chipyard.config.AbstractConfig)
