package com.test;

public class SimpleInterestCalc {

	public static void main(String[] args) {
		int principle_amount = Integer.parseInt(args[0]);
		double rate_of_interest = Double.parseDouble(args[1]);
		int no_of_yrs = Integer.parseInt(args[2]);
		
		double simple_interest = principle_amount * rate_of_interest * no_of_yrs;
		System.out.println(simple_interest);

	}

}
