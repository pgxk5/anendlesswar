package net.z.anendlesswar.event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.neoforge.event.entity.living.LivingHealEvent;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.effect.ModEffects;
import net.z.anendlesswar.item.custom.LongbowItem;

@EventBusSubscriber(modid = AnEndlessWar.MODID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void onLivingHeal(LivingHealEvent event) {
        if (event.getEntity().hasEffect(ModEffects.BLEEDING)) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public static void onLivingJump(LivingEvent.LivingJumpEvent event) {
        if (event.getEntity().hasEffect(ModEffects.FROZEN)) {
            event.getEntity().setDeltaMovement(0, 0, 0);
        }
    }
    @SubscribeEvent
    public static void onServerTick(ServerTickEvent.Post event) {
        long time = event.getServer().overworld().getGameTime();
        LongbowItem.pendingBoost.entrySet().removeIf(e -> time - e.getValue() > 100);
    }

    @SubscribeEvent
    public static void onEntityJoinLevel(EntityJoinLevelEvent event) {
        if (event.getLevel().isClientSide()) return;
        if (event.getEntity() instanceof AbstractArrow arrow
                && arrow.getOwner() instanceof LivingEntity owner) {
            if (LongbowItem.pendingBoost.remove(owner.getUUID()) != null) {
                arrow.setDeltaMovement(arrow.getDeltaMovement().scale(1.5f));
            }
        }
    }
}