package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exceptions.EmailNotValidException;
import com.aurionpro.exceptions.PasswordNotValidException;
import com.aurionpro.model.User;

public class UserTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Email Address:");
		String email = scanner.next();
		
		System.out.println("Enter password:");
		String password = scanner.next();
		
		User user1 = null;
		try {
			user1 = new User(email,password);
		}
		catch(EmailNotValidException exception){
			System.out.println(exception.getMessage());
			
		}
		catch(PasswordNotValidException exception) {
			System.out.println(exception.getMessage());
		}
		
		System.out.println(user1);
		scanner.close();
	}

}
