package com.techlabs.model;

public class SavingsAccount extends Account {

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
