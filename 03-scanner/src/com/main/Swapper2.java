package com.main;
import java.util.Scanner;


public class Swapper2 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the first number to be swapped:");
		int number1 = sc2.nextInt();
		
		System.out.println("Enter the second number to be swapped:");
		int number2 = sc1.nextInt();
		
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("The swapped numbers are:"+number1+" & "+number2);

	}

}
