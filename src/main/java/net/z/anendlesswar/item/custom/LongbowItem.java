package net.z.anendlesswar.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.z.anendlesswar.entity.NeithArrow;

public class LongbowItem extends BowItem {

    private static final float DAMAGE_MULTIPLIER = 2.0f;
    private static final float VELOCITY_MULTIPLIER = 1.5f;

    public LongbowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow customArrow(AbstractArrow arrow, ItemStack projectileStack, ItemStack weaponStack) {
        arrow.setBaseDamage(arrow.getBaseDamage() * DAMAGE_MULTIPLIER);

        if (arrow.getOwner() instanceof LivingEntity shooter) {
            NeithArrow neithArrow = new NeithArrow(arrow.level(), shooter, weaponStack);
            neithArrow.setPos(arrow.getX(), arrow.getY(), arrow.getZ());
            neithArrow.setDeltaMovement(arrow.getDeltaMovement());
            neithArrow.setBaseDamage(arrow.getBaseDamage());
            return neithArrow;
        }

        return arrow;
    }


    @Override
    public void releaseUsing(ItemStack stack, Level level, LivingEntity entity, int timeCharged) {
        if (!level.isClientSide) {
            pendingBoost.put(entity.getUUID(), level.getGameTime());
        }
        super.releaseUsing(stack, level, entity, timeCharged);
    }

    // En vez de HashSet usa esto
    public static final java.util.concurrent.ConcurrentHashMap<java.util.UUID, Long> pendingBoost = new java.util.concurrent.ConcurrentHashMap<>();
}