package com.session;
import java.util.Scanner;
public class ArmstrongNumberFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a three digit number:");
		int number = sc.nextInt();
		int temp = number;
		int remainder = 0;
		int sum = 0;
		
		
		while(number > 0) {
			remainder = number % 10;
			sum += (remainder*remainder*remainder);
			number = number / 10;
		}
		number = temp;
		if(number == sum) {
			System.out.println("the number is a armstrong number!");
		}else {
			System.out.println("It is not a Armstrong number");
		}

	}

}
