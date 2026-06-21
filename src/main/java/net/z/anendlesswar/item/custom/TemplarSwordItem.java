package net.z.anendlesswar.item.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.Vec3;

public class TemplarSwordItem extends SwordItem {
    public TemplarSwordItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean isFullCharge = attacker instanceof net.minecraft.world.entity.player.Player player
                && player.getAttackStrengthScale(0.5f) >= 1.0f;

        if (isFullCharge) {
            boolean isStormy = attacker.level().isThundering() || attacker.level().isRaining();
            float chance = isStormy ? 0.50f : 0.20f;

            if (attacker.getRandom().nextFloat() < chance) {
                Vec3 direction = target.position()
                        .subtract(attacker.position())
                        .normalize()
                        .scale(2.0);

                target.setDeltaMovement(direction.x, 0.5, direction.z);
                target.hurtMarked = true;

                if (attacker.level() instanceof ServerLevel serverLevel) {
                    LightningBolt lightning = EntityType.LIGHTNING_BOLT.create(serverLevel);
                    if (lightning != null) {
                        lightning.moveTo(target.getX(), target.getY(), target.getZ());
                        lightning.setVisualOnly(false);
                        serverLevel.addFreshEntity(lightning);
                    }
                }
            }
        }

        return super.hurtEnemy(stack, target, attacker);
    }
}
