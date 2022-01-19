package com.wafarm.multiblockmachines.common.block

import com.wafarm.multiblockmachines.common.block.ControllerBlock.FACING
import net.minecraft.block.AbstractBlock.Properties
import net.minecraft.block.material.Material
import net.minecraft.block.{Block, BlockState, HorizontalBlock, SoundType}
import net.minecraft.state.properties.BlockStateProperties
import net.minecraft.state.{DirectionProperty, StateContainer}
import net.minecraft.util.Direction
import net.minecraftforge.common.ToolType

class ControllerBlock extends Block(Properties.create(Material.IRON)) {

    properties.hardnessAndResistance(5f, 10f)
        .sound(SoundType.METAL)
        .harvestTool(ToolType.PICKAXE)
        .harvestLevel(1)
    setDefaultState(this.stateContainer.getBaseState.`with`(FACING, Direction.NORTH))

    override def fillStateContainer(builder: StateContainer.Builder[Block, BlockState]): Unit = {
        builder.add(FACING)
    }
}

object ControllerBlock {
    final val FACING: DirectionProperty = HorizontalBlock.HORIZONTAL_FACING
}
