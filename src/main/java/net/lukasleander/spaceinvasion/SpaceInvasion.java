package net.lukasleander.spaceinvasion;

import net.fabricmc.api.ModInitializer;

import net.lukasleander.spaceinvasion.block.ModBlocks;
import net.lukasleander.spaceinvasion.item.ModItemGroup;
import net.lukasleander.spaceinvasion.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpaceInvasion implements ModInitializer {
	public static final String MOD_ID = "spaceinvasion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();

		ModBlocks.registerModblocks();

	}
}