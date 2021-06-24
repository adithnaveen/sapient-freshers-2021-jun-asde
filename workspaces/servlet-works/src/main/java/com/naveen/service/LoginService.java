package com.naveen.service;

import java.util.Arrays;
import java.util.List;

import com.naveen.beans.Login;

public class LoginService {
	public boolean loginValidate(Login login) {
		// you have to connect to db here 
		return login.getUserName().equals("india") && login.getPassword().equals("sapient"); 
	}
	
	public List<Login> getAllLogins(){
		return Arrays.asList(
				new Login("prateek", "secret"),
				new Login("rohit", "keepguessing"), 
				new Login("raj", "james-bond"), 
				new Login("harashit", "hello"), 
				new Login("kanv", "testing") 
		); 
	}
}
