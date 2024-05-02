package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Metodi che potrebbero servire per arricchire il sistema di dettagli e renderlo completo.
 */
public class Utils {
	public static String crittografia(String message) {
		try {
            // Ottenere un'istanza del MessageDigest con l'algoritmo SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Calcolare l'hash della stringa
            byte[] hashBytes = digest.digest(message.getBytes());

            // Convertire i byte dell'hash in una rappresentazione esadecimale
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                // Convertire il byte in esadecimale e aggiungerlo alla stringa esadecimale
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            // Restituire la rappresentazione esadecimale dell'hash
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // Gestire l'eccezione nel caso in cui l'algoritmo specificato non sia supportato
            e.printStackTrace();
            return null;
        }
	}
}
