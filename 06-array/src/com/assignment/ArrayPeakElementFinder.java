package com.assignment;

import java.util.Scanner;

public class ArrayPeakElementFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of elements you want in the Array:");
		int size = sc.nextInt();
		int peakElement = 0;
		
		int array[] = new int[size];
		
		System.out.println("Enter the actual elements:");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			
			}
		
		System.out.println("The peak elements:");
		findPeakElement(array, size);
		
		
		
	}
	
	private static void findPeakElement(int [] array, int size) {
		for(int i = 0; i < size; i++) {
			if((i == 0 || array[i] > array[i -1]) && (i == size - 1 || array[i] > array[i + 1])) {
				System.out.print("\nThe peak Elements: ");
				System.out.print(+array[i]);
			}
		}
		
	}

}
