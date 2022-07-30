package com.enjoyCode.departmentmanagementsystem.exceptions;



import javax.servlet.http.HttpServletRequest;

import org.hibernate.PropertyValueException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorAdvice {
	
	//invalid id entered exception
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ApiError handleNotFoundException(NotFoundException ex, HttpServletRequest request) {
		ApiError error = new ApiError(404, ex.getMessage(), request.getServletPath() );
		return error;
	}
	
	//null value exception
	@ExceptionHandler(PropertyValueException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ApiError handlePropertyValueException(PropertyValueException prE,  HttpServletRequest request) {
		ApiError error = new ApiError(400, prE.getMessage(), request.getServletPath() );
		return error;
	}
	
}
