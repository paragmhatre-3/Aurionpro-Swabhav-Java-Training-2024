package com.aurionpro.isp.solution.test;

import com.aurionpro.isp.solution.model.DBlogger;
import com.aurionpro.isp.solution.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		TaxCalculator t1 = new TaxCalculator(new DBlogger());
		t1.calculateTax(100, 10);
		
		TaxCalculator t2 = new TaxCalculator(new DBlogger());
		t2.calculateTax(10000, 0);
	}

}
