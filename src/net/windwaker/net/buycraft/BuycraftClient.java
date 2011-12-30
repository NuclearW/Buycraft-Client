package net.windwaker.net.buycraft;

import java.util.logging.Level;

import org.spoutcraft.spoutcraftapi.Spoutcraft;
import org.spoutcraft.spoutcraftapi.addon.java.JavaAddon;
import org.spoutcraft.spoutcraftapi.io.AddonPacket;

public class BuycraftClient extends JavaAddon {
	
	public void onEnable() {
		AddonPacket.register(PacketOpenBrowser.class, "BuycraftClient");
		Spoutcraft.getLogger().log(Level.INFO, "Buycraft Client enabled!");
	}
	
	public void onDisable() {
		Spoutcraft.getLogger().log(Level.INFO, "Buycraft Client disabled.");
	}
}