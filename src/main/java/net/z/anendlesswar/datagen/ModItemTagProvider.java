package net.z.anendlesswar.datagen;

import net.minecraft.world.item.Item;
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
        this.tag(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.OLIVE_SLAB.asItem())
                .add(ModBlocks.SACRED_OLIVE_SLAB.asItem());
        this.tag(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.OLIVE_STAIRS.asItem())
                .add(ModBlocks.SACRED_OLIVE_STAIRS.asItem());
        this.tag(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.OLIVE_BUTTON.asItem())
                .add(ModBlocks.SACRED_OLIVE_BUTTON.asItem());
        this.tag(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.OLIVE_DOOR.asItem())
                .add(ModBlocks.SACRED_OLIVE_DOOR.asItem());
        this.tag(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.OLIVE_FENCE.asItem())
                .add(ModBlocks.SACRED_OLIVE_FENCE.asItem());
        this.tag(ItemTags.FENCE_GATES)
                .add(ModBlocks.OLIVE_FENCE_GATE.asItem())
                .add(ModBlocks.SACRED_OLIVE_FENCE_GATE.asItem());
        this.tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.OLIVE_PRESSURE_PLATE.asItem())
                .add(ModBlocks.SACRED_OLIVE_PRESSURE_PLATE.asItem());
        this.tag(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.OLIVE_TRAPDOOR.asItem())
                .add(ModBlocks.SACRED_OLIVE_TRAPDOOR.asItem());
        this.tag(ItemTags.SIGNS)
                .add(ModBlocks.OLIVE_SIGN.asItem())
                .add(ModBlocks.SACRED_OLIVE_SIGN.asItem());
        this.tag(ItemTags.HANGING_SIGNS)
                .add(ModItems.OLIVE_HANGING_SIGN.get())
                .add(ModItems.SACRED_OLIVE_HANGING_SIGN.get());
        this.tag(ItemTags.LEAVES)
                .add(ModBlocks.OLIVE_LEAVES.asItem())
                .add(ModBlocks.SACRED_OLIVE_LEAVES.asItem());
        this.tag(ItemTags.SAND)
                .add(ModBlocks.AURIC_SAND.asItem())
                .add(ModBlocks.WET_AURIC_SAND.asItem());
        tag(ItemTags.SWORDS)
                .add(ModItems.BRONZE_SWORD.get())
                .add(ModItems.BRONSRUN_SWORD.get())
                .add(ModItems.KHARVAK_IRON_SWORD.get())
                .add(ModItems.WHAT_REMAINS_WARBLADE.get())
                .add(ModItems.WHAT_REMAINS_FANG.get())
                .add(ModItems.SILVER_LONGSWORD.get())
                .add(ModItems.OLIVA_ARGENTEA_TEMPLAR_SWORD.get())
                .add(ModItems.LIGHT_OF_JERUSALEM.get())
                .add(ModItems.SOLRA_SWORD.get())
                .add(ModItems.PTAHTITE_LONGSWORD.get());
        tag(ItemTags.BOW_ENCHANTABLE)
                .add(ModItems.NEITHS_LONGBOW.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.BRONZE_PICKAXE.get())
                .add(ModItems.BRONSRUN_PICKAXE.get())
                .add(ModItems.KHARVAK_IRON_PICKAXE.get())
                .add(ModItems.WHAT_REMAINS_PICKAXE.get())
                .add(ModItems.SILVER_PICKAXE.get())
                .add(ModItems.OLIVA_ARGENTEA_PICKAXE.get())
                .add(ModItems.SOLRA_PICKAXE.get())
                .add(ModItems.PTAHTITE_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.BRONZE_GREATAXE.get())
                .add(ModItems.BRONSRUN_GREATAXE.get())
                .add(ModItems.BONEBREAKER.get())
                .add(ModItems.KHARVAK_IRON_AXE.get())
                .add(ModItems.WHAT_REMAINS_AXE.get())
                .add(ModItems.SILVER_AXE.get())
                .add(ModItems.OLIVA_ARGENTEA_BATTLEAXE.get())
                .add(ModItems.SOLRA_AXE.get())
                .add(ModItems.PTAHTITE_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.BRONZE_SHOVEL.get())
                .add(ModItems.BRONSRUN_SHOVEL.get())
                .add(ModItems.KHARVAK_IRON_SHOVEL.get())
                .add(ModItems.WHAT_REMAINS_SHOVEL.get())
                .add(ModItems.SILVER_SHOVEL.get())
                .add(ModItems.OLIVA_ARGENTEA_SHOVEL.get())
                .add(ModItems.SOLRA_SHOVEL.get())
                .add(ModItems.PTAHTITE_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.BRONZE_HOE.get())
                .add(ModItems.BRONSRUN_HOE.get())
                .add(ModItems.KHARVAK_IRON_HOE.get())
                .add(ModItems.WHAT_REMAINS_HOE.get())
                .add(ModItems.SILVER_HOE.get())
                .add(ModItems.OLIVA_ARGENTEA_HOE.get())
                .add(ModItems.SOLRA_HOE.get())
                .add(ModItems.PTAHTITE_HOE.get());
    }
}