package net.z.anendlesswar.datagen;

import net.z.anendlesswar.AnEndlessWar;
import net.z.anendlesswar.block.ModBlocks;
import net.z.anendlesswar.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AnEndlessWar.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        basicItem(ModItems.VORGRAN_COAL.get());

        basicItem(ModItems.RAW_TIN.get());
        basicItem(ModItems.RAW_GALENA.get());
        basicItem(ModItems.CALCINED_BONES.get());

        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.COPPER_TIN_BLEND.get());
        basicItem(ModItems.BRONZE_INGOT.get());
        basicItem(ModItems.SILVER_INGOT.get());
        basicItem(ModItems.KHARVAK_AMALGAMATION.get());
        basicItem(ModItems.KHARVAK_IRON_INGOT.get());
        basicItem(ModItems.SOLRA_LUMP.get());
        basicItem(ModItems.SOLRA_INGOT.get());

        basicItem(ModItems.CRUSHED_TIN.get());
        basicItem(ModItems.CRUSHED_GALENA.get());

        basicItem(ModItems.HELSHARD.get());
        basicItem(ModItems.SACRED_OLIVE_BRANCH.get());
        basicItem(ModItems.PTAHS_DISC.get());
        basicItem(ModItems.REMNANT_CONTAMINATED_BONE.get());

        basicItem(ModItems.BRONZE_COIN.get());
        basicItem(ModItems.SILVER_COIN.get());
        basicItem(ModItems.KHARVAK_COIN.get());
        basicItem(ModItems.SOLRA_COIN.get());

        buttonItem(ModBlocks.OLIVE_BUTTON, ModBlocks.OLIVE_PLANKS);
        fenceItem(ModBlocks.OLIVE_FENCE, ModBlocks.OLIVE_PLANKS);
        basicItem(ModBlocks.OLIVE_DOOR.asItem());

        buttonItem(ModBlocks.SACRED_OLIVE_BUTTON, ModBlocks.SACRED_OLIVE_PLANKS);
        fenceItem(ModBlocks.SACRED_OLIVE_FENCE, ModBlocks.SACRED_OLIVE_PLANKS);
        basicItem(ModBlocks.SACRED_OLIVE_DOOR.asItem());

        basicItem(ModItems.OLIVE_SIGN.get());
        basicItem(ModItems.OLIVE_HANGING_SIGN.get());

        basicItem(ModItems.SACRED_OLIVE_SIGN.get());
        basicItem(ModItems.SACRED_OLIVE_HANGING_SIGN.get());

        saplingItem(ModBlocks.OLIVE_SAPLING);

        // BRONZE
        handheldItem(ModItems.BRONZE_SWORD);
        handheldItem(ModItems.BRONZE_PICKAXE);
        handheldItem(ModItems.BRONZE_GREATAXE);
        handheldItem(ModItems.BRONZE_SHOVEL);
        handheldItem(ModItems.BRONZE_HOE);

        trimmedArmorItem(ModItems.BRONZE_HELMET);
        trimmedArmorItem(ModItems.BRONZE_CHESTPLATE);
        trimmedArmorItem(ModItems.BRONZE_LEGGINGS);
        trimmedArmorItem(ModItems.BRONZE_BOOTS);

        // BRONSRUN
        handheldItem(ModItems.BRONSRUN_SWORD);
        handheldItem(ModItems.BRONSRUN_PICKAXE);
        handheldItem(ModItems.BRONSRUN_GREATAXE);
        handheldItem(ModItems.BRONSRUN_SHOVEL);
        handheldItem(ModItems.BRONSRUN_HOE);

        trimmedArmorItem(ModItems.BRONSRUN_HELMET);
        trimmedArmorItem(ModItems.BRONSRUN_CHESTPLATE);
        trimmedArmorItem(ModItems.BRONSRUN_LEGGINGS);
        trimmedArmorItem(ModItems.BRONSRUN_BOOTS);

        // KHARVAK IRON
        handheldItem(ModItems.KHARVAK_IRON_SWORD);
        handheldItem(ModItems.KHARVAK_IRON_PICKAXE);
        handheldItem(ModItems.KHARVAK_IRON_AXE);
        handheldItem(ModItems.KHARVAK_IRON_SHOVEL);
        handheldItem(ModItems.KHARVAK_IRON_HOE);

        trimmedArmorItem(ModItems.KHARVAK_IRON_HELMET);
        trimmedArmorItem(ModItems.KHARVAK_IRON_CHESTPLATE);
        trimmedArmorItem(ModItems.KHARVAK_IRON_LEGGINGS);
        trimmedArmorItem(ModItems.KHARVAK_IRON_BOOTS);

        // WHAT REMAINS
        handheldItem(ModItems.WHAT_REMAINS_WARBLADE);
        handheldItem(ModItems.WHAT_REMAINS_FANG);
        handheldItem(ModItems.WHAT_REMAINS_PICKAXE);
        handheldItem(ModItems.WHAT_REMAINS_AXE);
        handheldItem(ModItems.WHAT_REMAINS_SHOVEL);
        handheldItem(ModItems.WHAT_REMAINS_HOE);

        trimmedArmorItem(ModItems.WHAT_REMAINS_HELMET);
        trimmedArmorItem(ModItems.WHAT_REMAINS_CHESTPLATE);
        trimmedArmorItem(ModItems.WHAT_REMAINS_LEGGINGS);
        trimmedArmorItem(ModItems.WHAT_REMAINS_BOOTS);

        // SILVER
        handheldItem(ModItems.SILVER_LONGSWORD);
        handheldItem(ModItems.SILVER_PICKAXE);
        handheldItem(ModItems.SILVER_AXE);
        handheldItem(ModItems.SILVER_SHOVEL);
        handheldItem(ModItems.SILVER_HOE);

        trimmedArmorItem(ModItems.SILVER_HELMET);
        trimmedArmorItem(ModItems.SILVER_CHESTPLATE);
        trimmedArmorItem(ModItems.SILVER_LEGGINGS);
        trimmedArmorItem(ModItems.SILVER_BOOTS);


        // OLIVA ARGENTEA
        handheldItem(ModItems.OLIVA_ARGENTEA_TEMPLAR_SWORD);
        handheldItem(ModItems.OLIVA_ARGENTEA_PICKAXE);
        handheldItem(ModItems.OLIVA_ARGENTEA_BATTLEAXE);
        handheldItem(ModItems.OLIVA_ARGENTEA_SHOVEL);
        handheldItem(ModItems.OLIVA_ARGENTEA_HOE);

        trimmedArmorItem(ModItems.OLIVA_ARGENTEA_HELMET);
        trimmedArmorItem(ModItems.OLIVA_ARGENTEA_CHESTPLATE);
        trimmedArmorItem(ModItems.OLIVA_ARGENTEA_LEGGINGS);
        trimmedArmorItem(ModItems.OLIVA_ARGENTEA_BOOTS);

        // SOLRA
        handheldItem(ModItems.SOLRA_SWORD);
        handheldItem(ModItems.SOLRA_PICKAXE);
        handheldItem(ModItems.SOLRA_AXE);
        handheldItem(ModItems.SOLRA_SHOVEL);
        handheldItem(ModItems.SOLRA_HOE);

        trimmedArmorItem(ModItems.SOLRA_HELMET);
        trimmedArmorItem(ModItems.SOLRA_CHESTPLATE);
        trimmedArmorItem(ModItems.SOLRA_LEGGINGS);
        trimmedArmorItem(ModItems.SOLRA_BOOTS);

        // PTAHTITE
        handheldItem(ModItems.PTAHTITE_LONGSWORD);
        handheldItem(ModItems.PTAHTITE_PICKAXE);
        handheldItem(ModItems.PTAHTITE_AXE);
        handheldItem(ModItems.PTAHTITE_SHOVEL);
        handheldItem(ModItems.PTAHTITE_HOE);

        trimmedArmorItem(ModItems.PTAHTITE_HELMET);
        trimmedArmorItem(ModItems.PTAHTITE_CHESTPLATE);
        trimmedArmorItem(ModItems.PTAHTITE_LEGGINGS);
        trimmedArmorItem(ModItems.PTAHTITE_BOOTS);
    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AnEndlessWar.MODID,"block/" + item.getId().getPath()));
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = AnEndlessWar.MODID;

        if(itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath);
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemDeferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(AnEndlessWar.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(AnEndlessWar.MODID,
                        "block/" + baseBlock.getId().getPath()));
    }


    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(AnEndlessWar.MODID,"item/" + item.getId().getPath()));
    }


}