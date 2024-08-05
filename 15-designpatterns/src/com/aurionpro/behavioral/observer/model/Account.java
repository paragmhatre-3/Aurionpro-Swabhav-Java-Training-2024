package com.aurionpro.behavioral.observer.model;

import java.util.List;
import java.util.Scanner;
import com.aurionpro.behavioral.observer.model.InvalidAmountException;


public class Account {
	private double accountNumber;
	private String name;
	private int balance;
	private List<INotifier> notifiers;
	
	Scanner scanner = new Scanner(System.in);
	
	public Account(double accountNumber, String name, int balance, List<INotifier> notifiers) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = notifiers;
	}
	
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
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
	public List<INotifier> getNotifiers() {
		return notifiers;
	}
	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	
	public void deposit(int amount, Account account) {
		String transactionType = "Deposit";
		balance += amount;
		for(INotifier notifier:notifiers) {
			notifier.notification(account,transactionType);
		}
	}
	
	public void withdraw(int amount, Account account) {
		String transactionType = "Withdrawl";
		InvalidAmountException exception = null;
		if(balance < amount)
			throw exception = new InvalidAmountException(amount);
		balance -= amount;
		for(INotifier notifier:notifiers) {
			notifier.notification(account,transactionType);
			notifier.exceptionHandling(exception);
		}
	}
	
}
