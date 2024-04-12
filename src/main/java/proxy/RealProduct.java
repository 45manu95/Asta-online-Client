package proxy;

import java.util.List;
import adapter.ServerGenerico;
import astaOnlineProto.AstaOnLine.Articolo;
import astaOnlineProto.AstaOnLine.Empty;

public class RealProduct implements ProductLoader {
	private final ServerGenerico server;
	
	public RealProduct(ServerGenerico server) {
	    this.server = server;
	}

	@Override
	public List<Articolo> loadProducts() {
		Empty empty = null;
		List<Articolo> listaArticoli = server.getArticoliInVendita(empty);
		return listaArticoli;		
	}
	

}
