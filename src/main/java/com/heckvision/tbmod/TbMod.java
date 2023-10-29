package com.heckvision.tbmod;

import com.heckvision.tbmod.client.openCmd;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TbMod implements ModInitializer {
	public static final String MOD_ID = "tbmod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CommandRegistrationCallback.EVENT.register(openCmd::register);
		LOGGER.info("Hello Fabric world!");
	}
}