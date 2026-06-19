package net.z.anendlesswar.block.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.z.anendlesswar.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;

public class AuricSandBlock extends ColoredFallingBlock {
    public static final int MAX_WETTING_TICKS = 2;
    public static final IntegerProperty WETTING_PROGRESS =
            IntegerProperty.create("wetting_progress", 0, MAX_WETTING_TICKS);

    public AuricSandBlock(ColorRGBA dustColor, net.minecraft.world.level.block.state.BlockBehaviour.Properties properties) {
        super(dustColor, properties.randomTicks());
        this.registerDefaultState(
                this.stateDefinition.any().setValue(WETTING_PROGRESS, 0)
        );
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(WETTING_PROGRESS);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {

        if (!isNextToWater(level, pos)) {
            if (state.getValue(WETTING_PROGRESS) != 0) {
                level.setBlock(pos, state.setValue(WETTING_PROGRESS, 0), 3);
            }
            return;
        }

        int progress = state.getValue(WETTING_PROGRESS);

        int threshold = 1 + random.nextInt(2); // 1 o 2

        if (progress + 1 >= threshold) {
            // cambiar a wet auric
            level.sendParticles(ParticleTypes.CLOUD,
                    pos.getX() + 0.5,
                    pos.getY(),
                    pos.getZ() + 0.5,
                    13,
                    0, 0, 0,
                    0.02
            );
            level.playSound(null, pos, SoundEvents.AXOLOTL_IDLE_WATER, SoundSource.BLOCKS, 1.0f, 1.0f);
            level.setBlock(pos, ModBlocks.WET_AURIC_SAND.get().defaultBlockState(), 3);
        } else {
            // avanzar estado
            level.setBlock(pos, state.setValue(WETTING_PROGRESS, progress + 1), 3);
        }
    }

    @Override
    public BlockState updateShape(
            BlockState state,
            Direction direction,
            BlockState neighborState,
            LevelAccessor level,
            BlockPos pos,
            BlockPos neighborPos) {

        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    private boolean isNextToWater(LevelAccessor level, BlockPos pos) {
        FluidState fluidAtPos = level.getFluidState(pos);
        if (fluidAtPos.is(Fluids.WATER) || fluidAtPos.is(Fluids.FLOWING_WATER)) {
            return true;
        }
        for (Direction dir : Direction.values()) {
            BlockPos neighbor = pos.relative(dir);
            FluidState fluid = level.getFluidState(neighbor);
            if (fluid.is(Fluids.WATER) || fluid.is(Fluids.FLOWING_WATER)) {
                return true;
            }
            if (level.getBlockState(neighbor).is(Blocks.WATER)) {
                return true;
            }
        }
        return false;
    }
}