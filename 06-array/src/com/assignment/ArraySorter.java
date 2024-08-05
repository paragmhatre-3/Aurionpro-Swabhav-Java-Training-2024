package com.assignment;

import java.util.Scanner;

public class ArraySorter {

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
		int temp = 0;
		for(int j = 0; j < size; j++) {
			for(int k = j+1; k < size; k++) {
				if(array[k] < array[j]) {
					temp = array[j];
					array[j] = array[k];
					array[k] = temp;
				}
			}
		}
		
		System.out.print("\nSorted Array:");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i]+" ");
			}
		
	}
	
}
