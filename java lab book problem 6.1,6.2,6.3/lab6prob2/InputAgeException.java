package com.cg.labbook.lab6prob2;
public class InputAgeException extends Exception{
	public InputAgeException() {
		super();
	}
	public InputAgeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public InputAgeException(String message, Throwable cause) {
		super(message, cause);
	}
	public InputAgeException(String message) {
		super(message);
	}
	public InputAgeException(Throwable cause) {
		super(cause);
	}
}
