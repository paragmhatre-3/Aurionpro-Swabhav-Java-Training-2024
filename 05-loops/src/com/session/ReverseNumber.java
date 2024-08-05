package com.session;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		
		int rev = 0;
		int remainder = 0;
		
		while(number > 0) {
			remainder = number % 10;
			rev = rev * 10 + remainder;
			number = number / 10;
		}
		
		System.out.println("The reversed number is:"+rev);

	}

}
