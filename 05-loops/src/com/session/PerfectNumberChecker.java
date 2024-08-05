package com.session;
import java.util.Scanner;

public class PerfectNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is Perfect:");
		int number = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i < number) {
			if(number % i == 0)
				sum += i;
			i++;
		}
		
		
		if(sum == number) {
			System.out.println("The number is a Perfect!");
		}else {
			System.out.println("It is not a Perfect");
		}

	}

}
