package com.assignment;

import java.util.Scanner;

public class MatrixMultiplier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Creating first array or matrix
		System.out.println("Enter the number of rows for First Matrix:");
		int rows1 = sc.nextInt();
		System.out.println("Enter the number of columns for First Matrix:");
		int columns1 = sc.nextInt();
		int [][] array1 = new int[rows1][columns1];
		
		System.out.println("Enter the actual elements row wise for First Matrix:");
		for(int i = 0; i < rows1; i++) {
			for(int j = 0; j < columns1; j++) {
				array1[i][j] = sc.nextInt();
			}
		}
		
		//Creating Second array or matrix
		System.out.println("Enter the number of rows for Second Matrix:");
		int rows2 = sc.nextInt();
		System.out.println("Enter the number of columns for Second Matrix:");
		int columns2 = sc.nextInt();
		int [][] array2 = new int[rows2][columns2];
		
		System.out.println("Enter the actual elements row wise for Second Matrix:");
		for(int i = 0; i < rows2; i++) {
			for(int j = 0; j < columns2; j++) {
				array2[i][j] = sc.nextInt();
			}
		}
		
		//Printing first array
		System.out.println("The First 2D Array:");
		for(int i = 0; i < rows1; i++) {
			for(int j = 0; j < columns1; j++) {
				System.out.print(array1[i][j] + "  ");
			}System.out.println(" ");
		}
		
		//Printing second array
				System.out.println("The Second 2D Array:");
				for(int i = 0; i < rows2; i++) {
					for(int j = 0; j < columns2; j++) {
						System.out.print(array2[i][j] + "  ");
					}System.out.println(" ");
				}
				
		//Computing Matrix Multiplication
		if(rows1 == columns2){
		int [][] array = new int[rows1][columns2];
				
		for(int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns2; j++) {
				for(int k = 0; k < columns1; k++) {
					array[i][j] += array1[i][k] * array2[k][j];
				}
				
			}
		}
		
		//Printing resultant Array
				System.out.println("The Product of Matrix Multiplication:");
				for(int i = 0; i < rows1; i++) {
					for(int j = 0; j < columns2; j++) {
						System.out.print(array[i][j] + "  ");
					}System.out.println(" ");
				}
		}
		else {
			System.out.println("Both the matrices do not fulfill the basic rule of matrix multiplication!");
		}
		
			
		sc.close();
	}

}
