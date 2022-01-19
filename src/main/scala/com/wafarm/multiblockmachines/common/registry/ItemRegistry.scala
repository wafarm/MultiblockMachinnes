package com.wafarm.multiblockmachines.common.registry

import com.wafarm.multiblockmachines.MultiblockMachines
import net.minecraft.item.{BlockItem, Item}
import net.minecraftforge.fml.RegistryObject
import net.minecraftforge.registries.{DeferredRegister, ForgeRegistries}

object ItemRegistry {
    final val ITEMS: DeferredRegister[Item] = DeferredRegister.create(ForgeRegistries.ITEMS, MultiblockMachines.MOD_ID)
    final val controllerBlock: RegistryObject[Item] = ITEMS.register("controller_block", () => new BlockItem(BlockRegistry.controllerBlock.get(), new Item.Properties().group(MultiblockMachines.MultiblockMachinesItemGroup)))
}
