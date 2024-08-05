package com.aurionpro.exceptions;

public class AgeNotValidException extends RuntimeException{
	private int age;
	
	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}
	public String getMessage() {
		return "THIS AGE NOT VALID: " + age;
	
	}
}
