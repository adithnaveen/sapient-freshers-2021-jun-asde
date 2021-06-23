package com.naveen.beanscreator;

import javax.servlet.http.HttpServletRequest;

import com.naveen.beans.Login;

public class LoginCretor {
	private LoginCretor() {
	}
	public static Login createLoginBean(HttpServletRequest request) {
		Login login = new Login(); 
		login.setUserName(request.getParameter("uname"));
		login.setPassword(request.getParameter("password"));
		return login;
	}
}
