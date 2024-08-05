package com.aurionpro.test;
import java.util.Scanner;

import com.aurionpro.exceptions.MinimumBalanceException;
import com.aurionpro.exceptions.OverdraftLimitExceededException;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingsAccount;

public class BankAccountTest {

	public static void main(String[] args) throws MinimumBalanceException, OverdraftLimitExceededException {
		SavingsAccount account1 = new SavingsAccount(1,"Parag",600,60000);
		SavingsAccount account2 = new SavingsAccount(2,"Rick",300,300);
		CurrentAccount account3 = new CurrentAccount(3,"Shubham",550000, 1000);
		CurrentAccount account4 = new CurrentAccount(4,"Morty",450000,45000);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
		System.out.println(account4);
		//System.out.println(account1.getMinimumBalance());
		
		account2.subMenu();
		
		
		
		
	}
	
}
