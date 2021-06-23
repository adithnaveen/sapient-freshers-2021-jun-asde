package com.naveen.controllers;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/storecookie")
public class StoreCookieController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("uname");
		Cookie cookie = new Cookie("user-name", name);
		resp.addCookie(cookie);
		// get all cookie 
		Cookie[] cookies = req.getCookies();
		for (Cookie cookie1 : cookies) {
			System.out.println("Cookie Name "+ cookie1.getName() + ", Cookie Value : " + cookie1.getValue());
		}

		// get the header information 
		
		Enumeration<String> headerNames = req.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String nextElementName = headerNames.nextElement();
			System.out.println("Header Name : "+ nextElementName +" Value : " + req.getHeader(nextElementName));
		}
		
		
		resp.setContentType("text/html");
		resp.sendRedirect("login-form.html");
	}
}
