package com.aurionpro.exceptions;

public class InsufficientBalanceException extends RuntimeException{
	private int amount;

	public InsufficientBalanceException(int amount) {
		super();
		this.amount = amount;
	}
	public String getMessage() {
		return "INSUFFICIENT FUNDS... This amount can't be withdrawn: "+amount;
	}
	
}
