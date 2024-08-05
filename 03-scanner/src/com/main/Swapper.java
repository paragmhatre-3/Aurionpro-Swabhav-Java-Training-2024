package com.main;
import java.util.Scanner;

public class Swapper {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the first number to be swapped:");
		int number2 = sc2.nextInt();
		
		System.out.println("Enter the second number to be swapped:");
		int number1 = sc1.nextInt();
		
		System.out.println("The swapped numbers are:"+number1+" & "+number2);

	}

}
