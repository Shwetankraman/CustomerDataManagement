package com.shwetank.CustomerDataManagement.exceptionHandler;

public class NoDataFoundException extends RuntimeException {
	public String message="No data found foe the request";
	
	public NoDataFoundException() {
		
	}
	public NoDataFoundException(String message) {
		this .message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
