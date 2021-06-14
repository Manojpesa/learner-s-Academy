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
 * Servlet implementation class ClassReport
 */
@WebServlet("/ClassReport")
public class ClassReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassReport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
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
			
			String classId = request.getParameter("classId");
			PrintWriter out = response.getWriter();
			out.println("<html><body>");

			for (ClassMaster p : classMasterList) {
				if(String.valueOf(p.getID()).equals(classId)){
					out.println("<b>"+p.getClassname()+" Classes"+"</b><br><hr>");
					out.println("<b>Class Teacher:</b> "+p.getClassteacher()+"<br><hr>");
					//out.println(String.valueOf(p.getID()) + ") " + p.getClassname() + " Class" + "<a href='report?classId=" + String.valueOf(p.getID()) + "'> ==>Report Card</a><br>");

					int count = 0;
					Set<Student> student = p.getstudent();
					out.println("<b>List of Students:</b> <br>");

					for (Student c : student) {
						count++;
						out.print(String.valueOf(count) + ") "+c.getfirstname()+" "+c.getlastname()+"<br>");
					}
					count = 0;
					
					out.println("<hr>");
					
					Set<Subject> subject = p.getSubject();
					out.println("<b>List of Subjects and assigned Teachers:</b> <br>");
					
					for (Subject c : subject) {
						count++;
						out.print(String.valueOf(count) + ") "+c.getsubjectname()+" - Assigned Teacher: <b>"+c.getteachername()+"</b><br>");
					}
					count = 0;

					out.println("<hr>");
				}
				
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
