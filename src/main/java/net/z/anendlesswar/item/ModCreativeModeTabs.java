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
                        output.accept(ModItems.RAW_TIN);
                        output.accept(ModItems.CRUSHED_TIN);
                        output.accept(ModItems.TIN_INGOT);
                        output.accept(ModItems.VORGRAN_COAL);
                        output.accept(ModItems.SACRED_OLIVE_BRANCH);

                    }).build());

    public static final Supplier<CreativeModeTab> AN_ENDLESS_WAR_BLOCKS_TAB = CREATIVE_MODE_TAB.register("an_endless_war_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TIN_ORE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AnEndlessWar.MODID, "an_endless_war_items_tab"))
                    .title(Component.translatable("creativetab.anendlesswar.an_endless_war_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.TIN_ORE);
                        output.accept(ModBlocks.TIN_BLOCK);

                        output.accept(ModBlocks.OLIVE_LOG);
                        output.accept(ModBlocks.OLIVE_WOOD);
                        output.accept(ModBlocks.STRIPPED_OLIVE_LOG);
                        output.accept(ModBlocks.STRIPPED_OLIVE_WOOD);
                        output.accept(ModBlocks.OLIVE_PLANKS);
                        output.accept(ModBlocks.OLIVE_SAPLING);
                        output.accept(ModBlocks.OLIVE_LEAVES);

                        output.accept(ModBlocks.SACRED_OLIVE_LOG);
                        output.accept(ModBlocks.SACRED_OLIVE_WOOD);
                        output.accept(ModBlocks.STRIPPED_SACRED_OLIVE_LOG);
                        output.accept(ModBlocks.STRIPPED_SACRED_OLIVE_WOOD);
                        output.accept(ModBlocks.SACRED_OLIVE_PLANKS);
                        output.accept(ModBlocks.SACRED_OLIVE_LEAVES);


                        output.accept(ModBlocks.OLIVE_STAIRS);
                        output.accept(ModBlocks.OLIVE_SLAB);

                        output.accept(ModBlocks.OLIVE_PRESSURE_PLATE);
                        output.accept(ModBlocks.OLIVE_BUTTON);

                        output.accept(ModBlocks.OLIVE_FENCE);
                        output.accept(ModBlocks.OLIVE_FENCE_GATE);

                        output.accept(ModBlocks.OLIVE_DOOR);
                        output.accept(ModBlocks.OLIVE_TRAPDOOR);

                        output.accept(ModBlocks.OLIVE_SIGN);
                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
