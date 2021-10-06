package negocio.dao.factory;

import negocio.dao.iDAO;
import negocio.dao.implementacion.LibrosImpl;
import negocio.dominio.Libros;

public class LibrosFactory {

	public static iDAO<Libros> getImplementation(String source) {
		if (source.equals("BD")) {
			return new LibrosImpl();
		}

		return null;
	}

}
