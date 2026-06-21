package net.z.anendlesswar.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.neoforge.event.entity.living.LivingHealEvent;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.effect.ModEffects;

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
}