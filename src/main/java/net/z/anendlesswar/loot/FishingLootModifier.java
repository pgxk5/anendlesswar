package net.z.anendlesswar.loot;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import net.z.anendlesswar.item.ModItems;

public class FishingLootModifier extends LootModifier {

    // (0.01 = 1%)
    private static final float CHANCE = 0.01f;

    public static final MapCodec<FishingLootModifier> CODEC =
            RecordCodecBuilder.mapCodec(inst -> codecStart(inst).apply(inst, FishingLootModifier::new));

    public FishingLootModifier(LootItemCondition[] conditions) {
        super(conditions);
    }

    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        ResourceLocation lootTable = context.getQueriedLootTableId();

        if (!lootTable.getPath().startsWith("gameplay/fishing")) {
            return generatedLoot;
        }

        if (context.getRandom().nextFloat() < CHANCE) {
            generatedLoot.add(new ItemStack(ModItems.PTAHS_DISC.get()));
        }

        return generatedLoot;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}