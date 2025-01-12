package net.seed.charterrippoff.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.seed.charterrippoff.CharterRippoff;
import net.seed.charterrippoff.CharterRippoffClient;

public class ModItems {
    public static final Item HIGHERDIVINITY = registerItem("higherdivinity", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(HIGHERDIVINITY);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CharterRippoff.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CharterRippoff.LOGGER.info("Registering Mod Items for " + CharterRippoff.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);

    }
}