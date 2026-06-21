package net.z.anendlesswar.effect;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.z.anendlesswar.AnEndlessWar;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECT = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, AnEndlessWar.MODID);

    public static final DeferredHolder<MobEffect, BleedingEffect> BLEEDING = MOB_EFFECT.register("bleeding",
            () -> new BleedingEffect(MobEffectCategory.HARMFUL, 0xFF0000));

    public static final DeferredHolder<MobEffect, FrozenEffect> FROZEN = MOB_EFFECT.register("frozen",
            () -> new FrozenEffect(MobEffectCategory.HARMFUL, 0x00BFFF));


}
