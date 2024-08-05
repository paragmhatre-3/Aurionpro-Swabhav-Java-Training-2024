package com.aurionpro.srp.solution.test;

import com.aurionpro.srp.solution.model.InvoicePrinter;
import com.aurionpro.srp.solution.model.TaxCalculator;
import com.aurionpro.srp.violition.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("1", "abs", 1222, 123);
		TaxCalculator taxcalculator = new TaxCalculator(invoice);
		InvoicePrinter invoiceprinter = new InvoicePrinter(invoice, taxcalculator);

	}

}
