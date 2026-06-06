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

    public static final Supplier<BlockEntityType<SignBlockEntity>> OLIVE_SIGN_BLOCK_ENTITY =
            BLOCK_ENTITY_TYPES.register("olive_sign", () -> BlockEntityType.Builder.of(SignBlockEntity::new,
                            ModBlocks.OLIVE_SIGN.get(),
                            ModBlocks.OLIVE_WALL_SIGN.get()).build(null));

    public static void register(IEventBus modEventBus) {
        BLOCK_ENTITY_TYPES.register(modEventBus);
    }
}
