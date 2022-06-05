package com.bhagavan.interview.ExceptionHandlingSP;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionHandler {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<AppError> handleException(StudentNotFoundException exc)
	{
		AppError appError= new AppError(UUID.randomUUID().toString(),exc.getMessage(),
				HttpStatus.INTERNAL_SERVER_ERROR);
		
		
		return new ResponseEntity<AppError>(appError, HttpStatus.INTERNAL_SERVER_ERROR);
				
		
	}

}
