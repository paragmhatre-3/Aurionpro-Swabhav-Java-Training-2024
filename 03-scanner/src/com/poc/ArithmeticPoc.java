package com.poc;
import java.util.Scanner;
public class ArithmeticPoc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First number:");
		int number1 = sc.nextInt();
		
		System.out.println("Enter the Second number:");
		int number2 = sc.nextInt();
		
		int sum = number1 + number2;
		System.out.println("The Sum of the numbers:"+sum);
		
		int difference = number1 - number2;
		System.out.println("The Difference of the numbers:"+difference);
		
		int product = number1 * number2;
		System.out.println("The Product of the numbers:"+product);
		
		int quotient = number1 / number2;
		System.out.println("The Quotient after Division of the numbers:"+quotient);
		
		int remainder = number1 % number2;
		System.out.println("The Remainder after Division of the numbers:"+remainder);
		
		int num1 = number1;
		int num2 = number2;
		int increment1 = ++num1;
		int increment2 = ++num2;
		System.out.println("The Increments of both the numbers:"+" "+increment1+" "+increment2);
		
		int decrement1 = --number1;
		int decrement2 = --number2;
		System.out.println("The Decrement of both the numbers:"+" "+decrement1+" "+decrement2);

	}

}
