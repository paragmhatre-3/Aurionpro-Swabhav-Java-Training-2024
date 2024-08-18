package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.SQLException;

public class TransactionManagement {
	Scanner scanner = new Scanner(System.in);
	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/factory", "root", "root");
			System.out.println("Connection Successful");
			statement = connection.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void readSuppliers() {
		System.out.println("Reading Suppliers");
		try {
			ResultSet supplierData = statement.executeQuery("SELECT * FROM suppliers");
			while (supplierData.next()) {
				System.out.println(supplierData.getInt(1) + "\t" + supplierData.getString(2) + "\t"
						+ supplierData.getString(3) + "\t" + supplierData.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addSuppliers() {
		System.out.println("Adding Supplier Values");
		System.out.println("Enter the supplier id ");
		int supplierId = scanner.nextInt();
		System.out.println("Enter Supplier Name ");
		String name = scanner.next();
		System.out.println("Enter contact info");
		String info = scanner.next();
		System.out.println("Enter Address");
		String address = scanner.next();
		try {
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement("INSERT INTO suppliers VALUES (?, ?, ?, ?)");
			preparedStatement.setInt(1, supplierId);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, info);
			preparedStatement.setString(4, address);
			preparedStatement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public void readProducts() {
		System.out.println("Reading Product Data");
		try {
			ResultSet productData = statement.executeQuery("SELECT * FROM products");
			while (productData.next()) {
				System.out.println(productData.getInt(1) + "\t" + productData.getString(2) + "\t"
						+ productData.getString(3) + "\t" + productData.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addProducts() {
		System.out.println("Adding Product Values");
		System.out.println("Enter product id ");
		int id = scanner.nextInt();
		System.out.println("Enter product name");
		String name = scanner.next();
		System.out.println("Enter product description");
		String description = scanner.next();
		System.out.println("Enter supplier id");
		int supplierId = scanner.nextInt();
		try {
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement("INSERT INTO products VALUES (?, ?, ?, ?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, description);
			preparedStatement.setInt(4, supplierId);
			preparedStatement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
