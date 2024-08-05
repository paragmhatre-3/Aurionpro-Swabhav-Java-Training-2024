package com.aurionpro.list.model;

import java.util.Comparator;

public class Account {
	private double accountNumber;
	private String name;
	private int balance;
	private int monthlySalary;
	public static int minimumBalance = 500;
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", monthlySalary=" + monthlySalary + " ]";
	}

	public Account(double accountNumber, String name, int balance, int monthlySalary) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.monthlySalary = monthlySalary;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public  String getName() {
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

	public static int getMinimumBalance() {
		return minimumBalance;
	}

	public static void setMinimumBalance(int minimumBalance) {
		Account.minimumBalance = minimumBalance;
	}
	 public static Comparator<Account> accountBalance = new Comparator<Account>() {
		 
	        // Method
	        public int compare(Account a1, Account a2) {
	 
	            int balance1 = a1.getBalance();
	            int balance2 = a2.getBalance();
	 
	            // For ascending order
	            return balance1 - balance2;
	 
	            // For descending order
	            // rollno2-rollno1;
	        }
	    };
}

	
	
//	public void subMenu() throws MinimumBalanceException, OverdraftLimitExceededException {
//		System.out.println("Welcome to your Account!");
//		System.out.println("Transaction Menu:");
//		System.out.println("1. Deposit Money");
//		System.out.println("2. Withdraw Money");
//		Scanner scanner = new Scanner(System.in);
//		int choice = scanner.nextInt();
//		
//		switch(choice) {
//		case 1:
//			System.out.println("Enter amount to Deposit:");
//			int amount = scanner.nextInt();
//			deposit(amount);
//			break;
//			
//		case 2:
//			System.out.println("Enter amount to Withdraw:");
//			amount = scanner.nextInt();
//			withdraw(scanner,amount);
//			break;
//			
//		default:
//			System.out.println("Incorrect Choice");
//		}
//	}
//	
//	public void deposit(int amount) {
//		if(amount <= 0){
//			System.out.println("Invalid Amount");
//			return;
//		}
//		balance += amount;
//		System.out.println("Current Balance After Deposit: " + balance);
//	}
//	
//	public void withdraw(Scanner scanner, int amount) throws MinimumBalanceException, OverdraftLimitExceededException {
//		System.out.println("Confirm if you have a Savings or Current account:");
//		System.out.println("1. Savings");
//		System.out.println("2. Current");
//		int choice = scanner.nextInt();
//		try {
//		switch(choice) {
//		case 1:
//			savingsAmountChecker(amount);
//			break;
//		case 2:
//			currentAmountChecker(amount);
//			break;
//		default:
//			System.out.println("Incorrect Choice");
//		}
//		}
//		catch(MinimumBalanceException exception) {
//			System.out.println(exception.getMessage());
//		}
//		catch(OverdraftLimitExceededException exception) {
//			System.out.println(exception.getMessage());
//		}
//	}
//	
//
//	
//	
//	public void currentAmountChecker(int amount) throws OverdraftLimitExceededException {
//		int overDraftLimit = 3 * monthlySalary;
//		if(amount <= 0){
//			System.out.println("Amount cannot be ZERO or less than Zero!");
//			return;
//		}
//		if(amount > overDraftLimit) {
//			throw new OverdraftLimitExceededException();
//		}
//		if((amount > 0) && (amount < overDraftLimit)) {
//			balance -= amount;
//			System.out.println("Current Balance after Withdrawl: " + balance);
//		}
//	}
//
//	public void savingsAmountChecker(int amount) throws MinimumBalanceException {
//		if(amount <=0) {
//			System.out.println("Amount is Invalid!");
//			return;
//		}
//		if(balance - amount < minimumBalance) {
//			throw new MinimumBalanceException();
//		}
//		if(balance - amount >= minimumBalance) {
//			balance -= amount;
//			System.out.println("Current Balance after Withdrawl: " + balance);
//		}
//	}	
	
	

