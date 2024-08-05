package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.AgeNotValidException;
import com.aurionpro.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Voter ID");
		int voterId = scanner.nextInt();
		
		System.out.println("Enter First Name");
		String firstName = scanner.next();
		
		System.out.println("Enter Last Name");
		String lastName = scanner.next();
		
		System.out.println("Enter Age");
		int age = scanner.nextInt();
		Voter voter = null;
		try {
		voter = new Voter(voterId,firstName,lastName,age);
		}
		catch(AgeNotValidException exception) {
			System.out.println(exception.getMessage());
		}
		System.out.println(voter);
		
		

	}

}
