package com.aurionpro.creational.factory.model;

public class CurrentAccount implements IAccount {
	private double accountNumber;
	private String name;
	private int balance;
	public int draftLimit = balance * 2;

	public CurrentAccount(double accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public int credit(int amount) {
		balance += amount;
		System.out.println("Balance is:" +balance);
		return balance;
	}

	@Override
	public int debit(int amount) {
		if (amount < draftLimit)
			balance -= amount;
		if (amount > draftLimit)
			System.out.println("Insufficient Funds!!!");
		return balance;
	}

}
