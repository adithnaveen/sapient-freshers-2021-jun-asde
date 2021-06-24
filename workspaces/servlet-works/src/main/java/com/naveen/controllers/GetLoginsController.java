package com.naveen.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naveen.beans.Login;
import com.naveen.service.LoginService;


@WebServlet("/get-logins")
public class GetLoginsController  extends HttpServlet{

	// hyperrlink - 
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doPost(req, resp);
		}
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			// get the values if passed 
			// no i dont have any params 
			
			
			// talk to DAO 
			LoginService loginService = new LoginService(); 
			List<Login> allLogins = loginService.getAllLogins();
			req.setAttribute("logins", allLogins);
			
			
			// call view for rendering 
			String URI  ="WEB-INF/views/showlogins.jsp"; 
			req.getRequestDispatcher(URI).forward(req, resp);
			
		}
}















