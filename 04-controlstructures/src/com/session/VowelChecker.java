package com.session;
import java.util.Scanner;

public class VowelChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character for checking if the Character is a Vowel:");
		char c = sc.next().charAt(0);
		
		switch(c) {
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u': System.out.println("This character is a vowel!");
		break;
		default: System.out.println("Not a vowel");
		}

	}

}
