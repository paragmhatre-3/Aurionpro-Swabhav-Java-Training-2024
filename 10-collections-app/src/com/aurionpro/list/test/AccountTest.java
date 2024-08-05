package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.aurionpro.list.model.SavingsAccount;
import com.aurionpro.list.exceptions.MinimumBalanceException;
import com.aurionpro.list.exceptions.OverdraftLimitExceededException;
import com.aurionpro.list.model.Account;
import com.aurionpro.list.model.CurrentAccount;

public class AccountTest {

	public static void main(String[] args) throws MinimumBalanceException, OverdraftLimitExceededException {
		List<Account> accounts = new ArrayList<Account>();
		
		Scanner scanner = new Scanner(System.in);

		createAccount(accounts,scanner);
		maximumSalary(accounts);
		scanner.close();
		
		// Now, sorting on Balance property
        System.out.println("Balance Sorting:");
 
        Collections.sort(accounts, Account.accountBalance);
 
        // Iterating over list via for each and
        // printing the elements
        for (Account str : accounts) {
            System.out.println(str);
        }

	}
	
	private static void createAccount(List<Account>accounts, Scanner scanner) {
		System.out.println("How many Accounts do you want to create?");
		int size = scanner.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Account Number:");
			int accountNumber = scanner.nextInt();
			System.out.println("Enter Account holder's Name:");
			String name = scanner.next();
			System.out.println("Enter Balance:");
			int balance = scanner.nextInt();
			System.out.println("Enter Monthly Salary:");
			int monthlySalary = scanner.nextInt();

			accounts.add(new Account(accountNumber, name, balance,monthlySalary));	
			
		}
	}
	
	private static void maximumSalary(List<Account> accounts) {
		Account maximumSalaryAccount = accounts.get(0);
		for(Account account:accounts)
			if(account.getMonthlySalary() > maximumSalaryAccount.getMonthlySalary())
				maximumSalaryAccount = account;
		System.out.println("Account Holder with maximum Salary: \n" + maximumSalaryAccount);
	}
	
}
