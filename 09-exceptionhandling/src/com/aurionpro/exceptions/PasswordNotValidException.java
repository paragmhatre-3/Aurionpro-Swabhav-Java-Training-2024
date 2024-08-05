package com.aurionpro.exceptions;

public class PasswordNotValidException extends RuntimeException{
	public String getMessage() {
		return "The Entered Password is NOT VALID";
	}
}
