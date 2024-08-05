package com.aurionpro.exceptions;

public class EmailNotValidException extends RuntimeException{
	public String getMessage() {
		return "Entered Email is NOT VALID";
		
	}
}
