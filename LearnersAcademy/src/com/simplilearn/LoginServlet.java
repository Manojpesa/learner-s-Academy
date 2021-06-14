package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NameServlet
 */
@WebServlet("/NameServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(userName != null && password != null ){
			if(userName.equals("admin") && password.equals("admin")){
				HttpSession session = request.getSession();
				session.setAttribute("USERNAME", userName);
				session.setAttribute("PASSWORD", password);
				
				response.sendRedirect("dashboard.jsp");
			}else{
				PrintWriter out = response.getWriter();
		        out.println("<html><body>");
//		        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
//				response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
//		        response.setDateHeader("Expires", 0);
		        out.println("Invalid entries<br>");
				//out.println("<a href='http://localhost:8080/LearnersAcademy/'>retry</a><br>");
		        out.println("</body></html>");
				response.sendRedirect("index.jsp");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}