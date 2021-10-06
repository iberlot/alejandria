package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class cerrarSession
 */
@WebServlet("/cerrarSession")
public class cerrarSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public cerrarSession() {
		super();
//		System.out.println("Hola");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println("Hola3");
		// TODO Auto-generated method stub
		HttpSession misession = request.getSession(true);
		misession.setAttribute("nombreUsuario", null);

		PrintWriter out = response.getWriter();
// FIXME que carajo, como lo muestro??

		out.write("<jsp:include page='/WEB-INF/common/header.jsp'></jsp:include>");
		out.print("<div class='container'>");
		out.print("<span class='dark'>Gracias por preferirnos.</span>");
		out.print("<Br /><Br /><a href='index.jsp' class='nav-link active' aria-current='page'>Home</a>");
		out.print("</div>");
		out.write("<jsp:include page='/WEB-INF/common/footer.html'></jsp:include>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println("Hola2");

		// TODO Auto-generated method stub
//		HttpSession misession = request.getSession(true);
//		misession.setAttribute("nombreUsuario", null);
//
//		request.getRequestDispatcher("salir.jsp").forward(request, response);
		doGet(request, response);
	}

}
