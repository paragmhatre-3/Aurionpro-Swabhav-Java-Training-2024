package com.aurionpro.test;

import com.aurionpro.model.TransactionManagement;

public class TransactionTest {
	public static void main(String[] args) {
		TransactionManagement transaction = new TransactionManagement();
		transaction.connectToDb();

		transaction.addSuppliers();
		transaction.addProducts();
		transaction.readSuppliers();
		transaction.readProducts();

	}
}
