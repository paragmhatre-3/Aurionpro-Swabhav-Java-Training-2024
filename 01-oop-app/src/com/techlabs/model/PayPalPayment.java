package com.techlabs.model;

public class PayPalPayment extends Payment{

	@Override
	public void payBill() {
		System.out.println("Bill payed by PayPal");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeemed by PayPal");		
	}

}
