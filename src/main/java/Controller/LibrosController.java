package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.dao.iDAO;
import negocio.dao.factory.AutoresFactory;
import negocio.dao.factory.EditorialesFactory;
import negocio.dao.factory.LibrosFactory;
import negocio.dominio.Autores;
import negocio.dominio.Editoriales;
import negocio.dominio.Libros;

/**
 * Servlet implementation class LibrosController
 */
@WebServlet("/LibrosController")
public class LibrosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LibrosController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("accion") != null) {
			if (request.getParameter("accion").equals("alta")) {

				iDAO<Libros> librosDAO = LibrosFactory.getImplementation("BD");

				iDAO<Autores> autorDAO = AutoresFactory.getImplementation("BD");
				iDAO<Editoriales> editorialDAO = EditorialesFactory.getImplementation("BD");

				Libros libro = new Libros();

				libro.setAutor(autorDAO.findId(Long.parseLong(request.getParameter("autor"))));
				libro.setEditoriales(null);

				libro.setEdicion(request.getParameter("edicion"));
				libro.setGenero(request.getParameter("genero"));
				libro.setIsbn(request.getParameter("isbn"));
				libro.setPaginas(Integer.parseInt(request.getParameter("paginas")));
				libro.setTitulo(request.getParameter("titulo"));

				librosDAO.add(libro);

			} else {

				request.getSession().setAttribute("Error", "Contraseña o usuario incorrecto");
				request.getRequestDispatcher("login.jsp").forward(request, response);

				System.out.println();
			}

		}
	}

}
