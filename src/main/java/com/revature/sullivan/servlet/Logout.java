package com.revature.sullivan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet {
	
	public Logout() {
		super();
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		HttpSession sess = req.getSession(false);
		
		if(sess == null) {
			
			resp.setStatus(300);
			resp.setHeader("Location", "login.html");
		}else {
			return;
			
		}
		sess.invalidate();
		resp.setStatus(300);
		resp.setHeader("Location", "login.html");
	}
	

}
