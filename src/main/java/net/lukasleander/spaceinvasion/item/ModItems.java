package net.lukasleander.spaceinvasion.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lukasleander.spaceinvasion.SpaceInvasion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class ModItems {
    //
    public static final Item BLUECRYSTAL = registerItem("bluecrystal",
            new Item(new FabricItemSettings()));
    public static final Item RAW_BLUECRYSTAL = registerItem("raw_bluecrystal",
            new Item(new FabricItemSettings()));

    //register item
    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SpaceInvasion.MOD_ID, name), item);
    }


    //add to group
    public static void addItemToItemGroup() {
        addToItemGroup(ModItemGroup.SPACEMETAL, BLUECRYSTAL);
        addToItemGroup(ModItemGroup.SPACEMETAL, RAW_BLUECRYSTAL);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        SpaceInvasion.LOGGER.info("registering af item " + SpaceInvasion.MOD_ID);

        addItemToItemGroup();
    }
}
