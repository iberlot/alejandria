package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HolaMundoDos
 */

public class HolaMundoDos extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private List<Usuario> usuarios;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolaMundoDos() {
        super();
        this.usuarios = new ArrayList<Usuario>(
        		Arrays.asList(new Usuario("mmacrino", "1234", "Matias Macrino"),
        				new Usuario("abeker", "1234", "Alan Beker"),
        				new Usuario("abader", "1234", "Alejandro Bader")
        				)        		
        		);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Chau Mundo");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		session.setAttribute("atributo1", "");
		
		boolean correcto = false;
		
		for(Usuario user : this.usuarios){
			if(username.equals(user.getUserName()) && password.equals(user.getPassword())){
				correcto = true;
				request.setAttribute("nombre", user.getNombre());
				break;
			}
		}
		
		if(correcto){
			//Redirec a jsp enviamos el nombre
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/bienvenido.jsp");			
			dispatcher.forward(request, response);
			
			//response.sendRedirect("/bienvenido.jsp");
		} else {
			response.getWriter().append("Credenciales incorrectas");
		}
	}

}
