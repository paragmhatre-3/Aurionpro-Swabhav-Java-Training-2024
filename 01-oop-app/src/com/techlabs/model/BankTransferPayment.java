package com.techlabs.model;

public class BankTransferPayment extends Payment{

	@Override
	public void payBill() {
		System.out.println("Bill Payed by Bank Transfer");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeemed by Bank Transfer");
		
	}
	

}
