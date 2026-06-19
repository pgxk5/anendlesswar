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
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.VORGRAN_COAL_ORE.get())
                .add(ModBlocks.VORGRAN_COAL_BLOCK.get())

                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.GALENA_ORE.get())
                .add(ModBlocks.SOLRA_ORE.get())
                .add(ModBlocks.REMNANT_CONTAMINATED_BIG_BONE.get())

                .add(ModBlocks.TIN_BLOCK.get())
                .add(ModBlocks.BRONZE_BLOCK.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.KHARVAK_IRON_BLOCK.get())
                .add(ModBlocks.SOLRA_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.AURIC_SAND.get())
                .add(ModBlocks.WET_AURIC_SAND.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.GALENA_ORE.get())
                .add(ModBlocks.SOLRA_ORE.get())

                .add(ModBlocks.VORGRAN_COAL_ORE.get())
                .add(ModBlocks.VORGRAN_COAL_BLOCK.get())

                .add(ModBlocks.TIN_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BRONZE_BLOCK.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.KHARVAK_IRON_BLOCK.get())
                .add(ModBlocks.SOLRA_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
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
                .add(ModBlocks.OLIVE_BUTTON.get())
                .add(ModBlocks.SACRED_OLIVE_SLAB.get())
                .add(ModBlocks.SACRED_OLIVE_STAIRS.get())
                .add(ModBlocks.SACRED_OLIVE_SIGN.get())
                .add(ModBlocks.SACRED_OLIVE_FENCE.get())
                .add(ModBlocks.SACRED_OLIVE_FENCE_GATE.get())
                .add(ModBlocks.SACRED_OLIVE_DOOR.get())
                .add(ModBlocks.SACRED_OLIVE_TRAPDOOR.get())
                .add(ModBlocks.SACRED_OLIVE_PRESSURE_PLATE.get())
                .add(ModBlocks.SACRED_OLIVE_BUTTON.get());

        this.tag(BlockTags.SAND)
                .add(ModBlocks.AURIC_SAND.get())
                .add(ModBlocks.WET_AURIC_SAND.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.OLIVE_FENCE.get())
                .add(ModBlocks.SACRED_OLIVE_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.OLIVE_FENCE_GATE.get())
                .add(ModBlocks.SACRED_OLIVE_FENCE_GATE.get());

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
        this.tag(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.OLIVE_SLAB.get())
                .add(ModBlocks.SACRED_OLIVE_SLAB.get());
        this.tag(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.OLIVE_STAIRS.get())
                .add(ModBlocks.SACRED_OLIVE_STAIRS.get());
        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.OLIVE_BUTTON.get())
                .add(ModBlocks.SACRED_OLIVE_BUTTON.get());
        this.tag(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.OLIVE_DOOR.get())
                .add(ModBlocks.SACRED_OLIVE_DOOR.get());
        this.tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.OLIVE_FENCE.get())
                .add(ModBlocks.SACRED_OLIVE_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.OLIVE_FENCE_GATE.get())
                .add(ModBlocks.SACRED_OLIVE_FENCE_GATE.get());
        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.OLIVE_PRESSURE_PLATE.get())
                .add(ModBlocks.SACRED_OLIVE_PRESSURE_PLATE.get());
        this.tag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.OLIVE_TRAPDOOR.get())
                .add(ModBlocks.SACRED_OLIVE_TRAPDOOR.get());

        this.tag(BlockTags.SIGNS)
                .add(ModBlocks.OLIVE_SIGN.get())
                .add(ModBlocks.SACRED_OLIVE_SIGN.get());
        this.tag(BlockTags.WALL_SIGNS)
                .add(ModBlocks.OLIVE_WALL_SIGN.get())
                .add(ModBlocks.SACRED_OLIVE_WALL_SIGN.get());
        this.tag(BlockTags.CEILING_HANGING_SIGNS)
                .add(ModBlocks.OLIVE_HANGING_SIGN.get())
                .add(ModBlocks.SACRED_OLIVE_HANGING_SIGN.get());
        this.tag(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.OLIVE_WALL_HANGING_SIGN.get())
                .add(ModBlocks.SACRED_OLIVE_WALL_HANGING_SIGN.get());
        this.tag(BlockTags.LEAVES)
                .add(ModBlocks.OLIVE_LEAVES.get())
                .add(ModBlocks.SACRED_OLIVE_LEAVES.get());

        // BRONZE
        tag(ModTags.Blocks.NEEDS_BRONZE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_BRONZE_TOOL);

        //BRONSRUN
        tag(ModTags.Blocks.NEEDS_BRONSRUN_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_BRONSRUN_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_BRONSRUN_TOOL);

        // KHARVAK IRON
        tag(ModTags.Blocks.NEEDS_KHARVAK_IRON_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        tag(ModTags.Blocks.INCORRECT_FOR_KHARVAK_IRON_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_KHARVAK_IRON_TOOL);

        // WHAT REMAINS
        tag(ModTags.Blocks.NEEDS_WHAT_REMAINS_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(ModTags.Blocks.INCORRECT_FOR_WHAT_REMAINS_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_WHAT_REMAINS_TOOL);

        // SILVER
        tag(ModTags.Blocks.NEEDS_SILVER_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        tag(ModTags.Blocks.INCORRECT_FOR_SILVER_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_SILVER_TOOL);

        // OLIVA ARGENTEA
        tag(ModTags.Blocks.NEEDS_OLIVA_ARGENTEA_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(ModTags.Blocks.INCORRECT_FOR_OLIVA_ARGENTEA_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_OLIVA_ARGENTEA_TOOL);

        // SOLRA
        tag(ModTags.Blocks.NEEDS_SOLRA_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        tag(ModTags.Blocks.INCORRECT_FOR_SOLRA_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_SOLRA_TOOL);

        // PTAHTITE
        tag(ModTags.Blocks.NEEDS_PTAHTITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(ModTags.Blocks.INCORRECT_FOR_PTAHTITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEEDS_PTAHTITE_TOOL);

    }
}