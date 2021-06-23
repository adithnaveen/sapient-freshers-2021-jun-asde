package com.naveen.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
public class LogInputOuputFilter implements Filter {

   
	public void destroy() {
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println(".... i'm in filter before calling servlet... ");
		chain.doFilter(request, response); // call the servlet 
		System.out.println(".... i'm in filter after calling servlet... ");
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Company Name : "+ fConfig.getInitParameter("company"));
	}

}
