package net.z.anendlesswar.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.z.anendlesswar.util.ModTags;

public class ModToolTiers {

    public static final Tier BRONZE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL,
            125, 7.5F, 3.0F, 25, () -> Ingredient.of(ModItems.BRONZE_INGOT));

    public static final Tier BRONSRUN = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BRONSRUN_TOOL,
            4062, 20.0F, 7.0F, 30, () -> Ingredient.of(ModItems.HELSHARD));

    public static final Tier KHARVAK_IRON = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_KHARVAK_IRON_TOOL,
            125, 7.5F, 3.0F, 25, () -> Ingredient.of(ModItems.KHARVAK_IRON_INGOT));

    public static final Tier WHAT_REMAINS = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_WHAT_REMAINS_TOOL,
            4062, 20.0F, 7.0F, 30, () -> Ingredient.of(ModItems.REMNANT_CONTAMINATED_BONE));

    public static final Tier SILVER = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SILVER_TOOL,
            125, 7.5F, 3.0F, 25, () -> Ingredient.of(ModItems.SILVER_INGOT));

    public static final Tier OLIVA_ARGENTEA = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_OLIVA_ARGENTEA_TOOL,
            4062, 20.0F, 7.0F, 30, () -> Ingredient.of(ModItems.SACRED_OLIVE_BRANCH));

    public static final Tier SOLRA = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SOLRA_TOOL,
            125, 7.5F, 3.0F, 25, () -> Ingredient.of(ModItems.SOLRA_INGOT));

    public static final Tier PTAHTITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_PTAHTITE_TOOL,
            4062, 20.0F, 7.0F, 30, () -> Ingredient.of(ModItems.PTAHS_DISC));

}
