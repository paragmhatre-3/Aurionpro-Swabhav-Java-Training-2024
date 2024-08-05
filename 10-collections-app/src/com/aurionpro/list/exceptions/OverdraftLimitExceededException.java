package com.aurionpro.list.exceptions;

public class OverdraftLimitExceededException extends Exception{
	public String getMessage(){
		return "Amount Exceeds The OVERDRAFT LIMIT!";
	}
}