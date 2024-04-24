package proxy;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.List;
import astaOnlineProto.AstaOnLine.Articolo;

/**
 * DESIGN PATTERN PROXY
 * 
 */

public class RemoteProductLoaderProxy implements ProductLoader {
	private RealProduct realProductLoader;

    @Override
    public List<Articolo> loadProducts() {
    	/**
    	 * controllo connessione di rete
    	 */
        try {
        	int timeout = 2000;
        	InetAddress[] addresses = InetAddress.getAllByName("127.0.0.1");
        	  for (InetAddress address : addresses) {
        	    if (address.isReachable(timeout))
        	       	if(realProductLoader == null) {
        	       		realProductLoader = new RealProduct();
                        return realProductLoader.loadProducts();
                	}
        	  }
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
        //mancata connessione
        return List.of();
    }

}
