package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.EmployeeDbConnection;

public class testEmployeeDb {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeDbConnection connection = new EmployeeDbConnection();
		connection.connectToDb();

		mainMenu(scanner, connection);
	}

	private static void mainMenu(Scanner scanner, EmployeeDbConnection connection) {
		boolean quit = false;
		while (!quit) {
			System.out.println("What Operation would you like to perform?");
			System.out.println("1. Display Entire Employee Table");
			System.out.println("2. Display ONE Employee Row");
			System.out.println("3. Add Employee Row");
			System.out.println("4. Update Employee Row");
			System.out.println("5. Delete Employee Row");
			System.out.println("6. Quit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				connection.getAllEmployeeDetails();
				break;
			case 2:
				connection.getEmployeeDetails();
				break;
			case 3:
				connection.addEmployee();
				break;
			case 4:
				connection.updateEmployeeDetails();
				break;
			case 5:
				connection.deleteEmployee();
				break;
			case 6:
				quit = true;
				System.out.println("Quitting the application...");
				break;
			default:
				System.out.println("Invalid Choice!");
			}
		}

	}

}
