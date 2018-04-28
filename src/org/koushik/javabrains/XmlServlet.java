package org.koushik.javabrains;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		System.out.println("Hello from GET method.");
		response.getWriter().write("<h3> Hello from Xml Servlet get method - on the web page</h3>");
	}
	
}
