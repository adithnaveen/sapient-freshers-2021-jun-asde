package com.naveen.service;

import com.naveen.beans.Login;

public class LoginService {
	public boolean loginValidate(Login login) {
		// you have to connect to db here 
		return login.getUserName().equals("india") && login.getPassword().equals("sapient"); 
	}
}
