package net.z.anendlesswar.datagen;

import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.z.anendlesswar.block.ModBlocks;
import net.z.anendlesswar.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;


import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.KHARVAK_IRON_BLOCK.get());
        this.dropSelf(ModBlocks.SOLRA_BLOCK.get());

        add(ModBlocks.VORGRAN_COAL_ORE.get(),
                block -> createOreDrop(ModBlocks.VORGRAN_COAL_ORE.get(), ModItems.VORGRAN_COAL.get()));

        add(ModBlocks.TIN_ORE.get(),
                block -> createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        add(ModBlocks.GALENA_ORE.get(),
                block -> createOreDrop(ModBlocks.GALENA_ORE.get(), ModItems.RAW_GALENA.get()));
        this.dropSelf(ModBlocks.SOLRA_ORE.get());

        this.dropSelf(ModBlocks.RAW_GALENA_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK.get());

        this.dropSelf(ModBlocks.VORGRAN_COAL_BLOCK.get());

        this.dropSelf(ModBlocks.AURIC_SAND.get());
        this.dropSelf(ModBlocks.WET_AURIC_SAND.get());

        this.add(ModBlocks.REMNANT_CONTAMINATED_BIG_BONE.get(),
                        LootTable.lootTable()
                                .withPool(
                                        LootPool.lootPool()
                                                .setRolls(ConstantValue.exactly(1))
                                                .add(
                                                        LootItem.lootTableItem(ModItems.REMNANT_CONTAMINATED_BONE.get())
                                                                .when(LootItemRandomChanceCondition.randomChance(0.01F))

                                                )
                                )
                );

        this.dropSelf(ModBlocks.OLIVE_LOG.get());
        this.dropSelf(ModBlocks.OLIVE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_OLIVE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_OLIVE_WOOD.get());
        this.dropSelf(ModBlocks.OLIVE_PLANKS.get());
        this.dropSelf(ModBlocks.OLIVE_SAPLING.get());

        this.add(ModBlocks.OLIVE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.OLIVE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.SACRED_OLIVE_LOG.get());
        this.dropSelf(ModBlocks.SACRED_OLIVE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_SACRED_OLIVE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_SACRED_OLIVE_WOOD.get());
        this.dropSelf(ModBlocks.SACRED_OLIVE_PLANKS.get());
        this.add(ModBlocks.SACRED_OLIVE_LEAVES.get(),
                LootTable.lootTable()
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(ConstantValue.exactly(1))
                                        .add(
                                                LootItem.lootTableItem(ModItems.SACRED_OLIVE_BRANCH.get())
                                                        .when(LootItemRandomChanceCondition.randomChance(0.0025F))
                                        )
                        )
        );

        // BLOQUES MADERA OLIVO
        dropSelf(ModBlocks.OLIVE_STAIRS.get());
        add(ModBlocks.OLIVE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OLIVE_SLAB.get()));

        dropSelf(ModBlocks.OLIVE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.OLIVE_BUTTON.get());

        dropSelf(ModBlocks.OLIVE_FENCE.get());
        dropSelf(ModBlocks.OLIVE_FENCE_GATE.get());
        dropSelf(ModBlocks.OLIVE_TRAPDOOR.get());

        add(ModBlocks.OLIVE_DOOR.get(),
                block -> createDoorTable(ModBlocks.OLIVE_DOOR.get()));

        this.dropSelf(ModBlocks.OLIVE_SIGN.get());
        this.dropSelf(ModBlocks.OLIVE_WALL_SIGN.get());

        this.dropSelf(ModBlocks.OLIVE_HANGING_SIGN.get());
        this.dropSelf(ModBlocks.OLIVE_WALL_HANGING_SIGN.get());

        // BLOQUES MADERA OLIVO SAGRADA
        dropSelf(ModBlocks.SACRED_OLIVE_STAIRS.get());
        add(ModBlocks.SACRED_OLIVE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SACRED_OLIVE_SLAB.get()));

        dropSelf(ModBlocks.SACRED_OLIVE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SACRED_OLIVE_BUTTON.get());

        dropSelf(ModBlocks.SACRED_OLIVE_FENCE.get());
        dropSelf(ModBlocks.SACRED_OLIVE_FENCE_GATE.get());
        dropSelf(ModBlocks.SACRED_OLIVE_TRAPDOOR.get());

        add(ModBlocks.SACRED_OLIVE_DOOR.get(),
                block -> createDoorTable(ModBlocks.SACRED_OLIVE_DOOR.get()));

        this.dropSelf(ModBlocks.SACRED_OLIVE_SIGN.get());
        this.dropSelf(ModBlocks.SACRED_OLIVE_WALL_SIGN.get());

        this.dropSelf(ModBlocks.SACRED_OLIVE_HANGING_SIGN.get());
        this.dropSelf(ModBlocks.SACRED_OLIVE_WALL_HANGING_SIGN.get());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
