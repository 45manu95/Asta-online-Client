package singleton;

import astaOnlineProto.AstaOnLine.Utente;

/**
 * DESIGN PATTERN SINGLETON
 * Utilizzato per avere una sola istanza globale di strutture dati e metodi per accedervi.
 * In questo modo si possono utilizzare le informazioni dell'utente dovunque.
 */
public class UserIstance {
	private static Utente utente;
	private static String email;
	private static String password;
	
	public static void setDati(String email, String password) {
		UserIstance.email = email;
		UserIstance.password = password;
	}
	
	public static Utente getIstance() {
		if(utente == null) {
			utente = Utente.newBuilder().setEmail(email).setPassword(password).build();
		}
		return utente;
	}
}
