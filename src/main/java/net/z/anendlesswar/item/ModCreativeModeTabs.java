package net.z.anendlesswar.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AnEndlessWar.MODID);


    public static final Supplier<CreativeModeTab> AN_ENDLESS_WAR_ITEMS_TAB = CREATIVE_MODE_TAB.register("an_endless_war_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_TIN.get()))
                    .title(Component.translatable("creativetab.anendlesswar.an_endless_war_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.VORGRAN_COAL);

                        output.accept(ModItems.RAW_TIN);
                        output.accept(ModItems.RAW_GALENA);

                        output.accept(ModItems.CRUSHED_TIN);
                        output.accept(ModItems.CRUSHED_SILVER);

                        output.accept(ModItems.TIN_INGOT);
                        output.accept(ModItems.BRONZE_INGOT);

                        output.accept(ModItems.CALCINED_BONES);
                        output.accept(ModItems.KHARVAK_IRON_INGOT);
                        output.accept(ModItems.SOLRA_INGOT);

                        output.accept(ModItems.COPPER_TIN_BLEND);
                        output.accept(ModItems.KHARVAK_AMALGAMATION);
                        output.accept(ModItems.SOLRA_LUMP);

                        output.accept(ModItems.HELSHARD);
                        output.accept(ModItems.SACRED_OLIVE_BRANCH);
                        output.accept(ModItems.PTAHS_DISC);
                        output.accept(ModItems.REMNANT_CONTAMINATED_BONE);

                        output.accept(ModItems.BRONZE_COIN);
                        output.accept(ModItems.SILVER_COIN);
                        output.accept(ModItems.KHARVAK_COIN);
                        output.accept(ModItems.SOLRA_COIN);

                    }).build());

    public static final Supplier<CreativeModeTab> AN_ENDLESS_WAR_BLOCKS_TAB = CREATIVE_MODE_TAB.register("an_endless_war_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TIN_ORE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AnEndlessWar.MODID, "an_endless_war_items_tab"))
                    .title(Component.translatable("creativetab.anendlesswar.an_endless_war_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.VORGRAN_COAL_ORE);
                        output.accept(ModBlocks.VORGRAN_COAL_BLOCK);

                        output.accept(ModBlocks.TIN_ORE);
                        output.accept(ModBlocks.RAW_TIN_BLOCK);
                        output.accept(ModBlocks.TIN_BLOCK);

                        output.accept(ModBlocks.BRONZE_BLOCK);

                        output.accept(ModBlocks.GALENA_ORE);
                        output.accept(ModBlocks.RAW_GALENA_BLOCK);
                        output.accept(ModBlocks.SILVER_BLOCK);

                        output.accept(ModBlocks.KHARVAK_IRON_BLOCK);

                        output.accept(ModBlocks.AURIC_SAND);
                        output.accept(ModBlocks.WET_AURIC_SAND);
                        output.accept(ModBlocks.SOLRA_ORE);
                        output.accept(ModBlocks.SOLRA_BLOCK);

                        output.accept(ModBlocks.OLIVE_LOG);
                        output.accept(ModBlocks.OLIVE_WOOD);
                        output.accept(ModBlocks.STRIPPED_OLIVE_LOG);
                        output.accept(ModBlocks.STRIPPED_OLIVE_WOOD);
                        output.accept(ModBlocks.OLIVE_PLANKS);
                        output.accept(ModBlocks.OLIVE_SAPLING);
                        output.accept(ModBlocks.OLIVE_LEAVES);

                        output.accept(ModBlocks.OLIVE_STAIRS);
                        output.accept(ModBlocks.OLIVE_SLAB);

                        output.accept(ModBlocks.OLIVE_PRESSURE_PLATE);
                        output.accept(ModBlocks.OLIVE_BUTTON);

                        output.accept(ModBlocks.OLIVE_FENCE);
                        output.accept(ModBlocks.OLIVE_FENCE_GATE);

                        output.accept(ModBlocks.OLIVE_DOOR);
                        output.accept(ModBlocks.OLIVE_TRAPDOOR);

                        output.accept(ModBlocks.OLIVE_SIGN);
                        output.accept(ModBlocks.OLIVE_HANGING_SIGN);

                        output.accept(ModBlocks.SACRED_OLIVE_LOG);
                        output.accept(ModBlocks.SACRED_OLIVE_WOOD);
                        output.accept(ModBlocks.STRIPPED_SACRED_OLIVE_LOG);
                        output.accept(ModBlocks.STRIPPED_SACRED_OLIVE_WOOD);
                        output.accept(ModBlocks.SACRED_OLIVE_PLANKS);
                        output.accept(ModBlocks.SACRED_OLIVE_LEAVES);

                        output.accept(ModBlocks.SACRED_OLIVE_STAIRS);
                        output.accept(ModBlocks.SACRED_OLIVE_SLAB);

                        output.accept(ModBlocks.SACRED_OLIVE_PRESSURE_PLATE);
                        output.accept(ModBlocks.SACRED_OLIVE_BUTTON);

                        output.accept(ModBlocks.SACRED_OLIVE_FENCE);
                        output.accept(ModBlocks.SACRED_OLIVE_FENCE_GATE);

                        output.accept(ModBlocks.SACRED_OLIVE_DOOR);
                        output.accept(ModBlocks.SACRED_OLIVE_TRAPDOOR);

                        output.accept(ModBlocks.SACRED_OLIVE_SIGN);
                        output.accept(ModBlocks.SACRED_OLIVE_HANGING_SIGN);

                    }).build());

    public static final Supplier<CreativeModeTab> AN_ENDLESS_WAR_WEAPONS_TAB = CREATIVE_MODE_TAB.register("an_endless_war_weapons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WHAT_REMAINS_WARBLADE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AnEndlessWar.MODID, "an_endless_war_blocks_tab"))
                    .title(Component.translatable("creativetab.anendlesswar.an_endless_war_weapons"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // BRONZE
                        output.accept(ModItems.BRONZE_SWORD);
                        output.accept(ModItems.BRONZE_PICKAXE);
                        output.accept(ModItems.BRONZE_GREATAXE);
                        output.accept(ModItems.BRONZE_SHOVEL);
                        output.accept(ModItems.BRONZE_HOE);

                        // BRONSRUN
                        output.accept(ModItems.BRONSRUN_SWORD);
                        output.accept(ModItems.BRONSRUN_PICKAXE);
                        output.accept(ModItems.BRONSRUN_GREATAXE);
                        output.accept(ModItems.BRONSRUN_SHOVEL);
                        output.accept(ModItems.BRONSRUN_HOE);

                        // KHARVAK IRON
                        output.accept(ModItems.KHARVAK_IRON_SWORD);
                        output.accept(ModItems.KHARVAK_IRON_PICKAXE);
                        output.accept(ModItems.KHARVAK_IRON_AXE);
                        output.accept(ModItems.KHARVAK_IRON_SHOVEL);
                        output.accept(ModItems.KHARVAK_IRON_HOE);

                        // WHAT REMAINS
                        output.accept(ModItems.WHAT_REMAINS_WARBLADE);
                        output.accept(ModItems.WHAT_REMAINS_PICKAXE);
                        output.accept(ModItems.WHAT_REMAINS_AXE);
                        output.accept(ModItems.WHAT_REMAINS_SHOVEL);
                        output.accept(ModItems.WHAT_REMAINS_HOE);

                        // SILVER
                        output.accept(ModItems.SILVER_LONGSWORD);
                        output.accept(ModItems.SILVER_PICKAXE);
                        output.accept(ModItems.SILVER_AXE);
                        output.accept(ModItems.SILVER_SHOVEL);
                        output.accept(ModItems.SILVER_HOE);

                        // OLIVA ARGENTEA
                        output.accept(ModItems.OLIVA_ARGENTEA_TEMPLAR_SWORD);
                        output.accept(ModItems.OLIVA_ARGENTEA_PICKAXE);
                        output.accept(ModItems.OLIVA_ARGENTEA_BATTLEAXE);
                        output.accept(ModItems.OLIVA_ARGENTEA_SHOVEL);
                        output.accept(ModItems.OLIVA_ARGENTEA_HOE);

                        // SOLRA
                        output.accept(ModItems.SOLRA_SWORD);
                        output.accept(ModItems.SOLRA_PICKAXE);
                        output.accept(ModItems.SOLRA_AXE);
                        output.accept(ModItems.SOLRA_SHOVEL);
                        output.accept(ModItems.SOLRA_HOE);

                        // PTAHTITE
                        output.accept(ModItems.PTAHTITE_LONGSWORD);
                        output.accept(ModItems.PTAHTITE_PICKAXE);
                        output.accept(ModItems.PTAHTITE_AXE);
                        output.accept(ModItems.PTAHTITE_SHOVEL);
                        output.accept(ModItems.PTAHTITE_HOE);

                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
