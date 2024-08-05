package com.session;
import java.util.Scanner;
public class EvenOddChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether it is EVEN or ODD:");
		int number = sc.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.println("The number is EVEN !");
		}
		else {
			System.out.println("The number is ODD!");
		}
	}

}
