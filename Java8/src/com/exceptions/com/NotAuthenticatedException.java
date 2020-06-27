package com.exceptions.com;

public class NotAuthenticatedException extends RuntimeException {
	
	private static final long serialVersionUID = 2079235381336055509L;

	public NotAuthenticatedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NotAuthenticatedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NotAuthenticatedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}	
}
