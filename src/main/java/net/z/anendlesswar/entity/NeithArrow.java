package net.z.anendlesswar.entity;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class NeithArrow extends Arrow {

    public NeithArrow(EntityType<? extends Arrow> type, Level level) {
        super(type, level);
    }

    public NeithArrow(Level level, LivingEntity shooter, ItemStack stack) {
        super(level, shooter, stack, null);
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {
        super.onHitEntity(result);

        if (result.getEntity() instanceof LivingEntity target) {
            long dayTime = target.level().getDayTime() % 24000L;
            boolean isNight = dayTime >= 12000 && dayTime < 24000;

            float chance = isNight ? 0.40f : 0.20f;

            if (target.getRandom().nextFloat() < chance) {
                target.addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 1, false, true));
                target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 0, false, true));
            }
        }
    }
}