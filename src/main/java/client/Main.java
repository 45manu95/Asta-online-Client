package client;

import gui.FinestraLogin;

public class Main {
	
	public static void main(String[] args) {
		final int port = 8989;
		final String host = "127.0.0.1";
		
		FinestraLogin finestra = new FinestraLogin();
		finestra.setVisible(true);
	}

}
