package net.z.anendlesswar.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.worldgen.ModConfiguredFeatures;

import java.util.Optional;

public class ModTreeGrowers {

    public static final TreeGrower OLIVE = new TreeGrower(
            AnEndlessWar.MODID + ":olive",
            0.05f, // 5%
            Optional.empty(), // megaTree
            Optional.empty(), // secondaryMegaTree
            Optional.of(ModConfiguredFeatures.OLIVE_KEY), // árbol normal
            Optional.of(ModConfiguredFeatures.SACRED_OLIVE_KEY), // variante secundaria
            Optional.empty(), // flowers
            Optional.empty()  // secondaryFlowers
    );

}
