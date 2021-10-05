package controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.dao.iDAO;
import negocio.dao.factory.ClientesFactory;
import negocio.dominio.Clientes;

/**
 * Servlet implementation class HolaMundoServlet
 */
@WebServlet("/servletLogin")
public class servletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servletLogin() {
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

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		iDAO<Clientes> clienteDAO = ClientesFactory.getImplementation("BD");

		Clientes cli = (Clientes) clienteDAO.findId(Long.parseLong(request.getParameter("documento")));

		if (cli.getPassword().equals(request.getParameter("password"))) {

			Cookie cookieUs = new Cookie("nombreUsuario",
					URLEncoder.encode(request.getParameter("documento"), "UTF-8"));
			Cookie cookieClave = new Cookie("claveUsuario",
					URLEncoder.encode(request.getParameter("password"), "UTF-8"));
			cookieUs.setMaxAge(365 * 24 * 60 * 60);
			cookieClave.setMaxAge(365 * 24 * 60 * 60);
			response.addCookie(cookieUs);
			response.addCookie(cookieClave);

		} else {

			request.getSession().setAttribute("Error", "Contraseña o usuario incorrecto");
			request.getRequestDispatcher("login.jsp").forward(request, response);

			System.out.println("Nombre: " + cli.getNombre());
			System.out.println("Pass: " + cli.getPassword());
		}
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}
}
