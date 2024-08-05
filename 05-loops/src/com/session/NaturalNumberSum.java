package com.session;
import java.util.Scanner;
public class NaturalNumberSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find sum of natural numbers:");
		int number = sc.nextInt();
		int sum = 0;
		int i = 1;
			while(i <= number) {
				sum += number;
				i++;
			}

	}

}
