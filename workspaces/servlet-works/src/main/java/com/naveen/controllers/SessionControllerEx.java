package com.naveen.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session-ex")
public class SessionControllerEx extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(); 

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if (session.isNew()) {
			out.println("Session is New");
			session.setAttribute("name", req.getParameter("name")); 
			req.getServletContext().setAttribute("name", "PUBLICIS SAPIENT"); 
			out.println("value from context :  " + req.getServletContext().getAttribute("name") );  

		} else {
			out.println("<hr>Session ID : " + session.getId());
			// you keep it in cookie 
			// can you check if the cookie session and session.getSession().getId() both are same 
			// if so you can proceed if not 
			// send use to login.html
			out.println("<hr>Created Time : " + new Date(session.getCreationTime())); 
			out.println("<hr>Last Access : " + new Date(session.getLastAccessedTime())); 
			out.println("<hr>Max inactive  : " + session.getMaxInactiveInterval());
			
			out.println("value from session :  " + session.getAttribute("name"));  
			out.println("value from context :  " + req.getServletContext().getAttribute("name") );  
//			session.invalidate(); // on logiout 
		}
		session.setMaxInactiveInterval(5); 
	}
}
