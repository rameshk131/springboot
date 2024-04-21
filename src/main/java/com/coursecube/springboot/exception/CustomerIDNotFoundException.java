package com.coursecube.springboot.exception;

public class CustomerIDNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	//PE1000
	String errorCode;
	
	//Invalid User
	String errorSummary;
	
	//Null
	String[] errorCauses;
	
	
	public CustomerIDNotFoundException(String errorCode, String errorSummary, String[] errorCauses) {
		super();
		this.errorCode = errorCode;
		this.errorSummary = errorSummary;
		this.errorCauses = errorCauses;
	}
	

}
