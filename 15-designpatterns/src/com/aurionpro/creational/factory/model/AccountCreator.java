package com.aurionpro.creational.factory.model;

public class AccountCreator {
	public IAccount createSavingsAccount(AccountType accountType, double accountNumber, String name, int balance) {
		IAccount account = null;
			account = new SavingsAccount(accountNumber,name,balance);
		return account;
	}
	
	public IAccount createCurrentAccount(AccountType accountType, double accountNumber, String name, int balance) {
		IAccount account = null;
			account = new CurrentAccount(accountNumber,name,balance);
		return account;
	}
}
