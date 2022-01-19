package com.wafarm.multiblockmachines

import com.wafarm.multiblockmachines.common.registry.{BlockRegistry, ItemRegistry}
import net.minecraft.item.{ItemGroup, ItemStack}
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext

@Mod("multiblockmachines")
class MultiblockMachines {
    ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get.getModEventBus)
    BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get.getModEventBus)
}

object MultiblockMachines {
    val MOD_ID: String = "multiblockmachines"
    val MOD_NAME: String = "Multiblock Machines"
    val MultiblockMachinesItemGroup: ItemGroup = new ItemGroup(MOD_ID) {
        override def createIcon(): ItemStack = new ItemStack(ItemRegistry.controllerBlock.get())
    }
}
