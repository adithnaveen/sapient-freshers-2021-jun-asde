package com.mycompany.exception;

public class MyRunTimeException  extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String msg; 
	
	public MyRunTimeException() {
		this.msg = "some exception caused";
	}
	
	public MyRunTimeException(String msg) {
		this.msg = msg;
	}
	
	
}
