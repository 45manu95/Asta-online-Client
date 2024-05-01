package singleton;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class NewsMessage {
	private static LinkedList<String> news = new LinkedList<String>();
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
			return 0;
		}
	}
}
