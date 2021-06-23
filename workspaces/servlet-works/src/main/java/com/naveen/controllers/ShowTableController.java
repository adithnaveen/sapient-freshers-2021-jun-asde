package com.naveen.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showtable")
public class ShowTableController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try {
			int val = Integer.parseInt(req.getParameter("val"));

			// 10 x 1 = 10
			for (int i = 1; i <= 10; i++) {
				out.println("<h5>" + val + " x " + i + " = " + (val * i) + "</h5>");
			}
		} catch (NumberFormatException nfe) {
			out.println("<h2>Please Enter only numbers... <h2>");
			
			req.getRequestDispatcher("/table-form.html").include(req, resp);
			
		}

	}
}
