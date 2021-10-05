package negocio.dao.factory;

import negocio.dao.implementacion.ClientesImpl;
import negocio.dominio.Clientes;
import negocio.dao.iDAO;

public class ClientesFactory {

	
	public static iDAO<Clientes> getImplementation(String source) {
		if (source.equals("BD")) {
			return new ClientesImpl();
		}

		return null;
	}
	
}
