package com.techlabs.model;

public class PayPal implements Payment{

	@Override
	public void payBill() {
		System.out.println("Bill Payed by PayPal");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeemed by PayPal");
		
	}
	
	
}
