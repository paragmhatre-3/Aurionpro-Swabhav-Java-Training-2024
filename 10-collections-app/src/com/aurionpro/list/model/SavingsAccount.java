package com.aurionpro.list.model;
import com.aurionpro.list.model.Account;

public class SavingsAccount extends Account{
	
	public SavingsAccount(int accountNumber, String name, int balance, int monthlySalary) {
		super(accountNumber, name, balance,monthlySalary);
		
	}
	
	
	public String toString() {
		return "SavingsAccount [ " + "AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance=" + getBalance() + "]";
	}
}
