package net.lordduckett.weaponarmormod.item;

import net.lordduckett.weaponarmormod.WeaponArmorMod;
import net.lordduckett.weaponarmormod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeaponArmorMod.MOD_ID);

    public static final Supplier<CreativeModeTab> AQUARIUM_ITEMS_TAB = CREATIVE_MODE_TAB.register("wam_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AQUARIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.weaponarmormod.wam"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AQUARIUM_INGOT);
                        output.accept(ModItems.RAW_AQUARIUM);
                        output.accept(ModBlocks.AQUARIUM_BLOCK);
                        output.accept(ModBlocks.AQUARIUM_ORE);
                        output.accept(ModBlocks.AQUARIUM_DEEPSLATE_ORE);
                    }).build());

    public static final Supplier<CreativeModeTab> WAM_TOOLS_TAB = CREATIVE_MODE_TAB.register("test_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOD_WORKBENCH_TOOL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(WeaponArmorMod.MOD_ID, "wam_tab"))
                    .title(Component.translatable("creativetab.weaponarmormod.test"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MOD_WORKBENCH_TOOL);
                        output.accept(ModItems.CHISEL);
                        output.accept(ModBlocks.MAGIC_BLOCK);
                        output.accept(ModItems.RADISH);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
