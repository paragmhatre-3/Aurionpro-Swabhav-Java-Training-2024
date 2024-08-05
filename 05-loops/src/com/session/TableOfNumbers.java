package com.session;
import java.util.Scanner;

public class TableOfNumbers {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println((i*j) + "\t");
			}
			System.out.print(" ");
		}

	}

}
