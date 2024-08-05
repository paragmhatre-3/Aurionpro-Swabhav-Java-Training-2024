package com.assignment;

import java.util.Scanner;

public class SumOfRows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns:");
		int columns = sc.nextInt();
		int [][] array = new int[rows][columns];
		
		System.out.println("Enter the actual elements row wise:");	
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The 2D Array:");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(array[i][j]);
			}System.out.println(" ");
		}
		int sum = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				sum += array[i][j];
			}
			System.out.println("The sum of Row Number:"+i+" Is:"+sum);
			sum = 0;
		}
		
		sc.close();
	}

}
