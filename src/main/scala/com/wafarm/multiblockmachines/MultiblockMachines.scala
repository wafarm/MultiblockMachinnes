package com.wafarm.multiblockmachines

import com.wafarm.multiblockmachines.MultiblockMachines.logger
import net.minecraftforge.fml.common.Mod
import org.apache.logging.log4j.{LogManager, Logger}

@Mod("multiblockmachines")
class MultiblockMachines {
    MultiblockMachines => {
        logger.info("Multiblock Machines loading.")
    }
}

object MultiblockMachines {
    private val logger: Logger = LogManager.getLogger
}
