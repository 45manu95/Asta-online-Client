package proxy;

import java.util.List;
import adapter.ServerGrpc;
import astaOnlineProto.AstaOnLine.Articolo;
import astaOnlineProto.AstaOnLine.Empty;
import singleton.ServerIstance;
import singleton.UserIstance;

/**
 * DESIGN PATTERN PROXY
 * Classe effettiva dove vengono caricati gli articoli
 */
public class RealProduct implements ProductLoader {
	private final ServerGrpc server = ServerIstance.getIstance();

	@Override
	public List<Articolo> loadProducts(int id) {
		List<Articolo> listaArticoli;
		Empty empty = null;
		if(id == 1) {
			listaArticoli = server.getArticoliInVendita(empty);
		}
		else if(id == 2) {
			listaArticoli = server.visualizzaArticoliAcquistati(UserIstance.getIstance());
		}
		else {
			listaArticoli = server.visualizzaArticoliRegistrati(UserIstance.getIstance());
		}
		return listaArticoli;		
	}
	

}
