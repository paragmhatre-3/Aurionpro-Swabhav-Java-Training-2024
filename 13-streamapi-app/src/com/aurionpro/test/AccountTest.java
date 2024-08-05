package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.aurionpro.model.Account;
 
public class AccountTest {

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>();
		
		accounts.add(new Account(123456, "Parag", 50000));
		accounts.add(new Account(789012, "Bhakti", 57000));
		accounts.add(new Account(345678, "Shubham", 60000));
		accounts.add(new Account(901234, "Mitali", 77000));
		
		Optional<Account> maxAccount = accounts.stream()
                .max((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()));
        
        if (maxAccount.isPresent()) {
            System.out.println("Account with max balance: " + maxAccount.get());
        } else {
            System.out.println("No accounts found.");
        }
		System.out.println("___________________________________________________________");

        
        // Finding account with minimum balance
        Optional<Account> minAccount = accounts.stream()
                .min((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()));
        
        if (minAccount.isPresent()) {
            System.out.println("Account with min balance: " + minAccount.get());
        } else {
            System.out.println("No accounts found.");
        }
		System.out.println("___________________________________________________________");

        
        accounts.stream()
        		.filter(account -> (account.getName().length() > 6))
        		.forEach((account) -> System.out.println(account));
		System.out.println("___________________________________________________________");

		Double sum = accounts.stream()
							.map((account) -> account.getBalance())
							.reduce(0.0, (account1, account2) -> (account1 + account2));
							System.out.println("SUM Is:" + sum);

		
	}

}
