package net.z.anendlesswar.datagen;

import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AnEndlessWar.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        logBlock(((RotatedPillarBlock) ModBlocks.OLIVE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.OLIVE_WOOD.get()), blockTexture(ModBlocks.OLIVE_LOG.get()), blockTexture(ModBlocks.OLIVE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_OLIVE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_OLIVE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_OLIVE_LOG.get()), blockTexture(ModBlocks.STRIPPED_OLIVE_LOG.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.SACRED_OLIVE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SACRED_OLIVE_WOOD.get()), blockTexture(ModBlocks.SACRED_OLIVE_LOG.get()), blockTexture(ModBlocks.SACRED_OLIVE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_SACRED_OLIVE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_SACRED_OLIVE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_SACRED_OLIVE_LOG.get()), blockTexture(ModBlocks.STRIPPED_SACRED_OLIVE_LOG.get()));


        blockItem(ModBlocks.OLIVE_LOG);
        blockItem(ModBlocks.OLIVE_WOOD);
        blockItem(ModBlocks.STRIPPED_OLIVE_LOG);
        blockItem(ModBlocks.STRIPPED_OLIVE_WOOD);

        blockWithItem(ModBlocks.OLIVE_PLANKS);

        leavesBlock(ModBlocks.OLIVE_LEAVES);
        saplingBlock(ModBlocks.OLIVE_SAPLING);

        blockItem(ModBlocks.SACRED_OLIVE_LOG);
        blockItem(ModBlocks.SACRED_OLIVE_WOOD);
        blockItem(ModBlocks.STRIPPED_SACRED_OLIVE_LOG);
        blockItem(ModBlocks.STRIPPED_SACRED_OLIVE_WOOD);

        blockWithItem(ModBlocks.SACRED_OLIVE_PLANKS);

        leavesBlock(ModBlocks.SACRED_OLIVE_LEAVES);
        blockWithItem(ModBlocks.TIN_BLOCK);

        blockWithItem(ModBlocks.TIN_ORE);

        stairsBlock(ModBlocks.OLIVE_STAIRS.get(), blockTexture(ModBlocks.OLIVE_PLANKS.get()));
        slabBlock(ModBlocks.OLIVE_SLAB.get(), blockTexture(ModBlocks.OLIVE_PLANKS.get()), blockTexture(ModBlocks.OLIVE_PLANKS.get()));

        buttonBlock(ModBlocks.OLIVE_BUTTON.get(), blockTexture(ModBlocks.OLIVE_PLANKS.get()));
        pressurePlateBlock(ModBlocks.OLIVE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.OLIVE_PLANKS.get()));

        fenceBlock(ModBlocks.OLIVE_FENCE.get(), blockTexture(ModBlocks.OLIVE_PLANKS.get()));
        fenceGateBlock(ModBlocks.OLIVE_FENCE_GATE.get(), blockTexture(ModBlocks.OLIVE_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.OLIVE_DOOR.get(), modLoc("block/olive_door_bottom"), modLoc("block/olive_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.OLIVE_TRAPDOOR.get(), modLoc("block/olive_trapdoor"), true, "cutout");

        blockItem(ModBlocks.OLIVE_STAIRS);
        blockItem(ModBlocks.OLIVE_SLAB);
        blockItem(ModBlocks.OLIVE_PRESSURE_PLATE);
        blockItem(ModBlocks.OLIVE_FENCE_GATE);
        blockItem(ModBlocks.OLIVE_TRAPDOOR, "_bottom");

        signBlock(ModBlocks.OLIVE_SIGN.get(), ModBlocks.OLIVE_WALL_SIGN.get(),
                blockTexture(ModBlocks.OLIVE_PLANKS.get()));
    }

    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }


    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("anendlesswar:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("anendlesswar:block/" + deferredBlock.getId().getPath() + appendix));
    }

}
