package com.assignment;

import java.util.Scanner;

public class DuplicateElementsCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of elements you want in the Array:");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter the actual elements:");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			
			}
		System.out.print("Original Array:");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i]+" ");
			
			}
		int countOfDuplicates = 0;
		for(int j = 0; j < size; j++) {
			for(int k = j+1; k < size; k++) {
				if(array[k] ==  array[j]) {
					countOfDuplicates++;
				}
			}
		}
		
		System.out.print("\nNumber of duplicate elements:"+countOfDuplicates);
		
	}

}
