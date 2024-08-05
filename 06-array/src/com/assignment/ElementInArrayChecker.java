package com.assignment;

import java.util.Scanner;

public class ElementInArrayChecker {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the no.of elements you want in the Array:");
			int size = sc.nextInt();
			int maximumElement = 0;
			
			int array[] = new int[size];
			
			System.out.println("Enter the actual elements:");
			for(int i = 0; i < size; i++) {
				array[i] = sc.nextInt();
				
				}
			System.out.println("Enter number to search:");
			int number = sc.nextInt();
			
			boolean present = false;
			for (int c : array) {
				if (c == number) {
					present = true;
				}

		}
			if(present) {
				System.out.println("The number is present!");
			}else {
				System.out.println("The number is not present!!");
			}
	}
	
}
