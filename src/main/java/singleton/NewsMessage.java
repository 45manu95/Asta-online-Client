package singleton;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * DESIGN PATTERN SINGLETON
 * Utilizzato per avere una sola istanza globale di strutture dati e metodi per accedervi
 */
public class NewsMessage {
	/**
	 * Per raccogliere la lista di news da visualizzare nel pannello grafico
	 */
	private static LinkedList<String> news = new LinkedList<String>();
	/**
	 * Per sapere a quale indice di uno specifico prodotto dobbiamo inviare alla struttura dati del server per ottenere il successivo messaggio
	 */
	private static Map<Integer, Integer> rememberIndex = new HashMap<Integer, Integer>();
	
	public static LinkedList<String> getIstance() {
		return news;
	}
	
	public static void aggiungiMessaggio(String message) {
		news.add(message);
	}
	
	public static void setIndex(int articolo_id, int index) {
		rememberIndex.put(articolo_id, index);
	}
	
	public static int getIndex(int articolo_id) {
		if(rememberIndex.containsKey(articolo_id)) {
			return rememberIndex.get(articolo_id);
		}
		else {
			/**
			 * significa che è la prima volta che si invia un offerta per quel
			 * determinato prodotto e quindi si richiede dal server la prima notifica.
			 */
			return 0; 
		}
	}
}
