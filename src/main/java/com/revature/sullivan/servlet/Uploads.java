package com.revature.sullivan.servlet;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Uploads {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		//	LoggingService.getLogger().trace("Upload.doGet");
			
			HttpSession currentSession = request.getSession(false);
			
			if(currentSession == null) {
			//	System.out.println("No session... Redirecting.");
				response.setStatus(300);
				response.setHeader("Location", "login.html");
				return;
	}
			int requestID = 0;
			
			try {
				requestID = Integer.parseInt(request.getParameter("requestID"));
				
			}catch (NumberFormatException nfe) {
				currentSession.setAttribute("alert", "Please choose a request.");
				response.setStatus(300);
				response.setHeader("Location", "upload.html");
				
				PrintWriter out = response.getWriter();
				out.write("{\"alert\" : \"Bad request!\"}");
				return;
			}
			
			if(requestID == 0) {
				currentSession.setAttribute("alert", "Please choose a request");
				response.setStatus(300);
				response.setHeader("Location", "upload.html");
				PrintWriter out = response.getWriter();
				out.write("{\"alert\" : \"Please choose a request\"}");
			}
			
			Part filePart = request.getPart("file");
			if(FileUploader.upload(filePart, requestId)) {
				currentSession.setAttribute("alert", "Successfully uploaded attachment.");
				PrintWriter out = response.getWriter();
				out.write("{\"alert\" : \"Successfully uploaded attachment.\"}");
			} else {
				currentSession.setAttribute("alert", "Failed to upload attachment.");
				PrintWriter out = response.getWriter();
				out.write("{\"alert\" : \"Failed to upload attachment.\"}");
	}
}
