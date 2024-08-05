package com.session;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of elements you want in the Array:");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		
		
		System.out.println("Enter the actual elements:");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			
			}
		System.out.print("The array is: \t");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i]+"\t");
		}

	}

}
