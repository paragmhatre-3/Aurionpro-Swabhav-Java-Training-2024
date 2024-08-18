package com.aurionpro.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountDbUtil {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;

	public void connectToDb() {
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

	}

	public String generateAccount(String customerId, Long balance) {
		connectToDb();
		String accountDetails = "";
		long minAccountNumber = 100_000_000L; // 9-digit number
		long maxAccountNumber = 999_999_999L; // 9-digit number

		// Generate the account number within the specified range
		long accountNumber = minAccountNumber + (long)(Math.random() * (maxAccountNumber - minAccountNumber + 1));

		// Check uniqueness (pseudo-code, depends on your implementation)
		while (isAccountNumberExists(accountNumber)) {
		    accountNumber = minAccountNumber + (long)(Math.random() * (maxAccountNumber - minAccountNumber + 1));
		}
		try {
			preparedStatement = connection
					.prepareStatement("insert into accounts (account_number, customer_id, balance) values(?,?,?)");
			preparedStatement.setLong(1, accountNumber);
			preparedStatement.setString(2, customerId);
			preparedStatement.setLong(3, balance);
			preparedStatement.executeUpdate();
			accountDetails = "Account Number:  " + accountNumber + "InitialBalance: "+ balance;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accountDetails;

	}

	private boolean isAccountNumberExists(long accountNumber) { 
	    List<Long> accountNumbers = getAllAccountNumbers(); 
	    for (Long account_number : accountNumbers) { 
	        if (account_number.equals(accountNumber)) { 
	            return true; // Account number exists 
	        } 
	    } 
	    return false; // Account number doesn't exist 
	}

	public List<Long> getAccountNumbers(String customerId) {
		connectToDb();
		List<Long> accountNumbers = new ArrayList<>();
		try {
			preparedStatement = connection.prepareStatement("SELECT account_number FROM accounts WHERE customer_id = ?");
			preparedStatement.setString(1, customerId);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				// Add each account number to the list
				accountNumbers.add(rs.getLong("account_number"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accountNumbers;
	}
	
	public List<Long> getAllAccountNumbers() {
		connectToDb();
		List<Long> accountNumbers = new ArrayList<>();
		try {
			preparedStatement = connection.prepareStatement("SELECT account_number FROM accounts");
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				// Add each account number to the list
				accountNumbers.add(rs.getLong("account_number"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accountNumbers;
	}
}
