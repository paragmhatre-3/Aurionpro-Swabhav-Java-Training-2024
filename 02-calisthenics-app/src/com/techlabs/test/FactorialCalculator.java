package com.techlabs.test;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = scanner.nextInt();
		
		int factorial = factorialCalculate(number);
		
		if (factorial == -1) {
			System.out.println("Cannot calculate factorials for Negative numbers");
			return;
		}
		
		System.out.println("Factorial of the number is:"+factorial);
}

	private static int factorialCalculate(int number) {
		if (number == 0) {
			return 1;
		}
		if(number < 0) {
			return -1;
		}
		
		int factorial = 1;
		for(int i = 1; i <= number; i++) {
			
			factorial *= i;
		}
		return factorial;
	}
}		

