import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		String name=request.getParameter("username");
//		out.println("<html><body bgcolor=tomato>");
//		out.println("sucessfully login");
//		out.println("</body></html>");
//		
//
//	
//	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
     	PrintWriter out=response.getWriter();	String name=request.getParameter("username");
	    out.println("<html><body bgcolor=tomato>");
     	out.println("sucessfully login");
	    out.println("</body></html>");
		
	}

}
