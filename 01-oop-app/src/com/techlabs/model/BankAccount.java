package com.techlabs.model;

public class BankAccount {
	private int accountNumber;
	private String name;
	private int balance;
	private AccountType accountType;
	
	public BankAccount(int accountNumber, String name, int balance, AccountType accountType) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}
	
	//setters
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	//getters
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	
	//deposit method
	public void deposit(int amount) {
		if(amount > 0) {
		balance += amount;
		}else {
			System.out.println("You have entered Incorrect amount");
		}
		System.out.print("Current Balance:"+balance);
	}
	
	//Withdrawal method
	public void withdraw(int amount) {
		if(amount > 0 && amount < balance) {
			balance -= amount;
			}else {
				System.out.println("You have entered Incorrect amount!");
			}
			System.out.print("Current Balance:"+balance);
	}
	
	
}
