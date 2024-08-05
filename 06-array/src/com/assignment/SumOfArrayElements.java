package com.assignment;
import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of elements you want in the Array:");
		int size = sc.nextInt();
		int sum = 0;
		
		int array[] = new int[size];
		
		System.out.println("Enter the actual elements:");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			
			}
		for(int i = 0; i < size; i++) {
			sum += array[i];
		}
		
		System.out.println("The Sum of all elements is:"+sum);
	}

}
