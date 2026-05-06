package z.quackhousemod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import z.quackhousemod.item.QuackhouseItems;

public class TheQuackhouseMod implements ModInitializer {
	public static final String MOD_ID = "quackhousemod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		QuackhouseItems.registerQuackhouseItems();

		LOGGER.info("Your duckies await!");
	}
}