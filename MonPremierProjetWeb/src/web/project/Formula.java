package web.project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Formula
 */
@WebServlet("/Formula")
public class Formula extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formula() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 this.getServletContext().getRequestDispatcher("/WEB-INF/Identification.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String nom = request.getParameter("nom");
		 String prenom= request.getParameter("prenom");
		 String email = request.getParameter("email");
		 String login = request.getParameter("login");
		 String password = request.getParameter("password");
		 
		 request.setAttribute("nom", nom);
		 request.setAttribute("prenom", prenom);
		 request.setAttribute("email", email);
		 request.setAttribute("login", login);
		 request.setAttribute("password", password);
		 
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/recap.jsp").forward(request, response);
		
	}	

}
