package net.ranold.rpg;

import net.fabricmc.api.ModInitializer;

import net.ranold.rpg.effect.ModEffects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//comment
public class RanoldsPaleGarden implements ModInitializer {
	public static final String MOD_ID = "rpg";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModEffects.registerEffects();

	}
}