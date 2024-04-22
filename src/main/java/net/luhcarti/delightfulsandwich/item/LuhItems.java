package net.luhcarti.delightfulsandwich.item;

import net.luhcarti.delightfulsandwich.DelightfulSandwich;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LuhItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DelightfulSandwich.MOD_ID);
    public static final RegistryObject<Item> HAM_SANDWICH = ITEMS.register("ham_sandwich",
            () -> new Item(new Item.Properties().food(LuhFoods.HAM_SANDWICH)));
    public static final RegistryObject<Item> BACON_AND_EGG_SANDWICH = ITEMS.register("bacon_and_egg_sandwich",
            () -> new Item(new Item.Properties().food(LuhFoods.BACON_AND_EGG_SANDWICH)));
    public static final RegistryObject<Item> COOKED_SALMON_SANDWICH = ITEMS.register("cooked_salmon_sandwich",
            () -> new Item(new Item.Properties().food(LuhFoods.COOKED_SALMON_SANDWICH)));
    public static final RegistryObject<Item> TOMATO_AND_LETTUCE_SANDWICH = ITEMS.register("tomato_and_lettuce_sandwich",
            () -> new Item(new Item.Properties().food(LuhFoods.TOMATO_AND_LETTUCE_SANDWICH)));
    public static final RegistryObject<Item> COOKED_COD_SANDWICH = ITEMS.register("cooked_cod_sandwich",
            () -> new Item(new Item.Properties().food(LuhFoods.COOKED_COD_SANDWICH)));
    public static final RegistryObject<Item> MUTTON_SANDWICH = ITEMS.register("mutton_sandwich",
            () -> new Item(new Item.Properties().food(LuhFoods.MUTTON_SANDWICH)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
