package net.windwaker.net.buycraft;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.spoutcraft.spoutcraftapi.io.AddonPacket;
import org.spoutcraft.spoutcraftapi.io.SpoutInputStream;
import org.spoutcraft.spoutcraftapi.io.SpoutOutputStream;

public class PacketOpenBrowser extends AddonPacket {
	private String url;

	@Override
	public void read(SpoutInputStream in) {
		this.url = inputStream.readString();
		if(this.url == null) {
			this.url = "null";
		}
	}

	@Override
	public void run() {
		if (Desktop.isDesktopSupported()) {
	        Desktop desktop = Desktop.getDesktop();
	        if (desktop.isSupported(Desktop.Action.BROWSE)) {
	            try {
	                desktop.browse(new URI(this.url));
	            }
	            catch(IOException ioe) {
	                ioe.printStackTrace();
	            }
	            catch(URISyntaxException use) {
	                use.printStackTrace();
	            }
	        }
	    }
	}

	@Override
	public void write(SpoutOutputStream out) {
		ouputStream.writeString("PacketOpenBrowser");
	}

}
