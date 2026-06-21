package net.z.anendlesswar.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.resources.ResourceLocation;
import net.z.anendlesswar.AnEndlessWar;

public class FrozenEffect extends MobEffect {

    private static final ResourceLocation FROZEN_SLOWNESS_ID =
            ResourceLocation.fromNamespaceAndPath(AnEndlessWar.MODID, "frozen_slowness");

    public FrozenEffect(MobEffectCategory category, int color) {
        super(category, color);
        this.addAttributeModifier(
                Attributes.MOVEMENT_SPEED,
                FROZEN_SLOWNESS_ID,
                -0.5,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL
        );
    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        entity.setTicksFrozen(entity.getTicksRequiredToFreeze() + 1);
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }

}