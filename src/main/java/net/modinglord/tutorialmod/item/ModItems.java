package net.modinglord.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.modinglord.tutorialmod.TutorialMod;
import net.modinglord.tutorialmod.item.custom.FuelItem;
import net.modinglord.tutorialmod.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_CAP = ITEMS.register("red_cap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_CAP = ITEMS.register("brown_cap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));



    // Fuel Items
    public static final  RegistryObject<Item> URANIUM_CELL = ITEMS.register("uranium_cell",
            () -> new FuelItem(new Item.Properties(), 300000000));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    // 3D ITEMS
    public static final RegistryObject<Item> HERBALIST_TOOL = ITEMS.register("herbalist_tool",
            () -> new Item(new Item.Properties().stacksTo(1)));
}
