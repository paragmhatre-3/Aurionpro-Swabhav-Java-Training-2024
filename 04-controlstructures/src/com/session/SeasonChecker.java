package com.session;

import java.util.Scanner;

public class SeasonChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a month number for checking the Season:");
		int c = sc.nextInt();
		
		switch(c) {
		case 2: 
		case 3: 
		case 4: 
		case 5: System.out.println("This is the Summer season!");
				break;
		case 6: 
		case 7:
		case 8:
		case 9:System.out.println("This is the Monsoon season!");
				break;
		case 10:
		case 11:
		case 12:
		case 1:System.out.println("This is the Winter season!");
				break;
		default: System.out.println("Invalid Input");
		}

	}


}
