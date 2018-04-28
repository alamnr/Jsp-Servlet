package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description="A simple servlet", urlPatterns={"/SimpleServlet"},
initParams={@WebInitParam(name="defaultuser", value="John Doe")}
)
public class SimpleServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		System.out.println("Hello from GET method.");
		response.getWriter().write("<h3> Hello from Servlet get method - on the web page</h3>");
		response.getWriter().write("<h3> Init  Parameter has default user name as: "+ this.getServletConfig().getInitParameter("defaultuser")+"</h3>");
		
	}
	

}
