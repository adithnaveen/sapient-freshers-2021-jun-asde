package com.naveen.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naveen.beans.Login;
import com.naveen.beanscreator.LoginCretor;
import com.naveen.service.LoginService;

@WebServlet("/loginvalidate")
public class LoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		Login login = LoginCretor.createLoginBean(req);
		if(new LoginService().loginValidate(login)) {
			// send him/her to home page 
			req.getRequestDispatcher("home-page").forward(req, resp);
		}else {
			resp.getWriter().println("<h2 style='coloe:red'>Sorry Invalid "
					+ "Credentials Please Enter Again</h2>");
			
			req.getRequestDispatcher("login-form.html").include(req, resp);
			
		}
	}
	
}
