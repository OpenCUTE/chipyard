// Auto-generated from configs/chipyard_configs/cute05tops_scp64.yaml, configs/chipyard_configs/cute16tops_scp256.yaml, configs/chipyard_configs/cute16tops_scp512.yaml, configs/chipyard_configs/cute1tops_scp128.yaml, configs/chipyard_configs/cute1tops_scp64.yaml, configs/chipyard_configs/cute2tops_scp128.yaml, configs/chipyard_configs/cute2tops_scp256.yaml, configs/chipyard_configs/cute2tops_scp64.yaml, configs/chipyard_configs/cute2tops_small_boom.yaml, configs/chipyard_configs/cute2tops_small_rocket.yaml, configs/chipyard_configs/cute32tops_scp512.yaml, configs/chipyard_configs/cute4tops_scp128.yaml, configs/chipyard_configs/cute4tops_scp256.yaml, configs/chipyard_configs/cute4tops_scp512.yaml, configs/chipyard_configs/cute4tops_scp64.yaml, configs/chipyard_configs/cute4tops_shuttle512_d512_v512_m512_sysbus512_membus1_core.yaml, configs/chipyard_configs/cute8tops_scp128.yaml, configs/chipyard_configs/cute8tops_scp256.yaml, configs/chipyard_configs/cute8tops_scp512.yaml
// DO NOT EDIT MANUALLY.
// Generated at: Wed May 13 09:14:35 2026

package chipyard

import org.chipsalliance.cde.config.Config
import saturn.common.VectorParams
import cute._

// cute05tops_scp64
class CUTE05TopsSCP64Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_05Tops_64SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute16tops_scp256
class CUTE16TopsSCP256Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_16Tops_256SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute16tops_scp512
class CUTE16TopsSCP512Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_16Tops_512SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute1tops_scp128
class CUTE1TopsSCP128Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_1Tops_128SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute1tops_scp64
class CUTE1TopsSCP64Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_1Tops_64SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute2tops_scp128
class CUTE2TopsSCP128Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_2Tops_128SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute2tops_scp256
class CUTE2TopsSCP256Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_2Tops_256SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute2tops_scp64
class CUTE2TopsSCP64Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_2Tops_64SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// Keep the normal CUTE2TopsSCP64Config quiet.  This variant records every
// CMemoryLoader store so GEMM output writes can be checked against golden data.
class CUTE2TopsSCP64CMLDebugConfig extends Config(
  new cute.WithCuteCoustomParams(
    CoustomCuteParam = HardwareConfig.CUTE_2Tops_64SCP.copy(
      Debug = CuteDebugParams.CMLDebugEnable)) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// Narrow datapath trace used to validate MatrixTE's A/B/C/D transactions
// against a software GEMM reference.
class CUTE2TopsSCP64NumericDebugConfig extends Config(
  new cute.WithCuteCoustomParams(
    CoustomCuteParam = HardwareConfig.CUTE_2Tops_64SCP.copy(
      Debug = CuteDebugParams.CMLDebugEnable.copy(
        YJPMACDebugEnable = true,
        YJPADCDebugEnable = true,
        YJPBDCDebugEnable = true))) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute2tops_small_boom
class CUTE2TopsSmallBoomConfig extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_2Tops_64SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new boom.v3.common.WithNSmallBooms(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute2tops_small_rocket
class CUTE2TopsSmallRocketConfig extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_2Tops_64SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new freechips.rocketchip.rocket.WithNSmallCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute32tops_scp512
class CUTE32TopsSCP512Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_32Tops_512SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute4tops_scp128
class CUTE4TopsSCP128Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_4Tops_128SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute4tops_scp256
class CUTE4TopsSCP256Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_4Tops_256SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute4tops_scp512
class CUTE4TopsSCP512Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_4Tops_512SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute4tops_scp64
class CUTE4TopsSCP64Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_4Tops_64SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// Records every CMemoryLoader D write so 512-bit GEMM output can be checked
// against the C-model oracle without changing the normal 4TOPS configuration.
class CUTE4TopsSCP64CMLDebugConfig extends Config(
  new cute.WithCuteCoustomParams(
    CoustomCuteParam = HardwareConfig.CUTE_4Tops_64SCP.copy(
      Debug = CuteDebugParams.CMLDebugEnable)) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// Adds A/B scale-controller and MatrixTE transaction traces to the 4TOPS
// 512-bit configuration.  It is diagnostic-only and leaves the normal
// CMLDebug configuration unchanged.
class CUTE4TopsSCP64NumericDebugConfig extends Config(
  new cute.WithCuteCoustomParams(
    CoustomCuteParam = HardwareConfig.CUTE_4Tops_64SCP.copy(
      Debug = CuteDebugParams.CMLDebugEnable.copy(
        YJPMACDebugEnable = true,
        YJPADCDebugEnable = true,
        YJPBDCDebugEnable = true))) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute4tops_shuttle512_d512_v512_m512_sysbus512_membus1_core
class CUTE4TopsShuttle512D512V512M512Sysbus512Membus1CoreConfig extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_4Tops_64SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new saturn.shuttle.WithShuttleVectorUnit(vLen = 512, dLen = 512, VectorParams.CUTErefParams, mLen = Option(512)) ++
  new shuttle.common.WithTCM(address = 0x70000000L, size = 2L << 20, banks = 2) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute8tops_scp128
class CUTE8TopsSCP128Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_8Tops_128SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute8tops_scp256
class CUTE8TopsSCP256Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_8Tops_256SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)

// cute8tops_scp512
class CUTE8TopsSCP512Config extends Config(
  new cute.WithCuteCoustomParams(CoustomCuteParam = HardwareConfig.CUTE_8Tops_512SCP) ++
  new cute.WithCUTE(Seq(0)) ++
  new freechips.rocketchip.subsystem.WithNBitMemoryBus(512) ++
  new freechips.rocketchip.subsystem.WithCacheHash ++
  new freechips.rocketchip.subsystem.WithNBanks(4) ++
  new freechips.rocketchip.subsystem.WithInclusiveCache(capacityKB = 512, outerLatencyCycles = 40) ++
  new chipyard.config.WithSystemBusWidth(512) ++
  new shuttle.common.WithShuttleTileBeatBytes(64) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new freechips.rocketchip.subsystem.WithoutTLMonitors ++
  new chipyard.config.AbstractConfig)
