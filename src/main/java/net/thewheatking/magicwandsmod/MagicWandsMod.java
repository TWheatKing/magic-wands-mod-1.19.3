package net.thewheatking.magicwandsmod;

import net.fabricmc.api.ModInitializer;

import net.thewheatking.magicwandsmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicWandsMod implements ModInitializer {
	public static final String MOD_ID = "magicwandsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("magicwandsmod");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}