package singleton;

import adapter.ServerGrpc;
import astaOnlineProto.AstaServiceGrpc;

public class ServerIstance {
	private static ServerGrpc server;
	private static String host;
	private static int port;
	
	public static void setDati(String host, int port) {
		ServerIstance.host = host;
		ServerIstance.port = port;
	}
	
	public static ServerGrpc getIstance() {
		if(server == null) {
			server = new ServerGrpc();
			server.openSocket(host, port);
		}
		return server;
	}
	
	public static AstaServiceGrpc.AstaServiceBlockingStub getBlockingStub() {
		if(server == null) {
			server = new ServerGrpc();
			server.openSocket(host, port);
		}
		return server.getBlockingStub();
	}
}
