package com.bridgelabz.usermanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bridgelabz.usermanagement.service.UserService;
import com.bridgelabz.usermanagement.serviceimplementation.UserServiceImpl;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String status = null;
		try {

			String username = request.getParameter("username");
			String password = request.getParameter("password");
			UserService service = new UserServiceImpl();
			status = service.checkLogin(username, password);
			if (status.equals("success")) {
				RequestDispatcher rd = request.getRequestDispatcher("jspfiles/dashboard.jsp");
				rd.forward(request, response);
			} else
				response.sendRedirect("jspfiles/login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
