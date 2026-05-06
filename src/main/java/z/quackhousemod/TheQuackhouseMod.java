package z.quackhousemod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheQuackhouseMod implements ModInitializer {
	public static final String MOD_ID = "the-quackhouse-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Your duckies await!");
	}
}