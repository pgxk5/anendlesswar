package net.z.anendlesswar.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.Vec3;
import net.z.anendlesswar.effect.ModEffects;

public class DaggerItem extends SwordItem {

    public DaggerItem(Tier tier, Properties properties) {
        super(tier, properties);
    }


    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean isFullCharge = attacker instanceof net.minecraft.world.entity.player.Player player
                && player.getAttackStrengthScale(0.5f) >= 1.0f;
        boolean isBackstab = isAttackingFromBehind(target, attacker);

        if (isFullCharge && isBackstab) {
            target.hurt(attacker.damageSources().playerAttack((net.minecraft.world.entity.player.Player) attacker),
                    (float) (attacker.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE) * 0.5f));
        }

        if (isFullCharge && !target.hasEffect(ModEffects.BLEEDING) && attacker.getRandom().nextFloat() < 0.20f) {
            target.addEffect(new MobEffectInstance(ModEffects.BLEEDING, 200, 0, false, true));
            attacker.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20, 4, false, false));
        }

        return super.hurtEnemy(stack, target, attacker);
    }

    private boolean isAttackingFromBehind(LivingEntity target, LivingEntity attacker) {
        Vec3 targetLook = target.getLookAngle();
        Vec3 toAttacker = attacker.position().subtract(target.position()).normalize();
        return targetLook.dot(toAttacker) > 0.0;
    }
}