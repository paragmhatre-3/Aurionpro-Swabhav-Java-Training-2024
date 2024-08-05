package com.aurionpro.model;

import com.aurionpro.model.BankAccount;

public class SavingsAccount extends BankAccount {

	public int getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(int minimumBalance) {
		SavingsAccount.minimumBalance = minimumBalance;
	}

	public SavingsAccount(int accountNumber, String name, int balance, int monthlySalary) {
		super(accountNumber, name, balance,monthlySalary);
		
	}
	

	@Override
	public String toString() {
		return "SavingsAccount [ " + "AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance=" + getBalance() + "]";
	}
}
