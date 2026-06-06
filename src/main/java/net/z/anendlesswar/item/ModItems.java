package net.z.anendlesswar.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AnEndlessWar.MODID);

    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRUSHED_TIN = ITEMS.register("crushed_tin",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VORGRAN_COAL = ITEMS.register("vorgran_coal",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SACRED_OLIVE_BRANCH = ITEMS.register("sacred_olive_branch",
            () -> new Item(new Item.Properties().stacksTo(8)));
    public static final DeferredItem<SignItem> OLIVE_SIGN = ITEMS.register("olive_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16),
                    ModBlocks.OLIVE_SIGN.get(),
                    ModBlocks.OLIVE_WALL_SIGN.get()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
