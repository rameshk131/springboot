package com.coursecube.springboot;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.coursecube.springboot.dto.MyCustomErrorResponse;
import com.coursecube.springboot.exception.CityNotFoundException;
import com.coursecube.springboot.exception.CustomerIDNotFoundException;
import com.coursecube.springboot.exception.InvalidPhoneNumberException;

@ControllerAdvice
public class MyResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	/*
	
	@ExceptionHandler({ CustomerIDNotFoundException.class})
	public void handleCidNotFound(HttpServletResponse response) throws IOException {
		response.sendError(54321);
	}
	@ExceptionHandler({ InvalidPhoneNumberException.class})
	public void handlePhoneNotFound(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value());
	}
	@ExceptionHandler({ CityNotFoundException.class})
	public void handleCityNotFound(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.NOT_FOUND.value());
	}
	
	*/
	
	@ExceptionHandler({CustomerIDNotFoundException.class})
	//public ResponseEntity<MyCustomErrorResponse> handleCidNotFound(RuntimeException ex,WebRequest request) {
	public ResponseEntity<MyCustomErrorResponse> handleCidNotFound() {
		MyCustomErrorResponse errors = new MyCustomErrorResponse();
		errors.setTimestamp(LocalDateTime.now());
		errors.setError("MyCustomer Id is Not Available Guys -------");
		errors.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(errors, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler({ InvalidPhoneNumberException.class})
	public ResponseEntity<MyCustomErrorResponse> handlePhoneNotFound(RuntimeException ex,WebRequest request) {
		MyCustomErrorResponse errors = new MyCustomErrorResponse();
		errors.setTimestamp(LocalDateTime.now());
		errors.setError(" Phone Number is Not Available");
		errors.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(errors, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler({ CityNotFoundException.class})
	public ResponseEntity<MyCustomErrorResponse> handleCityNotFound(RuntimeException ex, WebRequest request) {
		MyCustomErrorResponse errors = new MyCustomErrorResponse();
		errors.setTimestamp(LocalDateTime.now());
		errors.setError(" City Not Found in DB");
		errors.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(errors, HttpStatus.NOT_FOUND);
	}
	
}
