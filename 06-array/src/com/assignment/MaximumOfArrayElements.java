package com.assignment;
import java.util.Scanner;

public class MaximumOfArrayElements {

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
		for(int i = 0; i < size; i++) {
			if(maximumElement < array[i]) {
				maximumElement = array[i];
			}
		}
		
		System.out.println("The Maximum of all elements is:"+maximumElement);
	}

}
