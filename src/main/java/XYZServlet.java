import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XYZServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		ServletConfig config = getServletConfig();
		System.out.println("config object " + config);
		System.out.println("context object "+ context);
		resp.getWriter().write("ABC Servlet - Init Param : " + config.getInitParameter("name"));
	}

}
