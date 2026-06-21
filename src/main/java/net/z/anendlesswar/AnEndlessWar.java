package net.z.anendlesswar;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.z.anendlesswar.block.ModBlocks;
import net.z.anendlesswar.block.entities.ModBlockEntities;
import net.z.anendlesswar.effect.ModEffects;
import net.z.anendlesswar.item.ModCreativeModeTabs;
import net.z.anendlesswar.item.ModItems;
import net.z.anendlesswar.loot.ModLootModifiers;
import net.z.anendlesswar.util.ModWoodTypes;
import org.slf4j.Logger;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;

@Mod(AnEndlessWar.MODID)
public class AnEndlessWar {
    public static final String MODID = "anendlesswar";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AnEndlessWar(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        ModLootModifiers.LOOT_MODIFIER_SERIALIZERS.register(modEventBus);
        ModEffects.MOB_EFFECT.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

        }
    }


    @OnlyIn(Dist.CLIENT)
    private void clientSetup(FMLClientSetupEvent event) {

        event.enqueueWork(() -> {
            Sheets.addWoodType(ModWoodTypes.OLIVE);
            Sheets.addWoodType(ModWoodTypes.SACRED_OLIVE);
            BlockEntityRenderers.register(
                    ModBlockEntities.MOD_SIGN.get(),
                    SignRenderer::new
            );
            BlockEntityRenderers.register(
                    ModBlockEntities.MOD_HANGING_SIGN.get(),
                    HangingSignRenderer::new
            );

        });

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
