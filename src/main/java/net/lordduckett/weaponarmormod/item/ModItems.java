package net.lordduckett.weaponarmormod.item;

import net.lordduckett.weaponarmormod.WeaponArmorMod;
import net.lordduckett.weaponarmormod.item.custom.ChiselItem;
import net.lordduckett.weaponarmormod.item.custom.FuelItem;
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

    public static final DeferredItem<Item> FROSTFIRE_ICE = ITEMS.register("frostfire_ice",
            () -> new FuelItem(new Item.Properties(), 800));
    public static final DeferredItem<Item> STARLIGHT_AHSES = ITEMS.register("starlight_ashes",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
