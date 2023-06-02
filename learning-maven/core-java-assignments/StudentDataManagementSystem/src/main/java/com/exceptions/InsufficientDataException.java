package com.exceptions;

public class InsufficientDataException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InsufficientDataException() {
		super(" Insufficient Data Exception ");
	}

	public InsufficientDataException(String string) {
		super(string);
	}
}
