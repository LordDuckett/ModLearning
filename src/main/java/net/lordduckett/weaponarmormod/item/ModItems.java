package net.lordduckett.weaponarmormod.item;

import net.lordduckett.weaponarmormod.WeaponArmorMod;
import net.lordduckett.weaponarmormod.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WeaponArmorMod.MOD_ID);

    public static final DeferredItem<Item> AQUARIUM_INGOT = ITEMS.register("aquarium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_AQUARIUM = ITEMS.register("raw_aquarium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOD_WORKBENCH_TOOL = ITEMS.register("mod_workbench_tool",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final DeferredItem<Item> RADISH = ITEMS.register("radish",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADISH)));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
