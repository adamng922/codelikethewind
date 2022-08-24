package org.codelikethewind.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>CI/CD Demo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>" + "CICD Testing Done" + "</h1>");
		out.println("<p>" + "Changes was triggered from GitHub" + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
