package net.z.anendlesswar.util;

import net.z.anendlesswar.AnEndlessWar;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        // BRONZE TOOLS & EVO
        public static final TagKey<Block> NEEDS_BRONZE_TOOL = createTag("needs_bronze_tool");
        public static final TagKey<Block> INCORRECT_FOR_BRONZE_TOOL = createTag("incorrect_for_bronze_tool");

        public static final TagKey<Block> NEEDS_BRONSRUN_TOOL = createTag("needs_bronsrun_tool");
        public static final TagKey<Block> INCORRECT_FOR_BRONSRUN_TOOL = createTag("incorrect_for_bronsrun_tool");

        // KHARVAK TOOLS & EVO
        public static final TagKey<Block> NEEDS_KHARVAK_IRON_TOOL = createTag("needs_kharvak_iron_tool");
        public static final TagKey<Block> INCORRECT_FOR_KHARVAK_IRON_TOOL = createTag("incorrect_for_kharvak_iron_tool");

        public static final TagKey<Block> NEEDS_WHAT_REMAINS_TOOL = createTag("needs_what_remains_tool");
        public static final TagKey<Block> INCORRECT_FOR_WHAT_REMAINS_TOOL = createTag("incorrect_for_what_remains_tool");

        // SILVER TOOLS & EVO
        public static final TagKey<Block> NEEDS_SILVER_TOOL = createTag("needs_kharvak_iron_tool");
        public static final TagKey<Block> INCORRECT_FOR_SILVER_TOOL = createTag("incorrect_for_kharvak_iron_tool");

        public static final TagKey<Block> NEEDS_OLIVA_ARGENTEA_TOOL = createTag("needs_oliva_argentea_tool");
        public static final TagKey<Block> INCORRECT_FOR_OLIVA_ARGENTEA_TOOL = createTag("incorrect_oliva_argentea_tool");

        // SOLRA TOOLS & EVO
        public static final TagKey<Block> NEEDS_SOLRA_TOOL = createTag("needs_kharvak_iron_tool");
        public static final TagKey<Block> INCORRECT_FOR_SOLRA_TOOL = createTag("incorrect_for_kharvak_iron_tool");

        public static final TagKey<Block> NEEDS_PTAHTITE_TOOL = createTag("needs_ptahtite_tool");
        public static final TagKey<Block> INCORRECT_FOR_PTAHTITE_TOOL = createTag("incorrect_ptahtite_tool");


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(AnEndlessWar.MODID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(AnEndlessWar.MODID, name));
        }
    }
}