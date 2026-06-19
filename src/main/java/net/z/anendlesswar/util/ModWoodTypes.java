package net.z.anendlesswar.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.z.anendlesswar.AnEndlessWar;

public class ModWoodTypes {
    public static final WoodType OLIVE = WoodType.register(new WoodType(AnEndlessWar.MODID + ":olive", BlockSetType.OAK));
    public static final WoodType SACRED_OLIVE = WoodType.register(new WoodType(AnEndlessWar.MODID + ":sacred_olive", BlockSetType.OAK));

}
