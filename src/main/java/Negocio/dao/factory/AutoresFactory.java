package negocio.dao.factory;

import negocio.dao.iDAO;
import negocio.dao.implementacion.AutoresImpl;
import negocio.dominio.Autores;

public class AutoresFactory {

	public static iDAO<Autores> getImplementation(String source) {
		if (source.equals("BD")) {
			return new AutoresImpl();
		}

		return null;
	}

}
