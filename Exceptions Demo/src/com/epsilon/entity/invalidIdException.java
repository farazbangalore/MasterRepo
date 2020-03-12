package com.epsilon.entity;

public class invalidIdException extends Exception {

	private static final long serialVersionUID = 1L;

	public invalidIdException() {
		super();
	}

	public invalidIdException(String message) {
		super(message);
	}

	public invalidIdException(Throwable cause) {
		super(cause);
	}

}
