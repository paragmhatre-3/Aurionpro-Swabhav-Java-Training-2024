package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchProcessingPoc {
	 Scanner scanner = new Scanner(System.in); private Connection connection; 
	 private Statement statement; private PreparedStatement preparedStatement; 
	 public void connectToDb() { 
	  try {   Class.forName("com.mysql.cj.jdbc.Driver"); 
	   connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/factory", "root", "root");   System.out.println("Connection Successful"); 
	   statement = connection.createStatement();  } catch (ClassNotFoundException | SQLException e) { 
	   e.printStackTrace();  } 
	 } 
	 public void readSuppliers() { 
	  System.out.println("Reading Suppliers");  try { 
	   ResultSet supplierData = statement.executeQuery("SELECT * FROM suppliers");
	   while (supplierData.next()) { 
	    System.out.println(supplierData.getInt(1) + "\t" + supplierData.getString(2) + "\t"      + supplierData.getString(3) + "\t" + supplierData.getString(4)); 
	   }  } catch (SQLException e) { 
	   e.printStackTrace();  } 
	 } 
	 public void batchAddSuppliers() {  System.out.println("Batch Adding Supplier Values"); 
	  try { 
	   connection.setAutoCommit(false);
	   preparedStatement = connection.prepareStatement("INSERT INTO suppliers VALUES (?, ?, ?, ?)"); 
	   // adding multiple suppliers 
	   preparedStatement.setInt(1, 14);   
	   preparedStatement.setString(2, "Supplier X"); 
	   preparedStatement.setString(3, "Contact X");   
	   preparedStatement.setString(4, "Address X"); 
	   preparedStatement.addBatch(); 
	   preparedStatement.setInt(1, 15);   
	   preparedStatement.setString(2, "Supplier Y"); 
	   preparedStatement.setString(3, "Contact Y");   
	   preparedStatement.setString(4, "Address Y"); 
	   preparedStatement.addBatch(); 
	   preparedStatement.executeBatch();   
	   connection.commit(); 
	   System.out.println("Batch addition of suppliers successful."); 
	  } catch (SQLException e) {   try { 
	    connection.rollback();    System.out.println("Batch addition of suppliers failed. Changes rolled back."); 
	   } catch (SQLException ex) {    ex.printStackTrace(); 
	   }   e.printStackTrace(); 
	  } } 
	// public void batchAddProducts() { 
	//  System.out.println("Batch Adding Product Values");// 
	//  try { 
	//   connection.setAutoCommit(false);//   preparedStatement = connection.prepareStatement("INSERT INTO products VALUES (?, ?, ?, ?)"); 
	////   // adding multiple products 
	//   preparedStatement.setInt(1, 1);//   preparedStatement.setString(2, "Product A"); 
	//   preparedStatement.setString(3, "Description A");//   preparedStatement.setInt(4, 1); 
	//   preparedStatement.addBatch();// 
	//   preparedStatement.setInt(1, 2);//   preparedStatement.setString(2, "Product B"); 
	//   preparedStatement.setString(3, "Description B");//   preparedStatement.setInt(4, 2); 
	//   preparedStatement.addBatch();// 
	//   preparedStatement.executeBatch();//   connection.commit(); 
	//   System.out.println("Batch addition of products successful.");// 
	//  } catch (SQLException e) {//   try { 
//	    connection.rollback();//    System.out.println("Batch addition of products failed. Changes rolled back."); 
	//   } catch (SQLException ex) {//    ex.printStackTrace(); 
	//   }//   e.printStackTrace(); 
	//  }// } 
}
