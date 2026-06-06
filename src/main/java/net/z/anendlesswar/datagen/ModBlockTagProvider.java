package net.z.anendlesswar.datagen;

import net.minecraft.tags.ItemTags;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.block.ModBlocks;
import net.z.anendlesswar.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AnEndlessWar.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TIN_BLOCK.get())
                .add(ModBlocks.TIN_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_ORE.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.OLIVE_LOG.get())
                .add(ModBlocks.OLIVE_WOOD.get())
                .add(ModBlocks.STRIPPED_OLIVE_LOG.get())
                .add(ModBlocks.STRIPPED_OLIVE_WOOD.get())
                .add(ModBlocks.SACRED_OLIVE_LOG.get())
                .add(ModBlocks.SACRED_OLIVE_WOOD.get())
                .add(ModBlocks.STRIPPED_SACRED_OLIVE_LOG.get())
                .add(ModBlocks.STRIPPED_SACRED_OLIVE_WOOD.get())
                .add(ModBlocks.OLIVE_PLANKS.get())
                .add(ModBlocks.SACRED_OLIVE_PLANKS.get())
                .add(ModBlocks.OLIVE_SLAB.get())
                .add(ModBlocks.OLIVE_STAIRS.get())
                .add(ModBlocks.OLIVE_SIGN.get())
                .add(ModBlocks.OLIVE_FENCE.get())
                .add(ModBlocks.OLIVE_FENCE_GATE.get())
                .add(ModBlocks.OLIVE_DOOR.get())
                .add(ModBlocks.OLIVE_TRAPDOOR.get())
                .add(ModBlocks.OLIVE_PRESSURE_PLATE.get())
                .add(ModBlocks.OLIVE_BUTTON.get());

        tag(BlockTags.FENCES).add(ModBlocks.OLIVE_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.OLIVE_FENCE_GATE.get());

        this.tag(BlockTags.LOGS)
                .add(ModBlocks.OLIVE_LOG.get())
                .add(ModBlocks.OLIVE_WOOD.get())
                .add(ModBlocks.STRIPPED_OLIVE_LOG.get())
                .add(ModBlocks.STRIPPED_OLIVE_WOOD.get())
                .add(ModBlocks.SACRED_OLIVE_LOG.get())
                .add(ModBlocks.SACRED_OLIVE_WOOD.get())
                .add(ModBlocks.STRIPPED_SACRED_OLIVE_LOG.get())
                .add(ModBlocks.STRIPPED_SACRED_OLIVE_WOOD.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.OLIVE_LOG.get())
                .add(ModBlocks.OLIVE_WOOD.get())
                .add(ModBlocks.STRIPPED_OLIVE_LOG.get())
                .add(ModBlocks.STRIPPED_OLIVE_WOOD.get())
                .add(ModBlocks.SACRED_OLIVE_LOG.get())
                .add(ModBlocks.SACRED_OLIVE_WOOD.get())
                .add(ModBlocks.STRIPPED_SACRED_OLIVE_LOG.get())
                .add(ModBlocks.STRIPPED_SACRED_OLIVE_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.OLIVE_PLANKS.get())
                .add(ModBlocks.SACRED_OLIVE_PLANKS.get());

        this.tag(BlockTags.SIGNS)
                .add(ModBlocks.OLIVE_SIGN.get());

        this.tag(BlockTags.WALL_SIGNS)
                .add(ModBlocks.OLIVE_WALL_SIGN.get());

    }
}