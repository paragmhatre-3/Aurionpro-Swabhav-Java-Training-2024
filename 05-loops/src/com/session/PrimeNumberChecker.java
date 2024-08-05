package com.session;
import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is Prime:");
		int number = sc.nextInt();
		int i = 2;
		int sum = 0;
		
		while(i < number) {
			if(number % i == 0) {
				sum += i;
		}i++;
		}
		if(sum == 0) {
			System.out.println("The number is Prime!");
		}else {
			System.out.println("It is not Prime");
		}

	}

}
