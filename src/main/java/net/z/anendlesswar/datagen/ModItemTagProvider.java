package net.z.anendlesswar.datagen;

import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.block.ModBlocks;
import net.z.anendlesswar.item.ModItems;
import net.z.anendlesswar.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, AnEndlessWar.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.LOGS)
                .add(ModBlocks.OLIVE_LOG.get().asItem())
                .add(ModBlocks.OLIVE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_OLIVE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_OLIVE_WOOD.get().asItem())
                .add(ModBlocks.SACRED_OLIVE_LOG.get().asItem())
                .add(ModBlocks.SACRED_OLIVE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_SACRED_OLIVE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_SACRED_OLIVE_WOOD.get().asItem());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.OLIVE_LOG.get().asItem())
                .add(ModBlocks.OLIVE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_OLIVE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_OLIVE_WOOD.get().asItem())
                .add(ModBlocks.SACRED_OLIVE_LOG.get().asItem())
                .add(ModBlocks.SACRED_OLIVE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_SACRED_OLIVE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_SACRED_OLIVE_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.OLIVE_PLANKS.asItem())
                .add(ModBlocks.SACRED_OLIVE_PLANKS.asItem());


    }
}