package com.mehmed.integrationservice.service;

import org.springframework.http.HttpStatus;

public class ApplicationResponse {

	private String data;
	private int status;
	private int statusCode;
	private String error;
	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int i) {
		this.status = i;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int i) {
		this.statusCode = i;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	
	

	
	
	
	
}
