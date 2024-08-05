package com.session;
import java.util.Scanner;
public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is palidrome:");
		int number = sc.nextInt();
		int rev = 0;
		int remainder = 0;
		int temp = number;
		
		while(number > 0) {
			remainder = number % 10;
			rev = rev * 10 + remainder;
			number = number / 10;
		}
		
		
		if(temp == rev) {
			System.out.println("The number is a palindrome!");
		}else {
			System.out.println("It is not a Palindrome");
		}

	}

}
