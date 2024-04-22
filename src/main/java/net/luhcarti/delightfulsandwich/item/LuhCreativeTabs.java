package net.luhcarti.delightfulsandwich.item;

import net.luhcarti.delightfulsandwich.DelightfulSandwich;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;

@Mod.EventBusSubscriber(modid = DelightfulSandwich.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class LuhCreativeTabs {
    @SubscribeEvent
    public static void addItemsToCreativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeTabs.TAB_FARMERS_DELIGHT.get())
            addItemsToFDCreativeTab(event);
    }

    private static void addItemsToFDCreativeTab(BuildCreativeModeTabContentsEvent event) {
        event.accept(LuhItems.HAM_SANDWICH);
        event.accept(LuhItems.BACON_AND_EGG_SANDWICH);
        event.accept(LuhItems.COOKED_SALMON_SANDWICH);
        event.accept(LuhItems.TOMATO_AND_LETTUCE_SANDWICH);
        event.accept(LuhItems.COOKED_COD_SANDWICH);
        event.accept(LuhItems.MUTTON_SANDWICH);
    }
}




