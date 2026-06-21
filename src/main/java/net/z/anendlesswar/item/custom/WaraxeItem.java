package net.z.anendlesswar.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.z.anendlesswar.effect.ModEffects;

public class WaraxeItem extends AxeItem{

    public WaraxeItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean isFullCharge = attacker instanceof net.minecraft.world.entity.player.Player player
                && player.getAttackStrengthScale(0.5f) >= 1.0f;

        long dayTime = attacker.level().getDayTime() % 24000L;
        boolean isDaytime = dayTime >= 0 && dayTime < 12000;

        float chance = isDaytime ? 0.40f : 0.20f;

        if (isFullCharge && !target.hasEffect(ModEffects.FROZEN) && attacker.getRandom().nextFloat() < chance) {
            target.addEffect(new MobEffectInstance(ModEffects.FROZEN, 200, 0, false, true));
            target.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 0, false, false));
            target.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0, false, false));
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}

