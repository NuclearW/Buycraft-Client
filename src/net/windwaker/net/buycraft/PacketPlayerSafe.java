package net.windwaker.net.buycraft;

import org.spoutcraft.spoutcraftapi.entity.Player;
import org.spoutcraft.spoutcraftapi.io.AddonPacket;
import org.spoutcraft.spoutcraftapi.io.SpoutInputStream;
import org.spoutcraft.spoutcraftapi.io.SpoutOutputStream;

public class PacketPlayerSafe extends AddonPacket {
	
	public String name;
	
	public PacketPlayerSafe(Player player) {
		this.name = player.getName();
	}

	public void read(SpoutInputStream in) {
		in.readString();
	}

	public void run() {
		
	}

	public void write(SpoutOutputStream out) {
		out.writeString(name);
	}
}