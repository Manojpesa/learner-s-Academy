package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Servlet implementation class ProductDetails
 */
@WebServlet("/ProductDetails")
public class ClassDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClassDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();
			
			HttpSession httpsession = request.getSession();
			
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
			response.setDateHeader("Expires", 0);

			if(httpsession.getAttribute("USERNAME") == null || httpsession.getAttribute("PASSWORD") == null  )
			{
				response.sendRedirect("index.jsp");	
			}

			List<ClassMaster> classMasterList = session.createQuery("from ClassMaster").list();
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<b>Available Classes</b><br><hr>");

			for (ClassMaster p : classMasterList) {
				out.println("<b>"+String.valueOf(p.getID()) + ") " + p.getClassname() + " Class</b>" + "<a href='report?classId=" + String.valueOf(p.getID()) + "'> ==>Report Card</a><br>");
				out.println("<hr>");
			}
			out.println("</body></html>");
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
