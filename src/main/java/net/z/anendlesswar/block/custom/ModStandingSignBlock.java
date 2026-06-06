package net.z.anendlesswar.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.function.Supplier;

public class ModStandingSignBlock extends StandingSignBlock {
    private final Supplier<BlockEntityType<? extends SignBlockEntity>> blockEntityType;

    public ModStandingSignBlock(WoodType woodType, Properties properties,
                                Supplier<BlockEntityType<? extends SignBlockEntity>> blockEntityType) {
        super(woodType, properties);
        this.blockEntityType = blockEntityType;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SignBlockEntity(blockEntityType.get(), pos, state);
    }
}