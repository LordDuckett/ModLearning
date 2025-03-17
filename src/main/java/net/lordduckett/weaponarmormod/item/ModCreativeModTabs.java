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

    public static final Supplier<CreativeModeTab> AQUARIUM_ITEMS_TAB = CREATIVE_MODE_TAB.register("aquarium_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AQUARIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.weaponarmormod.aquarium_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AQUARIUM_INGOT);
                        output.accept(ModItems.RAW_AQUARIUM);
                    }).build());

    public static final Supplier<CreativeModeTab> AQUARIUM_BLOCK_TAB = CREATIVE_MODE_TAB.register("aquarium_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AQUARIUM_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(WeaponArmorMod.MOD_ID, "aquarium_items_tab"))
                    .title(Component.translatable("creativetab.weaponarmormod.aquarium_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.AQUARIUM_BLOCK);
                        output.accept(ModBlocks.AQUARIUM_ORE);
                    }).build());

    public static final Supplier<CreativeModeTab> WAM_TOOLS_TAB = CREATIVE_MODE_TAB.register("wam_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOD_WORKBENCH_TOOL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(WeaponArmorMod.MOD_ID, "aquarium_blocks_tab"))
                    .title(Component.translatable("creativetab.weaponarmormod.wam_tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MOD_WORKBENCH_TOOL);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
