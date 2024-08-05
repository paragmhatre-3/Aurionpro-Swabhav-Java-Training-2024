package com.session;

import java.util.Scanner;

public class PositiveNegativeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether it is POSITIVE or NEGATIVE:");
		int number = sc.nextInt();
		
		if(number == 0)
		{
			System.out.println("The number is ZERO!");
		}
		else if(number < 0)
		{
			System.out.println("The number is Negative!");
		}
		else 
		{
			System.out.println("The number is Positive!");
		}
	}

}
