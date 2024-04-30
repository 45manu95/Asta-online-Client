package singleton;

import java.util.LinkedList;

public class NewsMessage {
	private static LinkedList<String> news = new LinkedList<String>();;

	
	public static LinkedList<String> getIstance() {
		return news;
	}
	
	public static void aggiungiMessaggio(String message) {
		news.add(message);
	}
}
