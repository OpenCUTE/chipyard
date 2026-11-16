package chipyard

import org.chipsalliance.cde.config.Config
import cute.{CuteDebugParams, HardwareConfig}

class CUTE2TopsSCP64SVFpeDebugConfig extends Config(
  new cute.WithCuteCoustomParams(
    CoustomCuteParam = HardwareConfig.CUTE_2Tops_64SCP.copy(
      Debug = CuteDebugParams.CMLDebugEnable
    )
  ) ++ new CUTE2TopsSCP64Config
)

class CUTE4TopsSCP64SVFpeDebugConfig extends Config(
  new cute.WithCuteCoustomParams(
    CoustomCuteParam = HardwareConfig.CUTE_4Tops_64SCP.copy(
      Debug = CuteDebugParams.CMLDebugEnable
    )
  ) ++ new CUTE4TopsSCP64Config
)