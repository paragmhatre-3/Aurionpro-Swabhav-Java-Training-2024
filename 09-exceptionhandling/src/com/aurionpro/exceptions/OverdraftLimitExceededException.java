package com.aurionpro.exceptions;

public class OverdraftLimitExceededException extends Exception{
	public String getMessage(){
		return "Amount Exceeds The OVERDRAFT LIMIT!";
	}
}
