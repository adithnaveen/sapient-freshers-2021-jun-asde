package com.naveen.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.contracts.IEmployeeDAO;
import com.naveen.sql.entity.Emp;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	// will executed once only per application start 
	public void init(ServletConfig config) throws ServletException {
		System.out.println(">>>> Init Called>>>> ");
	}

	// will executed once only per application end 
	public void destroy() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println(">>>> Destroy Called>>>> ");
	}

	// per user request 
	protected void doGet(HttpServletRequest request, 
				HttpServletResponse response) throws ServletException, IOException {
		 
		
		response.setContentType("text/html");
		// ctrl + 2 + l 
		PrintWriter out = response.getWriter(); 
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlets</h1>"); 
		out.println("</body>"); 
		out.println("</html>"); 
		
	}
	
	// if you have post only then make a get request - 405 Error 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
