package com.company.rest.works.exception;

import java.net.http.HttpHeaders;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class SapientResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	// user not found
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> userNotFoundException(Exception exception, WebRequest webRequest) {
		exception.printStackTrace();

		var exceptionResponse = new ExceptionResponse();
		exceptionResponse.setDate(new Date());
		exceptionResponse.setMessage(exception.getMessage());
		exceptionResponse.setDetails(webRequest.getDescription(false));

		return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handlerAllException(Exception exception, WebRequest webRequest) {
		exception.printStackTrace();

		var exceptionResponse = new ExceptionResponse();
		exceptionResponse.setDate(new Date());
		exceptionResponse.setMessage(exception.getMessage());
		exceptionResponse.setDetails(webRequest.getDescription(false));

		return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception,
			org.springframework.http.HttpHeaders headers, HttpStatus status, WebRequest webRequest) {
		
		
		exception.printStackTrace();

		var exceptionResponse = new ExceptionResponse();
		exceptionResponse.setDate(new Date());
		exceptionResponse.setMessage(exception.getMessage() +" Method signature exception... ");
		exceptionResponse.setDetails(webRequest.getDescription(false));

		return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
	}

}
