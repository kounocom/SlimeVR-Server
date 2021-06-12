package io.eiren.vr;

import java.io.File;

import io.eiren.gui.VRServerGUI;
import io.eiren.util.logging.LogManager;


public class Main {
	
	public static void main(String[] args) {
		System.setProperty("awt.useSystemAAFontSettings", "on");
		System.setProperty("swing.aatext", "true");
		
		File dir = new File("").getAbsoluteFile();
		try {
			LogManager.initialize(new File(dir, "logs/"), dir);
		} catch(Exception e1) {
			e1.printStackTrace();
		}
		
		VRServer vrServer = new VRServer();
		vrServer.start();
		
		new VRServerGUI(vrServer);
	}
	
}