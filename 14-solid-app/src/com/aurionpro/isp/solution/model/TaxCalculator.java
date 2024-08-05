package com.aurionpro.isp.solution.model;

public class TaxCalculator {
	private DBlogger dblogger;

	public TaxCalculator(DBlogger dblogger) {
		super();
		this.dblogger = dblogger;
	}
	
	public int calculateTax(int amount, int rate) {
		int tax = 0;
		try {
			tax = amount/rate;
			System.out.println(tax);
		}
		catch(Exception e){
			new DBlogger().log("Divide by ZERO");
		}
		return tax;
	}
}
