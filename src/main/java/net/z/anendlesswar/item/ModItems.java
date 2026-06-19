package net.z.anendlesswar.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AnEndlessWar.MODID);

    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_GALENA = ITEMS.register("raw_galena",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALCINED_BONES = ITEMS.register("calcined_bones",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> VORGRAN_COAL = ITEMS.register("vorgran_coal",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CRUSHED_TIN = ITEMS.register("crushed_tin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRUSHED_SILVER = ITEMS.register("crushed_silver",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KHARVAK_AMALGAMATION = ITEMS.register("kharvak_amalgamation",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_TIN_BLEND = ITEMS.register("copper_tin_blend",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOLRA_LUMP = ITEMS.register("solra_lump",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KHARVAK_IRON_INGOT = ITEMS.register("kharvak_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOLRA_INGOT = ITEMS.register("solra_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HELSHARD = ITEMS.register("helshard",
            () -> new Item(new Item.Properties().stacksTo(5)));
    public static final DeferredItem<Item> SACRED_OLIVE_BRANCH = ITEMS.register("sacred_olive_branch",
            () -> new Item(new Item.Properties().stacksTo(7)));
    public static final DeferredItem<Item> PTAHS_DISC = ITEMS.register("ptahs_disc",
            () -> new Item(new Item.Properties().stacksTo(8)));
    public static final DeferredItem<Item> REMNANT_CONTAMINATED_BONE = ITEMS.register("remnant_contaminated_bone",
            () -> new Item(new Item.Properties().stacksTo(6)));

    public static final DeferredItem<Item> BRONZE_COIN = ITEMS.register("bronze_coin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_COIN = ITEMS.register("silver_coin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KHARVAK_COIN = ITEMS.register("kharvak_coin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOLRA_COIN = ITEMS.register("solra_coin",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<SignItem> OLIVE_SIGN = ITEMS.register("olive_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.OLIVE_SIGN.get(),
                    ModBlocks.OLIVE_WALL_SIGN.get()));

    public static final DeferredItem<HangingSignItem> OLIVE_HANGING_SIGN = ITEMS.register("olive_hanging_sign",
            () -> new HangingSignItem(ModBlocks.OLIVE_HANGING_SIGN.get(), ModBlocks.OLIVE_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final DeferredItem<SignItem> SACRED_OLIVE_SIGN = ITEMS.register("sacred_olive_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.SACRED_OLIVE_SIGN.get(),
                    ModBlocks.SACRED_OLIVE_WALL_SIGN.get()));

    public static final DeferredItem<HangingSignItem> SACRED_OLIVE_HANGING_SIGN = ITEMS.register("sacred_olive_hanging_sign",
            () -> new HangingSignItem(ModBlocks.SACRED_OLIVE_HANGING_SIGN.get(), ModBlocks.SACRED_OLIVE_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    // ------------------------------------------------------------------------------------------------------------------------
    //                                                           BRONZE
    // ------------------------------------------------------------------------------------------------------------------------
    public static final DeferredItem<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
            () -> new SwordItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.BRONZE, 3, -2.4F))));

    public static final DeferredItem<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BRONZE, 1, -2.8F))));

    public static final DeferredItem<Item> BRONZE_GREATAXE = ITEMS.register("bronze_greataxe",
            () -> new AxeItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.BRONZE, 5, -3.1F))));

    public static final DeferredItem<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.BRONZE, 1.5F, -3.0F))));

    public static final DeferredItem<Item> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new HoeItem(ModToolTiers.BRONZE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.BRONZE, -3.0F, 0.0F))));

    // -----------------------------------------------------------------------------------------------------------y-------------
    //                                                          BRONSRUN
    // ------------------------------------------------------------------------------------------------------------------------
    public static final DeferredItem<Item> BRONSRUN_SWORD = ITEMS.register("bronsrun_sword",
            () -> new SwordItem(ModToolTiers.BRONSRUN, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.BRONSRUN, 5, -2.2F))));

    public static final DeferredItem<Item> BRONSRUN_PICKAXE = ITEMS.register("bronsrun_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRONSRUN, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.BRONSRUN, -1.0F, -2.6F))));

    public static final DeferredItem<Item> BRONSRUN_GREATAXE = ITEMS.register("bronsrun_greataxe",
            () -> new AxeItem(ModToolTiers.BRONSRUN, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.BRONSRUN, 7, -2.8F))));

    public static final DeferredItem<Item> BRONSRUN_BATTLEAXE = ITEMS.register("bronsrun_battleaxe",
            () -> new AxeItem(ModToolTiers.BRONSRUN, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.BRONSRUN, 12, -3.8F))));

    public static final DeferredItem<Item> BRONSRUN_SHOVEL = ITEMS.register("bronsrun_shovel",
            () -> new ShovelItem(ModToolTiers.BRONSRUN, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.BRONSRUN, -0.5F, -2.8F))));

    public static final DeferredItem<Item> BRONSRUN_HOE = ITEMS.register("bronsrun_hoe",
            () -> new HoeItem(ModToolTiers.BRONSRUN, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.BRONSRUN, -6.0F, 1.0F))));

    // ------------------------------------------------------------------------------------------------------------------------
    //                                                      KHARVAK IRON
    // ------------------------------------------------------------------------------------------------------------------------
    public static final DeferredItem<Item> KHARVAK_IRON_SWORD = ITEMS.register("kharvak_iron_sword",
            () -> new SwordItem(ModToolTiers.KHARVAK_IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.KHARVAK_IRON, 3, -2.4F))));

    public static final DeferredItem<Item> KHARVAK_IRON_PICKAXE = ITEMS.register("kharvak_iron_pickaxe",
            () -> new PickaxeItem(ModToolTiers.KHARVAK_IRON, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.KHARVAK_IRON, 1, -2.8F))));

    public static final DeferredItem<Item> KHARVAK_IRON_AXE = ITEMS.register("kharvak_iron_axe",
            () -> new AxeItem(ModToolTiers.KHARVAK_IRON, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.KHARVAK_IRON, 5, -3.1F))));

    public static final DeferredItem<Item> KHARVAK_IRON_SHOVEL = ITEMS.register("kharvak_iron_shovel",
            () -> new ShovelItem(ModToolTiers.KHARVAK_IRON, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.KHARVAK_IRON, 1.5F, -3.0F))));

    public static final DeferredItem<Item> KHARVAK_IRON_HOE = ITEMS.register("kharvak_iron_hoe",
            () -> new HoeItem(ModToolTiers.KHARVAK_IRON, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.KHARVAK_IRON, -3.0F, 0.0F))));

    // ------------------------------------------------------------------------------------------------------------------------
    //                                                    WHAT REMAINS
    // ------------------------------------------------------------------------------------------------------------------------
    public static final DeferredItem<Item> WHAT_REMAINS_WARBLADE = ITEMS.register("what_remains_warblade",
            () -> new SwordItem(ModToolTiers.WHAT_REMAINS, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.WHAT_REMAINS, 5, -2.2F))));

    public static final DeferredItem<Item> WHAT_REMAINS_PICKAXE = ITEMS.register("what_remains_pickaxe",
            () -> new PickaxeItem(ModToolTiers.WHAT_REMAINS, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.WHAT_REMAINS, -1.0F, -2.6F))));

    public static final DeferredItem<Item> WHAT_REMAINS_AXE = ITEMS.register("what_remains_axe",
            () -> new AxeItem(ModToolTiers.WHAT_REMAINS, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.WHAT_REMAINS, 7, -2.8F))));

    public static final DeferredItem<Item> WHAT_REMAINS_SHOVEL = ITEMS.register("what_remains_shovel",
            () -> new ShovelItem(ModToolTiers.WHAT_REMAINS, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.WHAT_REMAINS, -0.5F, -2.8F))));

    public static final DeferredItem<Item> WHAT_REMAINS_HOE = ITEMS.register("what_remains_hoe",
            () -> new HoeItem(ModToolTiers.WHAT_REMAINS, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.WHAT_REMAINS, -6.0F, 1.0F))));

    // ------------------------------------------------------------------------------------------------------------------------
    //                                                           SILVER
    // ------------------------------------------------------------------------------------------------------------------------
    public static final DeferredItem<Item> SILVER_LONGSWORD = ITEMS.register("silver_longsword",
            () -> new SwordItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SILVER, 3, -2.4F))));

    public static final DeferredItem<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SILVER, 1, -2.8F))));

    public static final DeferredItem<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SILVER, 5, -3.1F))));

    public static final DeferredItem<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SILVER, 1.5F, -3.0F))));

    public static final DeferredItem<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ModToolTiers.SILVER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SILVER, -3.0F, -0.0F))));

    // ------------------------------------------------------------------------------------------------------------------------
    //                                                      OLIVA ARGENTEA
    // ------------------------------------------------------------------------------------------------------------------------
    public static final DeferredItem<Item> OLIVA_ARGENTEA_TEMPLAR_SWORD = ITEMS.register("oliva_argentea_templar_sword",
            () -> new SwordItem(ModToolTiers.OLIVA_ARGENTEA, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.OLIVA_ARGENTEA, 5, -2.2F))));

    public static final DeferredItem<Item> OLIVA_ARGENTEA_PICKAXE = ITEMS.register("oliva_argentea_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OLIVA_ARGENTEA, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.OLIVA_ARGENTEA, -1.0F, -2.6F))));

    public static final DeferredItem<Item> OLIVA_ARGENTEA_BATTLEAXE = ITEMS.register("oliva_argentea_battleaxe",
            () -> new AxeItem(ModToolTiers.OLIVA_ARGENTEA, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.OLIVA_ARGENTEA, 7, -2.8F))));

    public static final DeferredItem<Item> OLIVA_ARGENTEA_SHOVEL = ITEMS.register("oliva_argentea_shovel",
            () -> new ShovelItem(ModToolTiers.OLIVA_ARGENTEA, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.OLIVA_ARGENTEA, -0.5F, -2.8F))));

    public static final DeferredItem<Item> OLIVA_ARGENTEA_HOE = ITEMS.register("oliva_argentea_hoe",
            () -> new HoeItem(ModToolTiers.OLIVA_ARGENTEA, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.OLIVA_ARGENTEA, -6.0F, 1.0F))));

    // ------------------------------------------------------------------------------------------------------------------------
    //                                                            SOLRA
    // ------------------------------------------------------------------------------------------------------------------------
    public static final DeferredItem<Item> SOLRA_SWORD = ITEMS.register("solra_sword",
            () -> new SwordItem(ModToolTiers.SOLRA, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SOLRA, 3, -2.4F))));

    public static final DeferredItem<Item> SOLRA_PICKAXE = ITEMS.register("solra_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SOLRA, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SOLRA, 1, -2.8F))));

    public static final DeferredItem<Item> SOLRA_AXE = ITEMS.register("solra_axe",
            () -> new AxeItem(ModToolTiers.SOLRA, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SOLRA, 5, -3.1F))));

    public static final DeferredItem<Item> SOLRA_SHOVEL = ITEMS.register("solra_shovel",
            () -> new ShovelItem(ModToolTiers.SOLRA, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SOLRA, 1.5F, -3.0F))));

    public static final DeferredItem<Item> SOLRA_HOE = ITEMS.register("solra_hoe",
            () -> new HoeItem(ModToolTiers.SOLRA, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SOLRA, -3.0F, -0.0F))));

    // ------------------------------------------------------------------------------------------------------------------------
    //                                                         PTAHTITE
    // ------------------------------------------------------------------------------------------------------------------------
    public static final DeferredItem<Item> PTAHTITE_LONGSWORD = ITEMS.register("ptahtite_longsword",
            () -> new SwordItem(ModToolTiers.PTAHTITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.PTAHTITE, 5, -2.2F))));

    public static final DeferredItem<Item> PTAHTITE_PICKAXE = ITEMS.register("ptahtite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PTAHTITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.PTAHTITE, -1.0F, -2.6F))));

    public static final DeferredItem<Item> PTAHTITE_AXE = ITEMS.register("ptahtite_axe",
            () -> new AxeItem(ModToolTiers.PTAHTITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.PTAHTITE, 7, -2.8F))));

    public static final DeferredItem<Item> PTAHTITE_SHOVEL = ITEMS.register("ptahtite_shovel",
            () -> new ShovelItem(ModToolTiers.PTAHTITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.PTAHTITE, -0.5F, -2.8F))));

    public static final DeferredItem<Item> PTAHTITE_HOE = ITEMS.register("ptahtite_hoe",
            () -> new HoeItem(ModToolTiers.PTAHTITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.PTAHTITE, -6.0F, 1.0F))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
