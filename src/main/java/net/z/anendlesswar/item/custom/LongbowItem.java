package net.z.anendlesswar.item.custom;

import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class LongbowItem extends BowItem {

    private static final float DAMAGE_MULTIPLIER = 2.0f;
    private static final float VELOCITY_MULTIPLIER = 1.5f;

    public LongbowItem(Properties properties) {
        super(properties);
    }

    @Override
    public AbstractArrow customArrow(AbstractArrow arrow, ItemStack projectileStack, ItemStack weaponStack) {
        arrow.setBaseDamage(arrow.getBaseDamage() * DAMAGE_MULTIPLIER);
        arrow.setDeltaMovement(arrow.getDeltaMovement().scale(VELOCITY_MULTIPLIER));
        return arrow;
    }
}