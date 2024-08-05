package com.aurionpro.list.model;

import com.aurionpro.list.model.Account;

public class CurrentAccount extends Account {

	public CurrentAccount(int accountNumber, String name, int balance,int monthlySalary) {
		super(accountNumber, name, balance,monthlySalary);
		
	}

	

	@Override
	public String toString() {
		return "CurrentAccount [" + "AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance=" + getBalance() + "]";
	}
	
}
