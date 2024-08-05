package com.aurionpro.exceptions;

public class MinimumBalanceException extends Exception{
	public String getMessage() {
		return "INSUFFICIENT FUNDS: Minimum Balance of 500 Rupees needs to be maintained!";
	}
}
