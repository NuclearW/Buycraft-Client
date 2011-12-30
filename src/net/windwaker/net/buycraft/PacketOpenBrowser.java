package net.windwaker.net.buycraft;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.spoutcraft.spoutcraftapi.io.AddonPacket;
import org.spoutcraft.spoutcraftapi.io.SpoutInputStream;
import org.spoutcraft.spoutcraftapi.io.SpoutOutputStream;

public class PacketOpenBrowser extends AddonPacket {

	public void read(SpoutInputStream in) {

	}

	public void run() {
		if (Desktop.isDesktopSupported()) {
	        Desktop desktop = Desktop.getDesktop();
	        if (desktop.isSupported(Desktop.Action.BROWSE)) {
	            try {
	                desktop.browse(new URI("http://google.com")); // URL sent by packet here
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

	public void write(SpoutOutputStream out) {
		
	}

}
