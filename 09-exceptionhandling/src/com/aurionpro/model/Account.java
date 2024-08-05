package com.aurionpro.model;

import com.aurionpro.exceptions.InsufficientBalanceException;

public class Account {
	private int accountNumber;
	private String name;
	private int balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		setBalance(balance += amount);
	}
	public void withdraw(int amount) {
		if(balance - amount <= 0)
			throw new InsufficientBalanceException(amount);
		setBalance(balance -= amount);
	}

	public Account(int accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
}
