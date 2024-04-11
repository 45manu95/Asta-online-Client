package adapter;

import java.util.List;
import java.util.concurrent.TimeUnit;

import astaOnlineProto.AstaOnLine.Articolo;
import astaOnlineProto.AstaOnLine.Empty;
import astaOnlineProto.AstaOnLine.MessaggioGenerico;
import astaOnlineProto.AstaOnLine.Offerta;
import astaOnlineProto.AstaOnLine.Utente;
import astaOnlineProto.AstaServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ServerGrpc implements Server {
	  private  ManagedChannel channel;
	  private  AstaServiceGrpc.AstaServiceBlockingStub blockingStub;
	  
	  @Override
	  public void openSocket(String host, int port) {
	        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).useTransportSecurity().build();
	        /*
	         * useTransportSecurity() indica che si desidera utilizzare una connessione 
	         * sicura per la comunicazione con il server gRPC. Particolarmente utile in
	         * sistema, dove si ha a che fare con autenticazioni e gestione di
	         * risorse economiche 
	         */
	                
	        /*
	         * Generiamo uno stub bloccante, una classe generata dal compilatore gRPC 
	         * che fornisce metodi che possono essere chiamati in modo sincrono per 
	         * inviare richieste RPC al server e ricevere risposte. 
	         * Gli stub bloccanti attendono il completamento dell'operazione 
	         * prima di restituire il controllo al chiamante.
	         */
	        blockingStub = AstaServiceGrpc.newBlockingStub(channel);
	  }

	  @Override
	  public void closeSocket() throws InterruptedException {
	        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	        /*
	         * Questo metodo attende fino a che il canale non è completamente 
	         * terminato (chiuso) o fino a quando non è trascorso il tempo 
	         * specificato (5 secondi in questo caso), a seconda di quale 
	         * evento si verifica prima. Attendere un tempo limitato è utile 
	         * per evitare blocchi infiniti nel caso in cui il canale non si 
	         * chiuda correttamente per qualche motivo.
	         */
	  }

	  @Override
	  public Empty registraUtente(Utente utente) {
		  // TODO Auto-generated method stub
		return null;
	  }

	  @Override
	  public Empty accediUtente(Utente utente) {
		  // TODO Auto-generated method stub
		return null;
	  }

	  @Override
	  public MessaggioGenerico notificaSuccesso(Empty empty) {
		  // TODO Auto-generated method stub
		  return null;
	  }

	  @Override
	  public Articolo getArticoloInfo(Empty empty) {
		  // TODO Auto-generated method stub
		  return null;
	  }

	  @Override
	  public List<Articolo> visualizzaArticoliAcquistati(Utente utente) {
		  // TODO Auto-generated method stub
		  return null;
	  }

	  @Override
	  public List<Articolo> visualizzaArticoliRegistrati(Utente utente) {
		  // TODO Auto-generated method stub
		  return null;
	  }

	  @Override
	  public MessaggioGenerico inviaOfferta(Offerta offerta) {
		  // TODO Auto-generated method stub
		  return null;
	  }

	  @Override
	  public List<Articolo> getArticoliInVendita(Empty empty) {
		  // TODO Auto-generated method stub
		  return null;
	  }

	  @Override
	  public MessaggioGenerico riceviNotifiche(Empty empty) {
		  // TODO Auto-generated method stub
		  return null;
	  }

}
