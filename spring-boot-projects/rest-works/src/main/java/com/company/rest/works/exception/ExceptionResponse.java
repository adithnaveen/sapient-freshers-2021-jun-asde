package com.company.rest.works.exception;

import java.util.Date;

public class ExceptionResponse {
	private String message;
	private String details;
	private Date date;

	public ExceptionResponse(String message, String details, Date date) {
		this.message = message;
		this.details = details;
		this.date = date;
	}

	public ExceptionResponse() {
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ExceptionResponse message(String message) {
		setMessage(message);
		return this;
	}

	public ExceptionResponse details(String details) {
		setDetails(details);
		return this;
	}

	public ExceptionResponse date(Date date) {
		setDate(date);
		return this;
	}

	@Override
	public String toString() {
		return "{" + " message='" + getMessage() + "'" + ", details='" + getDetails() + "'" + ", date='" + getDate()
				+ "'" + "}";
	}

}
