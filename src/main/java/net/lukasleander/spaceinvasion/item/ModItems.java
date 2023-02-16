package net.lukasleander.spaceinvasion.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lukasleander.spaceinvasion.SpaceInvasion;
import net.lukasleander.spaceinvasion.item.custom.ModUltrafireSwordItem;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class ModItems {
    //create items
    //bluecrystal
    public static final Item BLUECRYSTAL = registerItem("bluecrystal",
            new Item(new FabricItemSettings()));
    public static final Item RAW_BLUECRYSTAL = registerItem("raw_bluecrystal",
            new Item(new FabricItemSettings()));
    // ultrafire
    public static final Item ULTRAFIRE_INGOT = registerItem("ultrafire_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RAW_ULTRAFIRE = registerItem("raw_ultrafire",
            new Item(new FabricItemSettings()));
    public static final Item ULTRAFIRE_NUGGET = registerItem("ultrafire_nugget",
            new Item(new FabricItemSettings()));
    // ultrafire tools
    public static final Item ULTRAFIRE_SWORD = registerItem("ultrafire_sword",
            new ModUltrafireSwordItem(ModToolMaterials.ULTRAFIRE, 3, 2f,
                    new FabricItemSettings()));
    public static final Item ULTRAFIRE_AXE = registerItem("ultrafire_axe",
            new AxeItem(ModToolMaterials.ULTRAFIRE, 5, 1f,
                    new FabricItemSettings()));
    public static final Item ULTRAFIRE_HOE = registerItem("ultrafire_hoe",
            new HoeItem(ModToolMaterials.ULTRAFIRE, 1, 0.5f,
                    new FabricItemSettings()));
    public static final Item ULTRAFIRE_PICKAXE = registerItem("ultrafire_pickaxe",
            new PickaxeItem(ModToolMaterials.ULTRAFIRE, 2, 1f,
                    new FabricItemSettings()));
    public static final Item ULTRAFIRE_SHOVEL = registerItem("ultrafire_shovel",
            new ShovelItem(ModToolMaterials.ULTRAFIRE, 1, 0.5f,
                    new FabricItemSettings()));




    //register item
    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SpaceInvasion.MOD_ID, name), item);
    }


    //adds items to Itemgroup
    public static void addItemToItemGroup() {
        //bluecrystal added to spacemetal
        addToItemGroup(ModItemGroup.SPACEMETAL, BLUECRYSTAL);
        addToItemGroup(ModItemGroup.SPACEMETAL, RAW_BLUECRYSTAL);
        //ultrafire added to spacemetal
        addToItemGroup(ModItemGroup.SPACEMETAL, ULTRAFIRE_INGOT);
        addToItemGroup(ModItemGroup.SPACEMETAL, RAW_ULTRAFIRE);
        addToItemGroup(ModItemGroup.SPACEMETAL, ULTRAFIRE_NUGGET);
        // ultrafire tools added to spacetools
        addToItemGroup(ModItemGroup.SPACETOOLS, ULTRAFIRE_SWORD);
        addToItemGroup(ModItemGroup.SPACETOOLS, ULTRAFIRE_AXE);
        addToItemGroup(ModItemGroup.SPACETOOLS, ULTRAFIRE_HOE);
        addToItemGroup(ModItemGroup.SPACETOOLS, ULTRAFIRE_PICKAXE);
        addToItemGroup(ModItemGroup.SPACETOOLS, ULTRAFIRE_SHOVEL);
    }

    // method that adds item to gruop used in addItemToItemGroup method
    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    // register to main class
    public static void registerModItems() {
        SpaceInvasion.LOGGER.info("registering af item " + SpaceInvasion.MOD_ID);

        addItemToItemGroup();
    }
}
