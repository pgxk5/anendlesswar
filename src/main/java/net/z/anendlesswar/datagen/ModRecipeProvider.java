package net.z.anendlesswar.datagen;

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

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> TIN_SMELTABLES = List.of(ModItems.CRUSHED_TIN);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TIN_INGOT.get())
                .unlockedBy("has_tin_ingot", has(ModItems.TIN_INGOT)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 9)
                .requires(ModBlocks.TIN_BLOCK)
                .unlockedBy("has_tin_ingot_block", has(ModBlocks.TIN_BLOCK)).save(recipeOutput);



        oreSmelting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.5f, 200, "tin");
        oreBlasting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.5f, 100, "tin");
/*
        stairBuilder(ModBlocks.OLIVE_STAIRS.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS)).group("olive_planks")
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLIVE_SLAB.get(), ModBlocks.OLIVE_PLANKS.get());

        buttonBuilder(ModBlocks.OLIVE_BUTTON.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS.get())).group("olive_planks")
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.OLIVE_PRESSURE_PLATE.get(), ModBlocks.OLIVE_PLANKS.get());

        fenceBuilder(ModBlocks.OLIVE_FENCE.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS.get())).group("olive_planks")
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.OLIVE_FENCE_GATE.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS.get())).group("olive_planks")
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS.get())).save(recipeOutput);

        doorBuilder(ModBlocks.OLIVE_DOOR.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS.get())).group("olive_planks")
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.OLIVE_TRAPDOOR.get(), Ingredient.of(ModBlocks.OLIVE_PLANKS.get())).group("olive_planks")
                .unlockedBy("has_olive_planks", has(ModBlocks.OLIVE_PLANKS.get())).save(recipeOutput);
*/
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