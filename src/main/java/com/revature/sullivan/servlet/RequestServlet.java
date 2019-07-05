package com.revature.sullivan.servlet;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.sullivan.pojo.Request;
import com.revature.sullivan.services.RequestImpl;

public class RequestServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
		private RequestImpl ri = new RequestImpl();
		

		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			HttpSession sess = req.getSession(false);
			if (sess == null || sess.getAttribute("employee") == null) {
				req.getRequestDispatcher("login").forward(req, resp);
				return;
				
			} else {
			resp.sendRedirect("RequestForm.html");
			}
		}


		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String firstName = req.getParameter("first_name");
			System.out.println(firstName);
			String lastName = req.getParameter("last_name");
			String date = req.getParameter("date");
			String time = req.getParameter("time");
			String location = req.getParameter("location");
			Integer cost = Integer.parseInt(req.getParameter("cost"));
			String gradingFormat = req.getParameter("grading_format");
			String eventType = req.getParameter("eventtype");
			String comments = req.getParameter("comments");
		//	System.out.println("This is working properly");
			HttpSession sess = req.getSession(false);
			
			
			Request request = new Request(firstName, lastName, date, time, location, cost, gradingFormat, eventType, comments);
				ri.createRequest(request);

		}

	}


