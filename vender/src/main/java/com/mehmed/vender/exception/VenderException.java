package com.mehmed.vender.exception;

import org.springframework.http.HttpStatus;

public class VenderException {

	private String message;
	private Throwable cause;
	private HttpStatus httpStatus;
	public VenderException(String message, Throwable throwable, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.cause = throwable;
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public Throwable getThrowable() {
		return cause;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
	
}
