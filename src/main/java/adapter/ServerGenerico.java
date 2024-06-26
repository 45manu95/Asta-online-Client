package adapter;

import java.util.List;

import astaOnlineProto.AstaOnLine.Articolo;
import astaOnlineProto.AstaOnLine.ArticoloNotifica;
import astaOnlineProto.AstaOnLine.Empty;
import astaOnlineProto.AstaOnLine.MessaggioGenerico;
import astaOnlineProto.AstaOnLine.Offerta;
import astaOnlineProto.AstaOnLine.Utente;

/**
 * DESIGN PATTERN ADAPTER
 * Target: L'interfaccia Server rappresenta il Target.
 * Questa è l'interfaccia che il client del nostro sistema utilizza 
 * per eseguire le operazioni di asta, come avviare il sistema o terminarlo.
 */

public interface ServerGenerico {
    /**
     * apriSocket() instaura una connessione.
     *
     * @param host può essere un indirizzo IP,un hostmane o un alias di un hostname, rappresenta un tipo String.
     * @param port indica la porta su cui il server rimane in ascolto, rappresenta un intero.
     */
	void openSocket(String host, int port);
 
	 /**
     * closeSocket() chiude la conenssione e libera le risorse
     *
     * @throws InterruptedException potremmo riceve un'eccezione se interrompiamo il tutto in un momento di lavoro del sistema
     */
    void closeSocket() throws InterruptedException;
    
     /**
     * registraUtente() fa registrare l'utente al sistema
     * 
     * @param utente serve per trasferire le sue informazioni per la registrazione
     * @return un messaggio di avvenuta registrazione o di un imprevisto (es. email esistente)
     * @see Utente
     * @see MessaggioGenerico
     */
    MessaggioGenerico registraUtente(Utente utente); //

    /**
    * accediUtente() fa accedere l'utente al sistema
    * 
    * @param utente serve per trasferire le sue informazioni per l'accesso
    * @return un messaggio di avvenuto accesso o di un imprevisto (es. password errata)
    * @see Utente
    * @see MessaggioGenerico
    */
    MessaggioGenerico accediUtente(Utente utente);
	
    /**
    * visualizzaArticoliAcquistati() visualizza gli articoli acquistati da utente
    * 
    * @param utente per capire di chi prendere gli articoli acquistati
    * @return lista articoli acquistati. Se la lista risulta vuola allora l'utente non ha acquistato o vinto alcun'asta.
    * @see Articolo
    * @see Utente
    */
	List<Articolo> visualizzaArticoliAcquistati(Utente utente);
	
	/**
	* visualizzaArticoliRegistrati() visualizza gli articoli per i quali l'utente sta partecipando all'asta
	* 
    * @param utente per capire di chi prendere gli articoli interessati
	* @return lista articoli interessati. Se la lista risulta vuola allora l'utente non sta partecipando ad alcun'asta.
	* @see Articolo
	* @see Utente
	*/	
	List<Articolo> visualizzaArticoliRegistrati(Utente utente);
	
	/**
	* inviaOfferta() gestisce l'invio dell'offerta per un certo oggetto
	* 
    * @param offerta contenente id utente, id prodotto e prezzo proposto
	* @return messaggio avvenuta ricezione
	* @see Messaggio generico
	* @see Offerta
	*/	
	MessaggioGenerico inviaOfferta(Offerta offerta);
	
	/**
	* getArticoliInVendita() ottiene una lista di tutti gli articoli attualmente in vendita
	* 
	* @return lista di articoli in vendita
	* @see Articolo
	*/	
	List<Articolo> getArticoliInVendita(Empty empty);
	
	/**
	* riceviNotifiche() per far si che l'utente riceva messaggi in merito alla conlusione di un asta o se qualcuno ha aumentato l'offerta
	* 
	* @return messaggio di avviso
	* @see MessaggioGenerico
	*/	
	MessaggioGenerico riceviNotifiche(ArticoloNotifica articoloNotifica);

}

