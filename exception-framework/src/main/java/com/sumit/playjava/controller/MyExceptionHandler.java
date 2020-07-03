package com.sumit.playjava.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(MyCustomException.class)
	public ResponseEntity<ErrorMessage> getExceptionData(MyCustomException exception){
		ErrorMessage errorMessage=new ErrorMessage(404, exception.getMessage());
		return new ResponseEntity<>(errorMessage,HttpStatus.NOT_FOUND);
	}
}
