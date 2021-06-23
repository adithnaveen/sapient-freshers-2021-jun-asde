package com.naveen.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegistrationController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {
		String userName = req.getParameter("user-name");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String[] interests = req.getParameterValues("interest");
		String qualification = req.getParameter("qual");

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Registration Details</h1>");
		out.println("<h4>User Name " + userName + "</h4>");
		out.println("<h4>Password " + password + "</h4>");
		out.println("<h4>Gender " + gender + "</h4>");
		out.println("<h4>Qualification " + qualification + "</h4>");
		out.println("<h4> Your Interest </h4>");
		for (String temp : interests) {
			out.println("<h5>Qualification " + temp + "</h5>");
		}
		out.println("</body>");
		out.println("</html>");

	}
}
