import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Register")

public class WelcomeServlet implements Servlet{
	
	public void init(ServletConfig config) throws ServletException {
	
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor=tomato>");
		out.println("Register successfully");
		out.println("</body></html>");
		
		
	}
	
	public void destroy() {
		
		
	}
	
	public ServletConfig getServletConfig() {
		
		return null;
	}
	
	public String getServletInfo() {
	
		return null;
	}

}
