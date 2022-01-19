package com.wafarm.multiblockmachines.common.registry

import com.wafarm.multiblockmachines.MultiblockMachines
import com.wafarm.multiblockmachines.common.block.ControllerBlock
import net.minecraft.block.Block
import net.minecraftforge.fml.RegistryObject
import net.minecraftforge.registries.{DeferredRegister, ForgeRegistries}

object BlockRegistry {
    final val BLOCKS: DeferredRegister[Block] = DeferredRegister.create(ForgeRegistries.BLOCKS, MultiblockMachines.MOD_ID)
    val controllerBlock: RegistryObject[Block] = BLOCKS.register("controller_block", () => new ControllerBlock)
}
