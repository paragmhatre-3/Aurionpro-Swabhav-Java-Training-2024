package com.session;
import java.util.Scanner;
public class MaximumMinimumFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		int number2 = sc.nextInt();
		
		if(number1 >  number2) {
			System.out.println("The first number is Maximum: "+number1+"  "+"The second number is Minimum ");
		}
		else {
			System.out.println("The second number is Maximum and the First number is Minimum");
		}

	}

}
