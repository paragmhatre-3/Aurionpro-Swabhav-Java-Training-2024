package com.assignment;
import java.util.Scanner;
public class TwoDimensionalArraySearcher {

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
		int numberOfOccurences = 0;
		System.out.println("Enter element to search:");
		int elementToSearch = sc.nextInt();
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(array[i][j] == elementToSearch) {
					System.out.println("The element is present at Row Number:"+i+" Column number:"+j);
					numberOfOccurences++;
					
				}
			}
		}System.out.println("No.Of Occurences of this element:"+numberOfOccurences);

	}

}
