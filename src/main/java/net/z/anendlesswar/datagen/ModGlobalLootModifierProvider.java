package net.z.anendlesswar.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.loot.FishingLootModifier;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, AnEndlessWar.MODID);
    }

    @Override
    protected void start() {
        add("fishing_loot",
                new FishingLootModifier(
                        new LootItemCondition[]{}
                )
        );
    }
}
