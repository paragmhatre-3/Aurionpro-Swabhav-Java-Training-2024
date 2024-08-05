package com.session;

import java.util.Scanner;

public class ReverseArray {

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
		for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
		}
		System.out.print("\nReversed Array");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i]+" ");
			}
		}
	
	}
