package com.aurionpro.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DbConnection {
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private Statement statement = null;
	private PreparedStatement orderStmt = null;
    private PreparedStatement orderDetailStmt = null;

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/factory", "root", "root");
			System.out.println("Database Connected Successfully");
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void runQueries() {
		executeAndPrintQuery(statement, "SELECT p.prodname AS product_name, s.supname AS supplier_name "
				+ "FROM products p " + "JOIN suppliers s ON p.supplierid = s.supplierid");
		executeAndPrintQuery(statement,
				"SELECT o.orderId, p.prodname AS product_name, od.quantity, od.price " + "FROM orders o "
						+ "JOIN orderdetails od ON o.orderId = od.orderId "
						+ "JOIN products p ON od.prodId = p.productid");
		executeAndPrintQuery(statement, "SELECT s.supname AS supplier_name " + "FROM suppliers s "
				+ "WHERE s.supplierid = (SELECT s.supplierid FROM products p WHERE p.productid = 1)");
		executeAndPrintQuery(statement, "SELECT p.prodname AS products_name, i.quantityonhand AS inventory_level "
				+ "FROM products p " + "INNER JOIN inventory i ON p.productid = i.prodId");
		executeAndPrintQuery(statement,
				"SELECT * FROM orders o WHERE o.orderdate >= DATE_SUB(CURRENT_DATE(), INTERVAL 1 MONTH)");
		executeAndPrintQuery(statement, "SELECT SUM(quantity) FROM orderdetails od GROUP BY od.orderId");
		executeAndPrintQuery(statement, "SELECT p.prodname, SUM(od.quantity) AS Total_quantity "
				+ "FROM orderdetails od " + "JOIN products p ON od.prodId = p.productid " + "GROUP BY p.prodname");
		executeAndPrintQuery(statement, "SELECT od.orderid AS Orders, SUM(od.price * od.quantity) AS sum "
				+ "FROM orderdetails od " + "GROUP BY od.orderid");
		executeAndPrintQuery(statement, "SELECT p.productid AS Product_supplied, p.prodname, s.supplierid AS suppliers "
				+ "FROM products p " + "JOIN suppliers s ON s.supplierid = p.supplierid");
		executeAndPrintQuery(statement, "SELECT AVG(i.quantityonhand), p.prodname " + "FROM inventory i "
				+ "JOIN products p ON i.prodId = p.productid " + "GROUP BY p.productid, p.prodname");
		executeAndPrintQuery(statement,
				"SELECT s.supplierid, s.supname, s.supcontactinfo, s.supaddress " + "FROM suppliers s "
						+ "LEFT JOIN products p ON s.supplierid = p.supplierid " + "WHERE p.productid IS NULL");

	}

	private void executeAndPrintQuery(Statement statement, String query) {
		try {
			ResultSet resultSet = statement.executeQuery(query);
			int columnCount = resultSet.getMetaData().getColumnCount();
			while (resultSet.next()) {
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(resultSet.getString(i) + " ");
				}
				System.out.println();
			}
			resultSet.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getSupplierDetails() {
		try {
			ResultSet dbSupplierData = statement.executeQuery("select * from suppliers");
			while (dbSupplierData.next()) {
				System.out.println(dbSupplierData.getInt(1) + "\t" + dbSupplierData.getString(2) + "\t"
						+ dbSupplierData.getString(3) + "\t" + dbSupplierData.getString(4));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void addSupplierDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Supplier ID:");
		int supplierId = scanner.nextInt();
		System.out.println("Enter Supplier Name:");
		String supplierName = scanner.next();
		System.out.println("Enter Contact Info:");
		String contactInfo = scanner.next();
		System.out.println("Enter Address:");
		String address = scanner.next();

		try {
			// statement.executeUpdate("insert into suppliers values("+supplierId
			// +",'"+supplierName+"','"+contactInfo+"','"+address+"')");
			preparedStatement = connection.prepareStatement("insert into suppliers values(?,?,?,?)");
			preparedStatement.setInt(1, supplierId);
			preparedStatement.setString(2, supplierName);
			preparedStatement.setString(3, contactInfo);
			preparedStatement.setString(4, address);
			preparedStatement.executeUpdate();

			System.out.println("Record Added Successfully!");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void updateSupplierDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Supplier ID to Update:");
		int supplierId = scanner.nextInt();
		System.out.println("Enter New Supplier Name:");
		String supplierName = scanner.next();
		System.out.println("Enter New Contact Info:");
		String contactInfo = scanner.next();
		System.out.println("Enter New Address:");
		String address = scanner.next();

		try {
			preparedStatement = connection.prepareStatement(
					"UPDATE suppliers SET name = ?, contact_info = ?, address = ? WHERE supplier_id = ?");
			preparedStatement.setString(1, supplierName);
			preparedStatement.setString(2, contactInfo);
			preparedStatement.setString(3, address);
			preparedStatement.setInt(4, supplierId);

			int rowsAffected = preparedStatement.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Record Updated Successfully!");
			} else {
				System.out.println("No record found with Supplier ID: " + supplierId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteSupplierDetails() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Supplier ID to Delete:");
			int supplierId = scanner.nextInt();
			statement.execute("delete from suppliers where supplier_id=" + supplierId);
			System.out.println("Row with Supplier_ID: " + supplierId + " Deleted Successfully");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void getProductDetails() {
		try {
			ResultSet dbProductsData = statement.executeQuery("select * from products");
			while (dbProductsData.next()) {
				System.out.println(dbProductsData.getInt(1) + "\t" + dbProductsData.getString(2) + "\t"
						+ dbProductsData.getString(3) + "\t" + dbProductsData.getInt(4));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void addProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product ID:");
		int productId = scanner.nextInt();
		System.out.println("Enter Product Name:");
		String productName = scanner.next();
		System.out.println("Enter Product Decription:");
		String productInfo = scanner.next();
		System.out.println("Enter Supplier ID:");
		int supplierIdForeignKey = scanner.nextInt();

		try {
			// statement.executeUpdate("insert into products values("+productId
			// +",'"+productName+"','"+productInfo+"','"+supplierIdForeignKey+"')");
			preparedStatement = connection.prepareStatement("insert into products values(?,?,?,?)");
			preparedStatement.setInt(1, productId);
			preparedStatement.setString(2, productName);
			preparedStatement.setString(3, productInfo);
			preparedStatement.setInt(4, supplierIdForeignKey);
			preparedStatement.executeUpdate();

			System.out.println("Record Added Successfully!");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void getOrders() {
		try {
			ResultSet dbOrdersData = statement.executeQuery("select * from orders");
			while (dbOrdersData.next()) {
				System.out.println(
						dbOrdersData.getInt(1) + "\t" + dbOrdersData.getDate(2) + "\t" + dbOrdersData.getInt(3));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void getOrderDetails() {
		try {
			ResultSet dbOrdersData = statement.executeQuery("select * from order_details");
			while (dbOrdersData.next()) {
				System.out.println(dbOrdersData.getInt(1) + "\t" + dbOrdersData.getInt(2) + "\t"
						+ dbOrdersData.getInt(3) + "\t" + dbOrdersData.getInt(4) + "\t" + dbOrdersData.getInt(5));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void addOrderDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Order Detail ID:");
		int orderDetailId = scanner.nextInt();
		System.out.println("Enter Order ID:");
		int orderId = scanner.nextInt();
		System.out.println("Enter Product ID:");
		int productId = scanner.nextInt();
		System.out.println("Enter Quantity:");
		int quantity = scanner.nextInt();
		System.out.println("Enter Price:");
		int price = scanner.nextInt();

		try {
			// statement.executeUpdate("insert into products values("+productId
			// +",'"+productName+"','"+productInfo+"','"+supplierIdForeignKey+"')");
			preparedStatement = connection.prepareStatement("insert into order_details values(?,?,?,?,?)");
			preparedStatement.setInt(1, orderDetailId);
			preparedStatement.setInt(2, orderId);
			preparedStatement.setInt(3, productId);
			preparedStatement.setInt(4, quantity);
			preparedStatement.setInt(5, price);

			preparedStatement.executeUpdate();

			System.out.println("Record Added Successfully!");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void getInventory() {
		try {
			ResultSet dbOrdersData = statement.executeQuery("select * from inventory");
			while (dbOrdersData.next()) {
				System.out.println(
						dbOrdersData.getInt(1) + "\t" + dbOrdersData.getInt(2) + "\t" + dbOrdersData.getInt(3));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void addInventory() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Order Detail ID:");
		int inventoryId = scanner.nextInt();
		System.out.println("Enter Order ID:");
		int productId = scanner.nextInt();
		System.out.println("Enter Product ID:");
		int inventoryOnHAnd = scanner.nextInt();

		try {
			// statement.executeUpdate("insert into products values("+productId
			// +",'"+productName+"','"+productInfo+"','"+supplierIdForeignKey+"')");
			preparedStatement = connection.prepareStatement("insert into inventory values(?,?,?)");
			preparedStatement.setInt(1, inventoryId);
			preparedStatement.setInt(2, productId);
			preparedStatement.setInt(3, inventoryOnHAnd);
			preparedStatement.executeUpdate();

			System.out.println("Record Added Successfully!");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	
//	public void TransactionManagementPoC() {
//	        {
//
//	        try {
//	            // Step 1: Establish a connection to the database
//
//	            // Step 2: Disable auto-commit mode
//	            connection.setAutoCommit(false);
//
//	            // Step 3: Create SQL statements for inserting data
//	            String orderSQL = "INSERT INTO orders (order_id, order_date, supplier_id) VALUES (?, ?, ?)";
//	            String orderDetailSQL = "INSERT INTO order_details (order_detail_id, order_id, product_id, quantity) VALUES (?, ?, ?, ?)";
//
//	            orderStmt = connection.prepareStatement(orderSQL);
//	            orderDetailStmt = connection.prepareStatement(orderDetailSQL);
//
//	            // Sample data for the order
//	            int orderId = 1001;
//	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//	            java.util.Date orderDate = sdf.parse("2024-08-08");
//	            java.sql.Date sqlOrderDate = new java.sql.Date(orderDate.getTime());
//	            int supplierId = 5001;
//
//	            // Insert into orders table
//	            orderStmt.setInt(1, orderId);
//	            orderStmt.setDate(2, sqlOrderDate);
//	            orderStmt.setInt(3, supplierId);
//	            orderStmt.executeUpdate();
//
//	            // Sample data for order details
//	            int orderDetailId1 = 2001;
//	            String productName1 = "Product A";
//	            int quantity1 = 10;
//
//	            int orderDetailId2 = 2002;
//	            String productName2 = "Product B";
//	            int quantity2 = 5;
//
//	            // Insert into order_details table
//	            orderDetailStmt.setInt(1, orderDetailId1);
//	            orderDetailStmt.setInt(2, orderId);
//	            orderDetailStmt.setString(3, productName1);
//	            orderDetailStmt.setInt(4, quantity1);
//	            orderDetailStmt.executeUpdate();
//
//	            orderDetailStmt.setInt(1, orderDetailId2);
//	            orderDetailStmt.setInt(2, orderId);
//	            orderDetailStmt.setString(3, productName2);
//	            orderDetailStmt.setInt(4, quantity2);
//	            orderDetailStmt.executeUpdate();
//
//	            // Step 4: Commit the transaction
//	            connection.commit();
//
//	            System.out.println("Transaction committed successfully.");
//
//	        } catch (Exception e) {
//	            try {
//	                // Step 5: Rollback the transaction in case of an error
//	                if (connection != null) {
//	                    connection.rollback();
//	                    System.out.println("Transaction rolled back due to an error.");
//	                }
//	            } catch (SQLException rollbackEx) {
//	                rollbackEx.printStackTrace();
//	            }
//	            e.printStackTrace();
//	        } finally {
//	            try {
//	                if (orderStmt != null) orderStmt.close();
//	                if (orderDetailStmt != null) orderDetailStmt.close();
//	                if (connection != null) connection.close();
//	            } catch (SQLException closeEx) {
//	                closeEx.printStackTrace();
//	            }
//	}

	// public void addOrders() throws ParseException {
	// Scanner scanner = new Scanner(System.in);
	// System.out.println("Enter Order ID:");
	// int orderId = scanner.nextInt();
	//
	// System.out.println("Enter date in format yyyy-MM-dd:");
	// String dateInput = scanner.nextLine();
	//
	// // Parse the date input
	// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	// LocalDate localDate = LocalDate.parse(dateInput, formatter);
	// java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
	//
	// System.out.println("Enter Supplier ID:");
	// int supplierId = scanner.nextInt();
	//
	// try {
	//
	// PreparedStatement preparedStatement = connection.prepareStatement("INSERT
	// INTO orders VALUES (?, ?, ?)");
	// preparedStatement.setInt(1, orderId);
	// preparedStatement.setDate(2, sqlDate); // Use java.sql.Date here
	// preparedStatement.setInt(3, supplierId);
	// preparedStatement.executeUpdate();
	//
	// System.out.println("Record Added Successfully!");
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// scanner.close();
	// }


}