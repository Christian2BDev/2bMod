package com.heckvision.tbmod;

import com.heckvision.tbmod.client.openCmd;
import com.heckvision.tbmod.client.drawOverlayHUD;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TbMod implements ModInitializer {
	public static final String MOD_ID = "tbmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static  final boolean TIMMIE_CROSSHAIR = true;
	public static  final boolean ENDERNODE_TRACKER = true;

	//hypixel api key: f0575e72-b0f6-4981-953b-1b90cdf73447
	@Override
	public void onInitialize() {
		CommandRegistrationCallback.EVENT.register(openCmd::register);
		HudRenderCallback.EVENT.register(new drawOverlayHUD());
		LOGGER.info("[2B] enabling mod");
	}
}