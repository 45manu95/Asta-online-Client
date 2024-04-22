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
	private ProductLoader realProductLoader;

    @Override
    public List<Articolo> loadProducts() {
    	/**
    	 * controllo connessione di rete
    	 */
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                if (networkInterface.isUp() && !networkInterface.isLoopback()) {
                    Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
                    while (addresses.hasMoreElements()) {
                        InetAddress address = addresses.nextElement();
                        if (!address.isLinkLocalAddress() && !address.isLoopbackAddress() && !address.isSiteLocalAddress()) {
                        	if(realProductLoader == null) {
                                return realProductLoader.loadProducts();
                        	}
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //mancata connessione
        return List.of();
    }

}
