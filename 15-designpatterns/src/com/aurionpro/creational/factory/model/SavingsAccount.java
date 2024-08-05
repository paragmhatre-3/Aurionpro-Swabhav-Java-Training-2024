package com.aurionpro.creational.factory.model;

public class SavingsAccount implements IAccount {
	public static int minimumBalance = 500;
	private double accountNumber;
	private String name;
	private int balance;

	public SavingsAccount(double accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public int credit(int amount) {
		balance += amount;
		System.out.println("Balance is:"+balance);
		return balance;
	}

	@Override
	public int debit(int amount) {
		if ((balance - amount) > minimumBalance)
			balance -= amount;
		if ((balance - amount) < minimumBalance)
			System.out.println("Insufficient Funds");
		System.out.println("Balance is:"+balance);
		return balance;
		
	}

}
