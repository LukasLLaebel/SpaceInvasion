package net.lukasleander.spaceinvasion.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lukasleander.spaceinvasion.SpaceInvasion;
import net.lukasleander.spaceinvasion.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // bluecrystal
    public static final Block BLUECRYSTAL_BLOCK = registerBlock("bluecrystal_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3.0f).requiresTool()), ModItemGroup.SPACEMETAL);
    public static final Block BLUECRYSTAL_ORE = registerBlock("bluecrystal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool()), ModItemGroup.SPACEMETAL);
    public static final Block DEEPSLATE_BLUECRYSTAL_ORE = registerBlock("deepslate_bluecrystal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), ModItemGroup.SPACEMETAL);
    // ultrafire
    public static final Block ULTRAFIRE_ORE = registerBlock("ultrafire_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5.0f).requiresTool()), ModItemGroup.SPACEMETAL);
    // meteorite stone
    public static final Block METEORITESTONE = registerBlock("meteoritestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5.0f).requiresTool()), ModItemGroup.SPACESTONES);
    // spacestone
    public static final Block SPACESTONE = registerBlock("spacestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.SPACESTONES);
    public static final Block SPACECOBBLE = registerBlock("spacecobble",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool()), ModItemGroup.SPACESTONES);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(SpaceInvasion.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(SpaceInvasion.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModblocks() {
        SpaceInvasion.LOGGER.info("registering af blocks " + SpaceInvasion.MOD_ID);
    }
}
