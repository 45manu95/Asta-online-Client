package adapter;

import java.util.List;
import java.util.concurrent.TimeUnit;

import astaOnlineProto.AstaOnLine.Articoli;
import astaOnlineProto.AstaOnLine.Articolo;
import astaOnlineProto.AstaOnLine.Empty;
import astaOnlineProto.AstaOnLine.MessaggioGenerico;
import astaOnlineProto.AstaOnLine.Offerta;
import astaOnlineProto.AstaOnLine.Utente;
import astaOnlineProto.AstaServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/*
 * DESIGN PATTERN ADAPTER
 * Possiamo identificare le seguenti componenti in questo file java:
 * 
 * Adapter: La classe ServerGrpc funge da Adapter. Questa classe adatta 
 * l'interfaccia del server gRPC alle operazioni di asta richieste all'interno 
 * del nostro sistema.
 * 
 * Adaptee: Il server gRPC (come rappresentato dalla classe generata 
 * AstaServiceGrpc.AstaServiceBlockingStub) funge da Adaptee. 
 * Questo è l'oggetto con cui il nostro Adapter (la classe GRPCAdapter) 
 * deve interagire per eseguire le operazioni di asta. 
 * Tuttavia, l'interfaccia fornita dal server gRPC potrebbe non essere 
 * compatibile direttamente con l'interfaccia del nostro 
 * sistema, quindi abbiamo bisogno di un adattatore per far sì che le due 
 * interfacce siano compatibili.
 */

public class ServerGrpc implements ServerGenerico {
	  private  ManagedChannel channel;
	  private  AstaServiceGrpc.AstaServiceBlockingStub blockingStub;
	  
	  @Override
	  public void openSocket(String host, int port) {
	        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
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
	  
	  public AstaServiceGrpc.AstaServiceBlockingStub getBlockingStub() {
	        return blockingStub;
	  }

	  @Override
	  public MessaggioGenerico registraUtente(Utente utente) {
		MessaggioGenerico messaggio = blockingStub.registraUtente(utente);
		return messaggio;
	  }

	  @Override
	  public MessaggioGenerico accediUtente(Utente utente) {
		MessaggioGenerico messaggio = blockingStub.accediUtente(utente);
		return messaggio;
	  }

	  @Override
	  public MessaggioGenerico notificaSuccesso(Empty empty) {
		  MessaggioGenerico messaggio = blockingStub.notificaSuccesso(empty);
		  return messaggio;
	  }

	  @Override
	  public List<Articolo> visualizzaArticoliAcquistati(Utente utente) {
		  Articoli articoli = blockingStub.visualizzaArticoliAcquistati(utente);
		  List<Articolo> listaArticoli = articoli.getArticoliList();
		  return listaArticoli;
	  }

	  @Override
	  public List<Articolo> visualizzaArticoliRegistrati(Utente utente) {
		  Articoli articoli = blockingStub.visualizzaArticoliRegistrati(utente);
		  List<Articolo> listaArticoli = articoli.getArticoliList();
		  return listaArticoli;
	  }

	  @Override
	  public MessaggioGenerico inviaOfferta(Offerta offerta) {
		  MessaggioGenerico messaggio = blockingStub.inviaOfferta(offerta);
		  return messaggio;
	  }

	  @Override
	  public List<Articolo> getArticoliInVendita(Empty empty) {
		  Empty request = Empty.newBuilder().build();
		  Articoli articoli = blockingStub.getArticoliInVendita(request);
		  List<Articolo> listaArticoli = articoli.getArticoliList();
		  return listaArticoli;
	  }

	  @Override
	  public MessaggioGenerico riceviNotifiche(Articolo articolo) {
		  MessaggioGenerico messaggio = blockingStub.riceviNotifiche(articolo);
		  return messaggio;
	  }

}
