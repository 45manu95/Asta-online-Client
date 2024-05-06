package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import adapter.ServerGrpc;
import astaOnlineProto.AstaOnLine.MessaggioGenerico;
import astaOnlineProto.AstaOnLine.Offerta;

class AstaClientTest {
	private ServerGrpc server;

	@Test
	void inviaOfferta() {
		server = new ServerGrpc();
		server.openSocket("127.0.0.1", 8989);
		assertNotNull(server);
		Offerta offerta = Offerta.newBuilder().setArticoloId(40).setEmailUser("prova1@gmail.com").setValoreOfferta(500).build();
		MessaggioGenerico message = server.getBlockingStub().inviaOfferta(offerta);
		String firstWord[] = message.getMessaggio().split(" ", 2);
		assertEquals(firstWord[0],"SUCCESSO");
		server = null;
		assertNull(server);
	}

}
