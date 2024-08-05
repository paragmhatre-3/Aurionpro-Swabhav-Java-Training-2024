package com.aurionpro.test;

import com.aurionpro.model.IFactorial;

public class IFactorialTest {
	public static void main (String [] args) {
		
		IFactorial factorialCalculator = (number) -> {
			int calculatedFactorial = 1;
			for(int i = 2; i<=number; i++) {
				calculatedFactorial *= i;
			}
			return calculatedFactorial;
		};
		
		System.out.println(factorialCalculator.factorial(5));
		
	}
}
