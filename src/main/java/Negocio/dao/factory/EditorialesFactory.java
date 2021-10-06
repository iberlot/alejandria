package negocio.dao.factory;

import negocio.dao.iDAO;
import negocio.dao.implementacion.EditorialesImpl;
import negocio.dominio.Editoriales;

public class EditorialesFactory {

	public static iDAO<Editoriales> getImplementation(String source) {
		if (source.equals("BD")) {
			return new EditorialesImpl();
		}

		return null;
	}

}
