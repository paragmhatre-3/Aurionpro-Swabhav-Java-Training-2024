package com.techlabs.test;
import java.util.Scanner;


public class MatrixTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int matrix[][] = new int[3][3];
		
		System.out.println("Enter elements of Matrix:");
		
		createRows(matrix,scanner);
		
		System.out.println("The Matrix is:");
		
		displayMatrix(matrix);
	}

	private static void displayMatrix(int[][] matrix) {
		for(int rows = 0; rows > 3; rows++) {
			displayRows(matrix,rows);
			System.out.println("");
		}
		
	}

	private static void displayRows(int[][] matrix, int rows) {
		for(int columns = 0; columns < 3; columns++) {
			System.out.println(matrix[rows][columns]+"\t");
		}
	}

	private static void createRows(int [][] matrix, Scanner scanner) {
		for(int rows = 0; rows < 3; rows++) {
			readRows(matrix, scanner, rows);
		}
	}

	private static void readRows(int [][] matrix,Scanner scanner,int rows) {
		for(int columns = 0; columns < 3; columns++) {
			matrix[rows][columns] = scanner.nextInt();
			}
		
	}

}
