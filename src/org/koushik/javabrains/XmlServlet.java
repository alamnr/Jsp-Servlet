package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		ServletContext servletContext = request.getServletContext();
		HttpSession session = request.getSession();
		if(userName!=null && userName!="" ){
			session.setAttribute("savedUserName", userName);
			servletContext.setAttribute("savedUserName", userName);
		}
		out.println("Request parameter has user name as: " + userName );
		out.println("Session parameter has user name as: " + (String)session.getAttribute("savedUserName") );
		out.println("Context parameter has user name as: " + (String)servletContext.getAttribute("savedUserName") );
		response.getWriter().write("<h3> Init  Parameter has default user name as: "+ this.getServletConfig().getInitParameter("defaultName")+"</h3>");
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		out.println("Hello User! " + userName  +", full Name: " + fullName);
		String profession = request.getParameter("prof");
		out.println("You are a-"+  profession);
		
		/*
		// Single select
		String location = request.getParameter("location");
		out.println("You live at -"+  location);
		*/
		
		
		// Multi select
		
		String[] multiselect=request.getParameterValues("location");
		
		out.println("You are at: " + multiselect.length + " places :" );
		for(String loc: multiselect){
			out.print(loc+", ");
		}
		
		
	}
	
}
