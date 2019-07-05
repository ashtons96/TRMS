package com.revature.sullivan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.sullivan.pojo.User;
import com.revature.sullivan.services.UserService;
import com.revature.sullivan.services.UserServiceTRMS;

public class LoginServlet extends HttpServlet {
	/**
	 * 
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static UserService us = new UserServiceTRMS();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
//		System.out.println("Board Man");
//		PrintWriter pw = resp.getWriter();
//		pw.write("This is my Servlet doGet Method");
		HttpSession sess = req.getSession(false);
		
		if (sess != null && sess.getAttribute("user") != null) {
		resp.sendRedirect("home");	
		}else {
			resp.sendRedirect("login.html");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
//		System.out.println("Gets Paid");
//		PrintWriter pw = resp.getWriter();
//		pw.write("This is my Servlet doPost Method");
	
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		User user = us.loginUser(username, password);
		
		if(user == null) {
			resp.setStatus(401);
			resp.getWriter().write("Login Failure");
		}else {
			System.out.println("success");
			HttpSession sess = req.getSession(true);
			sess.setAttribute("user", user);
			resp.sendRedirect("RequestForm.html");
		}
	}
}
