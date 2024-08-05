package com.main;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		System.out.println("Enter the Principle Amount:");
		int principle_amt = sc1.nextInt();
		
		System.out.println("Enter the Rate Of Interest:");
		double rate_of_interest = sc2.nextDouble();
		
		System.out.println("Enter the Number of Years:");
		int no_of_years = sc3.nextInt();
		
		double simpleinterest = principle_amt * rate_of_interest * no_of_years;
		System.out.println("The Simple Interest is:"+simpleinterest);

	}

}
