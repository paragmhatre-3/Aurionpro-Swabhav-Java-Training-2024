package com.techlabs.test;

import com.techlabs.model.BankTransferPayment;
import com.techlabs.model.CreditCardPayment;
import com.techlabs.model.PayPalPayment;

public class PaymentTest {

	public static void main(String[] args) {
		CreditCardPayment creditCard = new CreditCardPayment();
		PayPalPayment paypalpayment = new PayPalPayment();
		BankTransferPayment bankTransfer = new BankTransferPayment();
		
		creditCard.payBill();
		creditCard.redeem();
		
		paypalpayment.payBill();
		paypalpayment.redeem();
		
		bankTransfer.payBill();
		bankTransfer.redeem();
		

	}

}
