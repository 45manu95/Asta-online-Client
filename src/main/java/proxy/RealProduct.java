package proxy;

import java.util.List;
import adapter.ServerGenerico;
import adapter.ServerGrpc;
import astaOnlineProto.AstaOnLine.Articolo;
import astaOnlineProto.AstaOnLine.Empty;
import singleton.ServerIstance;

public class RealProduct implements ProductLoader {
	private final ServerGrpc server = ServerIstance.getIstance();

	@Override
	public List<Articolo> loadProducts() {
		Empty empty = null;
		List<Articolo> listaArticoli = server.getArticoliInVendita(empty);
		return listaArticoli;		
	}
	

}
