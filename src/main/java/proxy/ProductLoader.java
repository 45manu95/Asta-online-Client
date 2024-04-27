package proxy;

import java.util.List;

import astaOnlineProto.AstaOnLine.Articolo;

/**
 * DESIGN PATTERN PROXY
 * Utilizzato per avere un surrogato e sostituire la lista di prodotti, in attesa che
 * essa venga scaricata per renderla disponibile al cliente.
 * La classe ProductLoader funge da Subject
 */

public interface ProductLoader {
    List<Articolo> loadProducts(int id);
}
