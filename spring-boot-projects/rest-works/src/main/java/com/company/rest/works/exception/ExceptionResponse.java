package com.company.rest.works.exception;

import java.util.Date;

import lombok.Data;

@Data
public class ExceptionResponse {
	private String message; 
	private String details; 
	private Date date; 
}
