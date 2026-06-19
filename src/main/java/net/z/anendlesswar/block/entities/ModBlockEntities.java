package net.z.anendlesswar.block.entities;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.block.ModBlocks;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, AnEndlessWar.MODID);

    public static final Supplier<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITY_TYPES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(
                            ModSignBlockEntity::new,
                            ModBlocks.OLIVE_SIGN.get(),
                            ModBlocks.OLIVE_WALL_SIGN.get(),
                            ModBlocks.SACRED_OLIVE_SIGN.get(),
                            ModBlocks.SACRED_OLIVE_WALL_SIGN.get()
                    ).build(null)
            );

    public static final Supplier<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITY_TYPES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(
                            ModHangingSignBlockEntity::new,
                            ModBlocks.OLIVE_HANGING_SIGN.get(),
                            ModBlocks.OLIVE_WALL_HANGING_SIGN.get(),
                            ModBlocks.SACRED_OLIVE_HANGING_SIGN.get(),
                            ModBlocks.SACRED_OLIVE_WALL_HANGING_SIGN.get()
                    ).build(null)
            );

    public static void register(IEventBus modEventBus) {
        BLOCK_ENTITY_TYPES.register(modEventBus);
    }
}
