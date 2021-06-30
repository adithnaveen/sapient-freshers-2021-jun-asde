package com.company.rest.works.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	private String msg; 
	public UserNotFoundException() {
		msg = "user not found "; 
	}

	public UserNotFoundException(String msg) {

		this.msg  = msg; 
	}

	@Override
	public String getMessage() {
		return this.msg; 
	}
	
	
	
}
