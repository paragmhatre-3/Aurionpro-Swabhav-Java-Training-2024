package com.techlabs.test;
import java.util.Scanner;

import com.techlabs.model.AccountType;
import com.techlabs.model.BankAccount;

public class BankAccountTest {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount accounts [] = new BankAccount[2];

		
		for(int i = 0; i < accounts.length; i++) {
				System.out.println("Enter Account Number:");
				int accountNumber = sc.nextInt();
				System.out.println("Enter Name:");
				String name = sc.next();
				System.out.println("Enter Balance");
				int balance = sc.nextInt();
				System.out.println("Enter Account Type:(Type 1 for Savings and 2 for Current)");
				
				int choice = sc.nextInt();
				AccountType accountType;
				
				if(choice == 1) {
					accountType = AccountType.savings;
				}
				accountType = AccountType.current;
				
				accounts[i] = new BankAccount(accountNumber,name,balance,accountType);		
				}
		
	
		
			for(int i = 0; i < accounts.length; i++) {
				System.out.println("Account Number:"+accounts[i].getAccountNumber());
				System.out.println("Name:"+accounts[i].getName());
				System.out.println("Balance:"+accounts[i].getBalance());
				System.out.println("Account Type:"+accounts[i].getAccountType());
				
			
				
				
			}
		

			
			System.out.println("Transaction Menu:");
	        System.out.println("1. Deposit Money");
	        System.out.println("2. Withdraw Money");
	        System.out.println("Please choose an option:");
	        
	        
	        int choice = sc.nextInt();
	        switch (choice) {
	        
	        case 1: 
	        	System.out.println("Enter Amount to be Deposited:");
	        	int amount =  sc.nextInt();
	        	accounts[0].deposit(amount);
	        	break;
	        case 2:
	        	System.out.println("Enter Amount to be Withdrawn:");
	        	amount = sc.nextInt();
	        	accounts[0].withdraw(amount);
	        	break;
	        	
	        default: 
	        	System.out.println("Incorrect choice");
	        }
	       
	        
	        
	        BankAccount maxAccount = getMaximumBalanceAccount(accounts);
	        if (maxAccount != null) {
	            System.out.println("Account with Maximum Balance:");
	            System.out.println(maxAccount.getName());
	            System.out.println(maxAccount.getBalance());

	        } else {
	            System.out.println("No accounts available.");
	        }
		
		
		
			
			sc.close();
	
	
	}
	
	public static BankAccount getMaximumBalanceAccount(BankAccount[] accounts) {
        if (accounts.length == 0) {
            return null;
        }

        BankAccount maxAccount = accounts[0];
        for (int i = 0; i< accounts.length ; i++) {
            if (accounts[i].getBalance() > maxAccount.getBalance()) {
                maxAccount = accounts[i];
            }
        }
        return maxAccount;
    }

}
