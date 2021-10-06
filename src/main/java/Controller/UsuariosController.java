package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.dao.iDAO;
import negocio.dao.factory.ClientesFactory;
import negocio.dominio.Clientes;

/**
 * Servlet implementation class UsuariosController
 */
@WebServlet("/UsuariosController")
public class UsuariosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsuariosController() {
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
		// TODO Auto-generated method stub
//		doGet(request, response);

		if (request.getParameter("accion") != null) {
			if (request.getParameter("accion").equals("alta")) {

				iDAO<Clientes> clienteDAO = ClientesFactory.getImplementation("BD");

				Clientes cli = new Clientes();

				cli.setApellido(request.getParameter("apellido"));
				cli.setDni(Long.parseLong(request.getParameter("dni")));
				cli.setEmail(request.getParameter("email"));
				cli.setNombre(request.getParameter("nombre"));
				cli.setPassword(request.getParameter("password"));
				cli.setTelefono(Long.parseLong(request.getParameter("telefono")));

				clienteDAO.add(cli);

			} else {

				request.getSession().setAttribute("Error", "Contraseña o usuario incorrecto");
				request.getRequestDispatcher("login.jsp").forward(request, response);

				System.out.println();
			}

		}
	}

}
