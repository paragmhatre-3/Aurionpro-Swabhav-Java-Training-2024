package com.aurionpro.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Customer;

public class CustomerDbUtil {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;

	public Connection connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
			System.out.println("Database Connected Successfully");
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;

	}

	public void addCustomer(String firstName, String lastName, String email, String password) {
		try {
			connectToDb();
			preparedStatement = connection
					.prepareStatement("insert into customers(first_name, last_name, email, password) values(?,?,?,?)");
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Customer> getAllCustomers() {
		connectToDb();
		List<Customer> customers = new ArrayList<Customer>();
		try {
			ResultSet dbCustomers = statement.executeQuery("select * from customers");

			while (dbCustomers.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(dbCustomers.getInt("customer_id"));
				customer.setFirstName(dbCustomers.getString("first_name"));
				customer.setLastName(dbCustomers.getString("last_name"));
				customer.setEmail(dbCustomers.getString("email"));
				customer.setPassword(dbCustomers.getString("password"));
				customers.add(customer);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customers;
	}

	public String getCustomerId(String username) {
		String customerID = null;
		try {
			preparedStatement = connection.prepareStatement("SELECT customer_id FROM customers WHERE email = ?");
			preparedStatement.setString(1, username);
			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				customerID = rs.getString("customer_id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customerID;
	}

	public String getOneCustomer(String customerId) {
		connectToDb();

		String customerDetails = "";
		try {
			ResultSet dbCustomers = statement.executeQuery("select * from customers where customer_id =" + customerId);
			if (dbCustomers.next()) {
				customerDetails = "Name: " + dbCustomers.getString("first_name") + " "
						+ dbCustomers.getString("last_name") + "<br>" + "Email: " + dbCustomers.getString("email")
						+ "<br>";

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customerDetails;
	}

	public boolean validateCustomer(String username, String password) { 
	    List<Customer> dbCustomers = getAllCustomers(); 
	     
	    // If dbCustomers is null, return false (no customers to validate against) 
	    if (dbCustomers == null) { 
	        return false; 
	    } 
	 
	    for (Customer customer : dbCustomers) { 
	        // Use .equals() to compare string content 
	        if (customer.getEmail().equals(username) && customer.getPassword().equals(password)) { 
	            return true;  // Return true immediately if a match is found 
	        } 
	    } 
	     
	    // If no match is found after iterating through all customers, return false 
	    return false; 
	}

	public List<Customer> getCustomers() {

		// Customer customer = null;
		List<Customer> customers = new ArrayList<Customer>();
		try {
			ResultSet dbCustomers = statement.executeQuery(
					"select c.first_name, c.last_name, a.account_number, a.balance from customers c inner join accounts a on c.customer_id = a.customer_id");

			while (dbCustomers.next()) {
				Customer customer = new Customer();
				customer.setFirstName(dbCustomers.getString("first_name"));
				customer.setLastName(dbCustomers.getString("last_name"));
				customer.setAccountNumber(dbCustomers.getLong("account_number"));
				customer.setBalance(dbCustomers.getDouble("balance"));
				customers.add(customer);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customers;
	}

	public void editCustomer(String customerId, String newPassword, String firstName, String lastName) {
		connectToDb();
		try {
			preparedStatement = connection.prepareStatement(
					"UPDATE customers SET first_name = ?, last_name = ?, password = ? WHERE customer_id = "
							+ customerId);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			preparedStatement.setString(3, newPassword);
			int rowsAffected = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
