package net.z.anendlesswar.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.ColorRGBA;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.block.custom.*;
import net.z.anendlesswar.block.entities.ModBlockEntities;
import net.z.anendlesswar.item.ModItems;
import net.z.anendlesswar.util.ModWoodTypes;
import net.z.anendlesswar.worldgen.tree.ModTreeGrowers;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(AnEndlessWar.MODID);

    public static final DeferredBlock<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 2.0F)));

    public static final DeferredBlock<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 5.0F)));

    public static final DeferredBlock<Block> GALENA_ORE = registerBlock("galena_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 2.0F)));

    public static final DeferredBlock<Block> RAW_GALENA_BLOCK = registerBlock("raw_galena_block",
            () -> new Block(BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(4.0F, 5.0F)));

    public static final DeferredBlock<Block> SOLRA_ORE = registerBlock("solra_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.0F, 1.5F)));

    public static final DeferredBlock<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(2.5F, 2.0F)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.COW_BELL)
                    .requiresCorrectToolForDrops()
                    .strength(3F, 3F)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(NoteBlockInstrument.BELL)
                    .requiresCorrectToolForDrops()
                    .strength(3F, 3F)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> KHARVAK_IRON_BLOCK = registerBlock("kharvak_iron_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.BIT)
                    .requiresCorrectToolForDrops()
                    .strength(3F, 3F)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> SOLRA_BLOCK = registerBlock("solra_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.BELL)
                    .requiresCorrectToolForDrops()
                    .strength(3F, 3F)
                    .sound(SoundType.METAL)));


    public static final DeferredBlock<Block> VORGRAN_COAL_ORE = registerBlock("vorgran_coal_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(2.6F, 1.5F)));

    public static final DeferredBlock<Block> VORGRAN_COAL_BLOCK = registerBlock("vorgran_coal_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(8.0F, 12.0F)));

    public static final DeferredBlock<Block> AURIC_SAND = registerBlock("auric_sand",
            () -> new AuricSandBlock(new ColorRGBA(14595422), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sound(SoundType.SAND)));

    public static final DeferredBlock<Block> WET_AURIC_SAND = registerBlock("wet_auric_sand",
            () -> new WetAuricSandBlock(new ColorRGBA(12690007), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.8F)
                    .sound(SoundType.SAND)));

    public static final DeferredBlock<RotatedPillarBlock> REMNANT_CONTAMINATED_BIG_BONE = registerBlock("remnant_contaminated_big_bone",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(16.6F, 666F)
                    .sound(SoundType.BONE_BLOCK)));


    public static final DeferredBlock<Block> OLIVE_LOG = registerBlock("olive_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> OLIVE_WOOD = registerBlock("olive_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));

    public static final DeferredBlock<Block> STRIPPED_OLIVE_LOG = registerBlock("stripped_olive_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));

    public static final DeferredBlock<Block> STRIPPED_OLIVE_WOOD = registerBlock("stripped_olive_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final DeferredBlock<Block> OLIVE_PLANKS = registerBlock("olive_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 35;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 25;
                }
            });

    public static final DeferredBlock<Block> OLIVE_LEAVES = registerBlock("olive_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final DeferredBlock<Block> SACRED_OLIVE_LEAVES = registerBlock("sacred_olive_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final DeferredBlock<Block> OLIVE_SAPLING = registerBlock("olive_sapling",
            () -> new SaplingBlock(ModTreeGrowers.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    public static final DeferredBlock<Block> SACRED_OLIVE_LOG = registerBlock("sacred_olive_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));

    public static final DeferredBlock<Block> SACRED_OLIVE_WOOD = registerBlock("sacred_olive_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));

    public static final DeferredBlock<Block> STRIPPED_SACRED_OLIVE_LOG = registerBlock("stripped_sacred_olive_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));

    public static final DeferredBlock<Block> STRIPPED_SACRED_OLIVE_WOOD = registerBlock("stripped_sacred_olive_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));

    public static final DeferredBlock<Block> SACRED_OLIVE_PLANKS = registerBlock("sacred_olive_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 35;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 25;
                }
            });


    public static final DeferredBlock<StairBlock> OLIVE_STAIRS = registerBlock("olive_stairs",
            () -> new StairBlock(ModBlocks.OLIVE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));

    public static final DeferredBlock<SlabBlock> OLIVE_SLAB = registerBlock("olive_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> OLIVE_PRESSURE_PLATE = registerBlock("olive_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> OLIVE_BUTTON = registerBlock("olive_button",
            () -> new ButtonBlock(BlockSetType.OAK, 15, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));

    public static final DeferredBlock<FenceBlock> OLIVE_FENCE = registerBlock("olive_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> OLIVE_FENCE_GATE = registerBlock("olive_fence_gate",
            () -> new FenceGateBlock(ModWoodTypes.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> OLIVE_DOOR = registerBlock("olive_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> OLIVE_TRAPDOOR = registerBlock("olive_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<ModStandingSignBlock> OLIVE_SIGN = registerBlockWithoutItem("olive_sign",
            () -> new ModStandingSignBlock(ModWoodTypes.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<ModWallSignBlock> OLIVE_WALL_SIGN = registerBlockWithoutItem("olive_wall_sign",
            () -> new ModWallSignBlock(ModWoodTypes.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));

    public static final DeferredBlock<ModHangingSignBlock> OLIVE_HANGING_SIGN = registerBlockWithoutItem("olive_hanging_sign",
            () -> new ModHangingSignBlock(ModWoodTypes.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<ModWallHangingSignBlock> OLIVE_WALL_HANGING_SIGN = registerBlockWithoutItem("olive_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(ModWoodTypes.OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final DeferredBlock<StairBlock> SACRED_OLIVE_STAIRS = registerBlock("sacred_olive_stairs",
            () -> new StairBlock(ModBlocks.SACRED_OLIVE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));

    public static final DeferredBlock<SlabBlock> SACRED_OLIVE_SLAB = registerBlock("sacred_olive_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<PressurePlateBlock> SACRED_OLIVE_PRESSURE_PLATE = registerBlock("sacred_olive_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredBlock<ButtonBlock> SACRED_OLIVE_BUTTON = registerBlock("sacred_olive_button",
            () -> new ButtonBlock(BlockSetType.OAK, 15, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));

    public static final DeferredBlock<FenceBlock> SACRED_OLIVE_FENCE = registerBlock("sacred_olive_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredBlock<FenceGateBlock> SACRED_OLIVE_FENCE_GATE = registerBlock("sacred_olive_fence_gate",
            () -> new FenceGateBlock(ModWoodTypes.SACRED_OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));

    public static final DeferredBlock<DoorBlock> SACRED_OLIVE_DOOR = registerBlock("sacred_olive_door",
            () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredBlock<TrapDoorBlock> SACRED_OLIVE_TRAPDOOR = registerBlock("sacred_olive_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));

    public static final DeferredBlock<ModStandingSignBlock> SACRED_OLIVE_SIGN = registerBlockWithoutItem("sacred_olive_sign",
            () -> new ModStandingSignBlock(ModWoodTypes.SACRED_OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredBlock<ModWallSignBlock> SACRED_OLIVE_WALL_SIGN = registerBlockWithoutItem("sacred_olive_wall_sign",
            () -> new ModWallSignBlock(ModWoodTypes.SACRED_OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));

    public static final DeferredBlock<ModHangingSignBlock> SACRED_OLIVE_HANGING_SIGN = registerBlockWithoutItem("sacred_olive_hanging_sign",
            () -> new ModHangingSignBlock(ModWoodTypes.SACRED_OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredBlock<ModWallHangingSignBlock> SACRED_OLIVE_WALL_HANGING_SIGN = registerBlockWithoutItem("sacred_olive_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(ModWoodTypes.SACRED_OLIVE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> DeferredBlock<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
}
