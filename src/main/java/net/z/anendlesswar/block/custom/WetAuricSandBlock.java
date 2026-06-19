package net.z.anendlesswar.block.custom;


import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.ColorRGBA;
import net.z.anendlesswar.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.core.Direction;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.Blocks;

public class WetAuricSandBlock extends ColoredFallingBlock {

    /**
     * Propiedad que acumula "ticks de sol" recibidos (0 a MAX_DRYING_TICKS).
     * Usamos BlockState para que sea persistente aunque el chunk se descargue.
     *
     * RandomTick ocurre ~cada 68 segundos en promedio (con tickSpeed=3).
     * Necesitamos entre 3 y 5 minutos = 180-300 segundos ≈ 2-4 random ticks.
     * Usamos la propiedad para acumular y aleatorizar dentro de ese rango.
     *
     * Rango elegido: se seca al llegar a un valor entre 3 y 5 ticks solares.
     * Cada chunk recibe un random tick ~cada 68s, así 3 ticks = ~3.4 min, 5 ticks = ~5.6 min.
     */
    public static final int MAX_DRYING_TICKS = 5;
    public static final IntegerProperty DRYING_PROGRESS =
            IntegerProperty.create("drying_progress", 0, MAX_DRYING_TICKS);

    public WetAuricSandBlock(ColorRGBA dustColor, Properties properties) {
        super(dustColor, properties.randomTicks());
        this.registerDefaultState(
                this.stateDefinition.any().setValue(DRYING_PROGRESS, 0)
        );
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DRYING_PROGRESS);
    }

    /**
     * cada 68 segundos
     * solo avanzamos el secado si:
     *   1. es de día (dayTime entre 0 y 12000)
     *   2. el bloque tiene visión del cielo (no está bajo techo)
     *   3. no está en contacto con agua (si toca agua, resetea el progreso)
     */
    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        long dayTime = level.getDayTime() % 24000L;
        boolean isDaytime = dayTime >= 0 && dayTime < 12000;

        if (!isDaytime) return;

        if (!level.canSeeSky(pos.above())) return;

        if (level.isRaining() && level.canSeeSky(pos)) return;

        int progress = state.getValue(DRYING_PROGRESS);

        int threshold = 3 + random.nextInt(3);

        if (progress + 1 >= threshold) {
            // convertir en solra
            level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE,
                    pos.getX() + 0.5,
                    pos.getY(),
                    pos.getZ() + 0.5,
                    14,
                    0.1, 0.1, 0,
                    0.03
                    );
            level.playSound(null, pos, SoundEvents.GENERIC_EXTINGUISH_FIRE, SoundSource.BLOCKS, 1.0f, 1.0f);
            level.setBlock(pos, ModBlocks.SOLRA_ORE.get().defaultBlockState(), 3);
        } else {
            // avanzar estado
            level.setBlock(pos, state.setValue(DRYING_PROGRESS, progress + 1), 3);
        }
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (isNextToWater(level, pos) && state.getValue(DRYING_PROGRESS) != 0) {
            level.setBlock(pos, state.setValue(DRYING_PROGRESS, 0), 3);
        }
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

