package main;

import gui.FinestraLogin;
import singleton.ServerIstance;

public class Main {
	
	public static void main(String[] args) {
		final int port = 8989;
		final String host = "127.0.0.1";
		
		ServerIstance.setDati(host, port);
		
		FinestraLogin finestra = new FinestraLogin();
		finestra.setVisible(true);
	}

}
