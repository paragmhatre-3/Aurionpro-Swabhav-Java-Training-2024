package com.aurionpro.model;

import java.util.Scanner;

import com.aurionpro.exceptions.MinimumBalanceException;
import com.aurionpro.exceptions.OverdraftLimitExceededException;

public class BankAccount {
	private int accountNumber;
	private String name;
	private int balance;
	private int monthlySalary;
	public static int minimumBalance = 500;
	
	
	public BankAccount(int accountNumber, String name, int balance, int monthlySalary) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.monthlySalary = monthlySalary;
	}
	
	public long getAccountNumber() {
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
	public int getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public void subMenu() throws MinimumBalanceException, OverdraftLimitExceededException {
		System.out.println("Welcome to your Account!");
		System.out.println("Transaction Menu:");
		System.out.println("1. Deposit Money");
		System.out.println("2. Withdraw Money");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter amount to Deposit:");
			int amount = scanner.nextInt();
			deposit(amount);
			break;
			
		case 2:
			System.out.println("Enter amount to Withdraw:");
			amount = scanner.nextInt();
			withdraw(scanner,amount);
			break;
			
		default:
			System.out.println("Incorrect Choice");
		}
	}
	
	public void deposit(int amount) {
		if(amount <= 0){
			System.out.println("Invalid Amount");
			return;
		}
		balance += amount;
		System.out.println("Current Balance After Deposit: " + balance);
	}
	
	public void withdraw(Scanner scanner, int amount) throws MinimumBalanceException, OverdraftLimitExceededException {
		System.out.println("Confirm if you have a Savings or Current account:");
		System.out.println("1. Savings");
		System.out.println("2. Current");
		int choice = scanner.nextInt();
		try {
		switch(choice) {
		case 1:
			savingsAmountChecker(amount);
			break;
		case 2:
			currentAmountChecker(amount);
			break;
		default:
			System.out.println("Incorrect Choice");
		}
		}
		catch(MinimumBalanceException exception) {
			System.out.println(exception.getMessage());
		}
		catch(OverdraftLimitExceededException exception) {
			System.out.println(exception.getMessage());
		}
	}
	

	
	
	public void currentAmountChecker(int amount) throws OverdraftLimitExceededException {
		int overDraftLimit = 3 * monthlySalary;
		if(amount <= 0){
			System.out.println("Amount cannot be ZERO or less than Zero!");
			return;
		}
		if(amount > overDraftLimit) {
			throw new OverdraftLimitExceededException();
		}
		if((amount > 0) && (amount < overDraftLimit)) {
			balance -= amount;
			System.out.println("Current Balance after Withdrawl: " + balance);
		}
	}

	public void savingsAmountChecker(int amount) throws MinimumBalanceException {
		if(amount <=0) {
			System.out.println("Amount is Invalid!");
			return;
		}
		if(balance - amount < minimumBalance) {
			throw new MinimumBalanceException();
		}
		if(balance - amount >= minimumBalance) {
			balance -= amount;
			System.out.println("Current Balance after Withdrawl: " + balance);
		}
	}	
}

		
	
	

