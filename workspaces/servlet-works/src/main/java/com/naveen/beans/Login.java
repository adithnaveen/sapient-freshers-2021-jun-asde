package com.naveen.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login {
	private String userName; 
	private String password;
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("inside finalize login... ");
	} 
	
}
