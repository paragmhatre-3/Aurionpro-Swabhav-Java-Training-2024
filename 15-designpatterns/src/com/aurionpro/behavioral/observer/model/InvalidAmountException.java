package com.aurionpro.behavioral.observer.model;

public class InvalidAmountException extends RuntimeException{
	private int amount;
	
	public InvalidAmountException(int amount) {
		super();
		this.amount = amount;
	}
	
	public String getMessage() {
		return "INVALID AMOUNT!: " + amount;
	
	}
}
