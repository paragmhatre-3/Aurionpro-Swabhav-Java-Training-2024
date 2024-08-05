package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.AccountCreator;
import com.aurionpro.creational.factory.model.AccountType;
import com.aurionpro.creational.factory.model.IAccount;

public class AccountTest {

	public static void main(String[] args) {
		
		IAccount account;
		AccountCreator accountCreator = new AccountCreator();
		account =  accountCreator.createSavingsAccount(AccountType.CURRENT,123456,"Parag",5000);
		account.credit(100);
		account.debit(1111);
		

	}

}
