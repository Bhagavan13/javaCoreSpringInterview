package com.bhagavan.interview.ExceptionHandlingSP;

import org.springframework.http.HttpStatus;

public class AppError {
	
	private String errorcode;
	private String message;
	private HttpStatus error;

	public AppError(String code, String message, HttpStatus internalServerError) {
		// TODO Auto-generated constructor stub
		this.errorcode=code;
		this.message=message;
		this.error=internalServerError;
	}

}
