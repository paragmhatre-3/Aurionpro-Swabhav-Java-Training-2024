package com.aurionpro.model;

import com.aurionpro.model.BankAccount;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(int accountNumber, String name, int balance,int monthlySalary) {
		super(accountNumber, name, balance,monthlySalary);
		
	}

	

	@Override
	public String toString() {
		return "CurrentAccount [" + "AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance=" + getBalance() + "]";
	}
	
}
