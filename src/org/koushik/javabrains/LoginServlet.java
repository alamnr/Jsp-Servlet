package org.koushik.javabrains;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.koushik.javabrains.dto.User;
import org.koushik.javabrains.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	LoginService loginService = new LoginService();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName= request.getParameter("userId");
		String pass= request.getParameter("password");
		boolean result = loginService.authenticateLogin(userName, pass);
		RequestDispatcher requestDispatcher = null;
		if (result==true){
			User user = loginService.getUserDetails(userName);
			//request.getSession().setAttribute("user",user);
			//response.sendRedirect("/loginSuccess.jsp");
			request.setAttribute("user",user);
			requestDispatcher = getServletContext().getRequestDispatcher("/loginSuccess.jsp");
			requestDispatcher.forward(request, response);
		}
		else{
			request.setAttribute("result", result);
			requestDispatcher = getServletContext().getRequestDispatcher("/Login.jsp");
			requestDispatcher.include(request, response);
		}
		
		
	}

}
