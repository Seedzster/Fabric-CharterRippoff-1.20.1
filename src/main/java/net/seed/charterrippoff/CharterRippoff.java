package net.seed.charterrippoff;

import net.fabricmc.api.ModInitializer;

import net.seed.charterrippoff.item.ModItems;
import net.seed.charterrippoff.item.ModItemsGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharterRippoff implements ModInitializer {
	public static final String MOD_ID = "charterrippoff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();

		ModItems.registerModItems();
	}
}