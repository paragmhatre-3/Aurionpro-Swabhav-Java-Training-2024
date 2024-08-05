package com.session;
import java.util.Scanner;
public class FourDigitArmstrongNumberFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check:");
		int number = sc.nextInt();
		
		int temp = number;
		int remainder = 0;
		int sum = 0;
		int pow = 0;
		while(number >0) {
			pow++;
			number = number/10;
		}
		number = temp;
		
		while(number > 0) {
			remainder = number % 10;
			sum += Math.pow(remainder, pow);
			number = number / 10;
		}
		number = temp;
		if(number == sum) {
			System.out.println("The number is a armstrong number!");
		}else {
			System.out.println("It is not a Armstrong number");
		}

	}

}
