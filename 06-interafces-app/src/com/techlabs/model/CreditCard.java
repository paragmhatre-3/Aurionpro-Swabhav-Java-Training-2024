package com.techlabs.model;

public class CreditCard implements Payment{

	@Override
	public void payBill() {
		System.out.println("Bill Payed by Credit Card");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeemed by Credit Card");
		
	}
	
}
