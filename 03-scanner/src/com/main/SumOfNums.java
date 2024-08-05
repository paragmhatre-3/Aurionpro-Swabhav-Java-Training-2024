package com.main;
import java.util.Scanner;

public class SumOfNums {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter first number:");
		int number1 = sc1.nextInt();
		System.out.println("Enter second number:");
		int number2 = sc2.nextInt();
		int add = num1+num2;
		System.out.println("Sum of "+number1+" & "+number2+" is:"+add);

	}

}
