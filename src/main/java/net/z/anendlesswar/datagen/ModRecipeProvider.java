package net.z.anendlesswar.datagen;

import net.minecraft.world.item.Items;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.block.ModBlocks;
import net.z.anendlesswar.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static org.openjdk.nashorn.internal.runtime.Debug.id;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> TIN_SMELTABLES = List.of(ModItems.CRUSHED_TIN);
        List<ItemLike> VORGRAN_COAL_ORE_SMELTABLES = List.of(ModBlocks.VORGRAN_COAL_ORE);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TIN_INGOT.get())
                .unlockedBy("has_tin_ingot", has(ModItems.TIN_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CRUSHED_TIN.get())
                .requires(ModItems.RAW_TIN)
                .unlockedBy("has_raw_tin", has(ModItems.RAW_TIN)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                .requires(ModBlocks.TIN_BLOCK)
                .unlockedBy("has_tin_ingot_block", has(ModBlocks.TIN_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.5f, 200, "tin");
        oreBlasting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.5f, 100, "tin");

        oreSmelting(recipeOutput, VORGRAN_COAL_ORE_SMELTABLES, RecipeCategory.MISC, ModItems.VORGRAN_COAL.get(), 0.2f, 200, "vorgran_coal");
        oreBlasting(recipeOutput, VORGRAN_COAL_ORE_SMELTABLES, RecipeCategory.MISC, ModItems.VORGRAN_COAL.get(), 0.2f, 100, "vorgran_coal");

        // MINERALES:
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 9)
                .requires(ModBlocks.BRONZE_BLOCK)
                .unlockedBy("has_bronze_block", has(ModBlocks.BRONZE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BRONZE_INGOT.get())
                .unlockedBy("has_bronze_ingot", has(ModItems.BRONZE_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VORGRAN_COAL.get(), 9)
                .requires(ModBlocks.VORGRAN_COAL_BLOCK)
                .unlockedBy("has_vorgran_coal_block", has(ModBlocks.VORGRAN_COAL_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VORGRAN_COAL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.VORGRAN_COAL.get())
                .unlockedBy("has_vorgran_coal", has(ModItems.VORGRAN_COAL)).save(recipeOutput);



        // CRAFTEO TRONCOS:
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLIVE_PLANKS.get(), 4)
                .group("olive_planks")
                .requires(ModBlocks.OLIVE_LOG)
                .unlockedBy("has_olive_log", has(ModBlocks.OLIVE_LOG)).save(recipeOutput, id("olive_planks_from_olive_log"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLIVE_PLANKS.get(), 4)
                .group("olive_planks")
                .requires(ModBlocks.OLIVE_WOOD)
                .unlockedBy("has_olive_wood", has(ModBlocks.OLIVE_WOOD)).save(recipeOutput, id("olive_planks_from_olive_wood"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLIVE_PLANKS.get(), 4)
                .group("olive_planks")
                .requires(ModBlocks.STRIPPED_OLIVE_LOG)
                .unlockedBy("has_stripped_olive_log", has(ModBlocks.STRIPPED_OLIVE_LOG)).save(recipeOutput, id("olive_planks_from_stripped_olive_log"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLIVE_PLANKS.get(), 4)
                .group("olive_planks")
                .requires(ModBlocks.STRIPPED_OLIVE_WOOD)
                .unlockedBy("has_stripped_olive_wood", has(ModBlocks.STRIPPED_OLIVE_WOOD)).save(recipeOutput, id("olive_planks_from_stripped_olive_wood"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OLIVE_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.OLIVE_LOG.get())
                .unlockedBy("has_olive_log", has(ModBlocks.OLIVE_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_OLIVE_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.STRIPPED_OLIVE_LOG.get())
                .unlockedBy("has_stripped_olive_log", has(ModBlocks.STRIPPED_OLIVE_LOG)).save(recipeOutput);

        // TRONCOS OLIVO SAGRADO
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SACRED_OLIVE_PLANKS.get(), 4)
                .group("sacred_olive_planks")
                .requires(ModBlocks.SACRED_OLIVE_LOG)
                .unlockedBy("has_sacred_olive_log", has(ModBlocks.SACRED_OLIVE_LOG)).save(recipeOutput, id("sacred_olive_planks_from_sacred_olive_log"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SACRED_OLIVE_PLANKS.get(), 4)
                .group("sacred_olive_planks")
                .requires(ModBlocks.SACRED_OLIVE_WOOD)
                .unlockedBy("has_sacred_olive_wood", has(ModBlocks.SACRED_OLIVE_WOOD)).save(recipeOutput, id("sacred_olive_planks_from_sacred_olive_wood"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SACRED_OLIVE_PLANKS.get(), 4)
                .group("sacred_olive_planks")
                .requires(ModBlocks.STRIPPED_SACRED_OLIVE_LOG)
                .unlockedBy("has_stripped_sacred_olive_log", has(ModBlocks.STRIPPED_SACRED_OLIVE_LOG)).save(recipeOutput, id("sacred_olive_planks_from_stripped_sacred_olive_log"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SACRED_OLIVE_PLANKS.get(), 4)
                .group("sacred_olive_planks")
                .requires(ModBlocks.STRIPPED_SACRED_OLIVE_WOOD)
                .unlockedBy("has_stripped_sacred_olive_wood", has(ModBlocks.STRIPPED_SACRED_OLIVE_WOOD)).save(recipeOutput, id("sacred_olive_planks_from_stripped_sacred_olive_wood"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SACRED_OLIVE_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.SACRED_OLIVE_LOG.get())
                .unlockedBy("has_sacred_olive_log", has(ModBlocks.SACRED_OLIVE_LOG)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_SACRED_OLIVE_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.STRIPPED_SACRED_OLIVE_LOG.get())
                .unlockedBy("has_stripped_sacred_olive_log", has(ModBlocks.STRIPPED_SACRED_OLIVE_LOG)).save(recipeOutput);

        // BLOQUES: MADERA DE OLIVO
        stairBuilder(ModBlocks.OLIVE_STAIRS.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS))
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLIVE_SLAB.get(), ModBlocks.OLIVE_PLANKS.get());

        buttonBuilder(ModBlocks.OLIVE_BUTTON.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS.get()))
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.OLIVE_PRESSURE_PLATE.get(), ModBlocks.OLIVE_PLANKS.get());

        fenceBuilder(ModBlocks.OLIVE_FENCE.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS.get()))
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.OLIVE_FENCE_GATE.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS.get()))
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS.get())).save(recipeOutput);

        doorBuilder(ModBlocks.OLIVE_DOOR.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS.get()))
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.OLIVE_TRAPDOOR.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS.get()))
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS.get())).save(recipeOutput);
        signBuilder(ModBlocks.OLIVE_SIGN.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS.get()))
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OLIVE_HANGING_SIGN.get())
                .pattern("# #")
                .pattern("WWW")
                .pattern("WWW")
                .define('#', Items.CHAIN)
                .define('W', ModBlocks.STRIPPED_OLIVE_LOG)
                .unlockedBy("has_stripped_olive_log", has(ModBlocks.STRIPPED_OLIVE_LOG)).save(recipeOutput);

        stairBuilder(ModBlocks.SACRED_OLIVE_STAIRS.get(), Ingredient.of(ModBlocks.SACRED_OLIVE_PLANKS))
                .unlockedBy("has_sacred_olive_planks", has(ModBlocks.SACRED_OLIVE_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SACRED_OLIVE_SLAB.get(), ModBlocks.SACRED_OLIVE_PLANKS.get());

        buttonBuilder(ModBlocks.SACRED_OLIVE_BUTTON.get(), Ingredient.of(ModBlocks.SACRED_OLIVE_PLANKS.get()))
                .unlockedBy("has_sacred_olive_planks", has(ModBlocks.SACRED_OLIVE_PLANKS.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.SACRED_OLIVE_PRESSURE_PLATE.get(), ModBlocks.SACRED_OLIVE_PLANKS.get());

        fenceBuilder(ModBlocks.SACRED_OLIVE_FENCE.get(), Ingredient.of(ModBlocks.SACRED_OLIVE_PLANKS.get()))
                .unlockedBy("has_sacred_olive_planks", has(ModBlocks.SACRED_OLIVE_PLANKS.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.SACRED_OLIVE_FENCE_GATE.get(), Ingredient.of(ModBlocks.SACRED_OLIVE_PLANKS.get()))
                .unlockedBy("has_sacred_olive_planks", has(ModBlocks.SACRED_OLIVE_PLANKS.get())).save(recipeOutput);

        doorBuilder(ModBlocks.SACRED_OLIVE_DOOR.get(), Ingredient.of(ModBlocks.SACRED_OLIVE_PLANKS.get()))
                .unlockedBy("has_sacred_olive_planks", has(ModBlocks.SACRED_OLIVE_PLANKS.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.SACRED_OLIVE_TRAPDOOR.get(), Ingredient.of(ModBlocks.SACRED_OLIVE_PLANKS.get()))
                .unlockedBy("has_sacred_olive_planks", has(ModBlocks.SACRED_OLIVE_PLANKS.get())).save(recipeOutput);
        signBuilder(ModBlocks.SACRED_OLIVE_SIGN.get(), Ingredient.of(ModBlocks.SACRED_OLIVE_PLANKS.get()))
                .unlockedBy("has_sacred_olive_planks", has(ModBlocks.SACRED_OLIVE_PLANKS.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SACRED_OLIVE_HANGING_SIGN.get())
                .pattern("# #")
                .pattern("WWW")
                .pattern("WWW")
                .define('#', Items.CHAIN)
                .define('W', ModBlocks.STRIPPED_SACRED_OLIVE_LOG)
                .unlockedBy("has_stripped_sacred_olive_log", has(ModBlocks.STRIPPED_SACRED_OLIVE_LOG)).save(recipeOutput);
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, AnEndlessWar.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}