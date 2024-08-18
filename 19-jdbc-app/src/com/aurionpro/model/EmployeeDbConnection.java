package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDbConnection {
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private Statement statement = null;
	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
			System.out.println("Database Connected Successfully");
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getEmployeeDetails() {
		try {
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Enter Employee ID to Display:");
			 int employeeId = scanner.nextInt();
			ResultSet dbEmployeeData = statement.executeQuery("select * from employee where emp_id=" +employeeId);
			while(dbEmployeeData.next()) {
				System.out.println(dbEmployeeData.getInt(1) +"\t"+ dbEmployeeData.getString(2) +"\t"+ dbEmployeeData.getInt(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void getAllEmployeeDetails() {
		try {
			ResultSet dbAllEmployeeData = statement.executeQuery("select * from employee");
			while(dbAllEmployeeData.next()) {
				System.out.println(dbAllEmployeeData.getInt(1) +"\t"+ dbAllEmployeeData.getString(2) +"\t"+ dbAllEmployeeData.getInt(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void addEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int employeeId = scanner.nextInt();
		System.out.println("Enter Employee Name:");
		String employeeName = scanner.next();
		System.out.println("Enter Employee Salary:");
		int employeeSalary = scanner.nextInt();
		
		try {
//			statement.executeUpdate("insert into suppliers values("+supplierId +",'"+supplierName+"','"+contactInfo+"','"+address+"')");
			preparedStatement  = connection.prepareStatement("insert into employee values(?,?,?)");
			preparedStatement.setInt(1,employeeId);
			preparedStatement.setString(2,employeeName);
			preparedStatement.setInt(3,employeeSalary);
			preparedStatement.executeUpdate();
			
			
			System.out.println("Record Added Successfully!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public void updateEmployeeDetails() {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter Employee ID to be updated:");
		int employeeId = scanner.nextInt();
		System.out.println("Enter Employee Name:");
		String employeeName = scanner.next();
		System.out.println("Enter Employee Salary:");
		int employeeSalary = scanner.nextInt();

	    try {
	    	preparedStatement = connection.prepareStatement("UPDATE employee SET name = ?, salary = ? WHERE emp_id = ?");
			preparedStatement.setString(1,employeeName);
			preparedStatement.setInt(2,employeeSalary);
			preparedStatement.setInt(3,employeeId);
	        int rowsAffected = preparedStatement.executeUpdate();
	        if (rowsAffected > 0) {
	            System.out.println("Record Updated Successfully!");
	        } else {
	            System.out.println("No record found with Employee ID: " + employeeId);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	
	public void deleteEmployee() {
		try {
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Enter Employee ID to Delete:");
			 int employeeId = scanner.nextInt();
			 statement.execute("delete from employee where emp_id=" +employeeId);
			 System.out.println("Row with Employee_ID: "+employeeId+" Deleted Successfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
