package negocio.dao.factory;

import negocio.dao.iDAO;
import negocio.dao.implementacion.AdministrativosImpl;
import negocio.dominio.Administrativos;

public class AdminFactory {

	public static iDAO<Administrativos> getImplementation(String source) {
		if (source.equals("BD")) {
			return new AdministrativosImpl();
		}

		return null;
	}

}
