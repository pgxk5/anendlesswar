package net.z.anendlesswar.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderGuiLayerEvent;
import net.neoforged.neoforge.client.gui.VanillaGuiLayers;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.effect.ModEffects;

@EventBusSubscriber(modid = AnEndlessWar.MODID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onHealthRender(RenderGuiLayerEvent.Pre event) {
        if (!event.getName().equals(VanillaGuiLayers.PLAYER_HEALTH)) return;

        Minecraft mc = Minecraft.getInstance();
        Player player = mc.player;
        if (player == null || !player.hasEffect(ModEffects.BLEEDING)) return;

        event.setCanceled(true);

        GuiGraphics graphics = event.getGuiGraphics();
        int screenWidth = mc.getWindow().getGuiScaledWidth();
        int screenHeight = mc.getWindow().getGuiScaledHeight();

        int maxHealth = (int) Math.ceil(player.getMaxHealth());
        float currentHealth = player.getHealth();
        int hearts = (int) Math.ceil(maxHealth / 2f);

        ResourceLocation HEART_FULL = ResourceLocation.fromNamespaceAndPath("anendlesswar", "textures/gui/bleeding_heart_full.png");
        ResourceLocation HEART_HALF = ResourceLocation.fromNamespaceAndPath("anendlesswar", "textures/gui/bleeding_heart_half.png");
        ResourceLocation HEART_EMPTY = ResourceLocation.fromNamespaceAndPath("anendlesswar", "textures/gui/bleeding_heart_empty.png");

        for (int i = 0; i < hearts; i++) {
            int col = i % 10;
            int row = i / 10;
            int x = screenWidth / 2 - 91 + col * 8;
            int y = screenHeight - 39 - row * 10;

            graphics.blit(HEART_EMPTY, x, y, 0, 0, 9, 9, 9, 9);

            float healthAtHeart = currentHealth - i * 2;
            if (healthAtHeart >= 2) {
                graphics.blit(HEART_FULL, x, y, 0, 0, 9, 9, 9, 9);
            } else if (healthAtHeart >= 1) {
                graphics.blit(HEART_HALF, x, y, 0, 0, 9, 9, 9, 9);
            }
        }
    }
    @SubscribeEvent
    public static void onHealthRenderFrozen(RenderGuiLayerEvent.Pre event) {
        if (!event.getName().equals(VanillaGuiLayers.PLAYER_HEALTH)) return;

        Minecraft mc = Minecraft.getInstance();
        Player player = mc.player;
        if (player == null || !player.hasEffect(ModEffects.FROZEN)) return;

        event.setCanceled(true);

        GuiGraphics graphics = event.getGuiGraphics();
        int screenWidth = mc.getWindow().getGuiScaledWidth();
        int screenHeight = mc.getWindow().getGuiScaledHeight();
        int hearts = (int) Math.ceil(player.getMaxHealth() / 2f);
        float currentHealth = player.getHealth();

        ResourceLocation FULL  = ResourceLocation.fromNamespaceAndPath("anendlesswar", "textures/gui/frozen_heart_full.png");
        ResourceLocation HALF  = ResourceLocation.fromNamespaceAndPath("anendlesswar", "textures/gui/frozen_heart_half.png");
        ResourceLocation EMPTY = ResourceLocation.fromNamespaceAndPath("anendlesswar", "textures/gui/frozen_heart_empty.png");

        for (int i = 0; i < hearts; i++) {
            int x = screenWidth / 2 - 91 + (i % 10) * 8;
            int y = screenHeight - 39 - (i / 10) * 10;

            graphics.blit(EMPTY, x, y, 0, 0, 9, 9, 9, 9);
            float h = currentHealth - i * 2;
            if (h >= 2) graphics.blit(FULL, x, y, 0, 0, 9, 9, 9, 9);
            else if (h >= 1) graphics.blit(HALF, x, y, 0, 0, 9, 9, 9, 9);
        }
    }
}