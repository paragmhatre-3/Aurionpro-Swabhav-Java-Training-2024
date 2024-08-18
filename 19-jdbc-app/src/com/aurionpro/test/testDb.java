package com.aurionpro.test;

import java.text.ParseException;
import java.util.Scanner;

import com.aurionpro.model.DbConnection;

public class testDb {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		DbConnection connection = new DbConnection();
		connection.connectToDb();
		mainMenu(scanner, connection);
		// connection.TransactionManagementPoC();

	}

	private static void mainMenu(Scanner scanner, DbConnection connection) {
		boolean quit = false;
		while (!quit) {
			System.out.println("Which of the Following Tables would you like to Operate on?");
			System.out.println("1. Suppliers");
			System.out.println("2. Products");
			System.out.println("3. Orders");
			System.out.println("4. OrderDetails");
			System.out.println("5. Inventory");
			System.out.println("6. Quit");

			int choice1 = scanner.nextInt();

			switch (choice1) {
			case 1:
				System.out.println("What Operation would you like to perform?");
				System.out.println("1. Display Table");
				System.out.println("2. Add Row");
				System.out.println("3. Update Row");
				System.out.println("4. Delete Row");
				int choice2 = scanner.nextInt();
				switch (choice2) {
				case 1:
					connection.getSupplierDetails();
					break;
				case 2:
					connection.addProductDetails();
					break;
				case 3:
					connection.updateSupplierDetails();
					break;
				case 4:
					connection.deleteSupplierDetails();
					break;
				default:
					System.out.println("Invalid Choice!");
				}
				break;
			case 2:
				subMenu(scanner, connection, choice1);
				break;
			case 3:
				subMenu(scanner, connection, choice1);
				break;
			case 4:
				subMenu(scanner, connection, choice1);
				break;
			case 5:
				subMenu(scanner, connection, choice1);
				break;
			case 6:
				quit = true;
				System.out.println("Quitting the application...");
				break;
			default:
				System.out.println("Invalid Choice");
			}
		}

	}

	private static void subMenu(Scanner scanner, DbConnection connection, int choice) {
		System.out.println("What Operation would you like to perform?");
		System.out.println("1. Display Table");
		System.out.println("2. Add Row");
		int choice2 = scanner.nextInt();
		switch (choice2) {
		case 1:
			if (choice == 2)
				connection.getProductDetails();
			if (choice == 3)
				connection.getOrders();
			if (choice == 4)
				connection.getOrderDetails();
			if (choice == 5)
				connection.getInventory();
			break;
		case 2:
			if (choice == 2)
				connection.addProductDetails();
			if (choice == 3)
				connection.getOrders();
			if (choice == 4)
				connection.addOrderDetails();
			if (choice == 5)
				connection.addInventory();
			break;
		default:
			System.out.println("Invalid Choice!");
		}
	}

}
