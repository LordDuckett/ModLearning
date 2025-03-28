package net.lordduckett.weaponarmormod.datagen;

import net.lordduckett.weaponarmormod.WeaponArmorMod;
import net.lordduckett.weaponarmormod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WeaponArmorMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.AQUARIUM_INGOT.get());
        basicItem(ModItems.RAW_AQUARIUM.get());

        basicItem(ModItems.RADISH.get());

        basicItem(ModItems.STARLIGHT_AHSES.get());
        basicItem(ModItems.FROSTFIRE_ICE.get());

        basicItem(ModItems.CHISEL.get());

        basicItem(ModItems.MOD_WORKBENCH_TOOL.get());
    }
}
