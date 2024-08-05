package com.assignments;

import java.util.Scanner;

public class CompoundInterestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Principle Amount:");
		double principle = sc.nextDouble();
		
		System.out.println("Enter the Rate Of Interest:");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the Number of Years:");
		double years = sc.nextDouble();
		
		System.out.println("Enter the Number of times Interest is Compounded each year:");
		double n = sc.nextDouble();
		
		double amount = principle * Math.pow(1 + (rate / 100) / n, n * years);
		double compoundinterest = amount - principle;
		System.out.println("The Compound Interest is:"+" "+compoundinterest);

	}

}
