package com.aurionpro.srp.solution.model;

public class InvoicePrinter {
	private Invoice invoice;
	private TaxCalculator taxCalculator;

	public InvoicePrinter(Invoice invoice2, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice2;
		this.taxCalculator = taxCalculator;
	}

	public void print() {
		System.out.println("ID" + invoice.getId());
		System.out.println("Description" + invoice.getDescription());
		System.out.println("amount" + invoice.getAmount());
		System.out.println("tax" + taxCalculator.calculateTax());
		System.out.println("total amount" + (invoice.getTax() + taxCalculator.calculateTax()));
	}
}
