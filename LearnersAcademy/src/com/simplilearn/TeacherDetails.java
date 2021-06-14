package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Servlet implementation class TeacherDetails
 */
@WebServlet("/TeacherDetails")
public class TeacherDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String teachersId = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();
			
			HttpSession httpsession = request.getSession();
			//httpsession.setAttribute("teachersid", teachersId);
			
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
			response.setDateHeader("Expires", 0);

			if(httpsession.getAttribute("USERNAME") == null || httpsession.getAttribute("PASSWORD") == null  )
			{
				response.sendRedirect("index.jsp");	
			}
			
			boolean found = false; 
			
			List<Teacher> teacherList = session.createQuery("from Teacher").list();
			PrintWriter out = response.getWriter();
			
			out.println("<html><body>");
			out.println("<b>Search by ID</b>");
			out.println("<form method=\"POST\" action=\"teacherslist\">");
			out.println("Enter Teacher's ID: "+"<input type=\"text\" name=\"teachersid\" id=\"teachersid\" maxlength=30><br>");
			out.println("<input type=\"submit\" value=\"Search\">");
			out.println("</form>");
			
			out.println("<form method=\"GET\" action=\"teacherslist\">");
			out.println("<input type=\"submit\" value=\"Show All\">");
			out.println("</form><hr>");
			
			out.println("<b>Teacher Listing</b><br><hr>");

			if(teachersId == null){
				for (Teacher t : teacherList) {
					out.println(String.valueOf("<b>"+t.getTEACHERID()) + ") " + t.getName() + " </b><br>");

					Set<Subject> subject = t.getteachersubjects();
					out.println("<b>List of assigned Subjects:</b> <br>");
					int count = 0;
					for (Subject c : subject) {
						count++;
						out.print(String.valueOf(count) + ") "+c.getClassname()+" Class: "+c.getsubjectname()+"<br>");
					}
					out.println("<hr>");
				}
			}
			else{
				for (Teacher t : teacherList) {
					if(String.valueOf(t.getTEACHERID()).equals(teachersId)){
						found = true;
						out.println(String.valueOf("<b>"+t.getTEACHERID()) + ") " + t.getName() + " </b><br>");

						Set<Subject> subject = t.getteachersubjects();
						out.println("<b>List of assigned Subjects:</b> <br>");
						int count = 0;
						for (Subject c : subject) {
							count++;
							out.print(String.valueOf(count) + ") "+c.getClassname()+" Class: "+c.getsubjectname()+"<br>");
						}
						out.println("<hr>");
					}
					
				}
				if(!found){
					out.println("Invalid ID!!!");
				}
				found = false;
				teachersId = null;
			}
			
			out.println("</body></html>");
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("teachersid") != null){
			teachersId = request.getParameter("teachersid");
		}

		doGet(request, response);
	}

}
