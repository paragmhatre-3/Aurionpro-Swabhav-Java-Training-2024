package com.aurionpro.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Transaction;

public class TransactionDbUtil {
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

	public List<Transaction> getTransactions() {

		// Customer customer = null;
		List<Transaction> transactions = new ArrayList<Transaction>();
		try {
			ResultSet dbTransactions = statement.executeQuery("select * from transactions");

			while (dbTransactions.next()) {
				Transaction transaction = new Transaction();
				transaction.setTransactionId(dbTransactions.getInt("transaction_id"));
				transaction.setSenderAccountNumber(dbTransactions.getLong("sender_acc_no"));
				transaction.setReceiverAccountNumber(dbTransactions.getLong("receiver_acc_no"));
				transaction.setTransactionType(dbTransactions.getString("transaction_type"));
				transaction.setAmount(dbTransactions.getDouble("amount"));
				transaction.setDate(dbTransactions.getString("date"));
				transactions.add(transaction);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return transactions;
	}

	public List<Transaction> getPassbook(List<Long> accountNumbers) {
		List<Transaction> transactions = new ArrayList<Transaction>();

		if (accountNumbers == null || accountNumbers.isEmpty()) {
			// If no account numbers are provided, return an empty list
			return transactions;
		}

		// Build the SQL query dynamically to check both sender and receiver account
		// numbers
		StringBuilder queryBuilder = new StringBuilder("SELECT * FROM transactions WHERE ");
		queryBuilder.append("(");
		for (int i = 0; i < accountNumbers.size(); i++) {
			queryBuilder.append("sender_acc_no = ? OR receiver_acc_no = ?");
			if (i < accountNumbers.size() - 1) {
				queryBuilder.append(" OR ");
			}
		}
		queryBuilder.append(")");

		try {
			// Prepare the SQL statement
			PreparedStatement preparedStatement = connection.prepareStatement(queryBuilder.toString());

			// Set the parameters for both sender and receiver account numbers
			for (int i = 0; i < accountNumbers.size(); i++) {
				preparedStatement.setLong(2 * i + 1, accountNumbers.get(i)); // sender_acc_no
				preparedStatement.setLong(2 * i + 2, accountNumbers.get(i)); // receiver_acc_no
			}

			// Execute the query
			ResultSet dbTransactions = preparedStatement.executeQuery();

			// Process the result set
			while (dbTransactions.next()) {
				Transaction transaction = new Transaction();
				transaction.setTransactionId(dbTransactions.getInt("transaction_id"));
				transaction.setSenderAccountNumber(dbTransactions.getLong("sender_acc_no"));
				transaction.setReceiverAccountNumber(dbTransactions.getLong("receiver_acc_no"));
				transaction.setTransactionType(dbTransactions.getString("transaction_type"));
				transaction.setAmount(dbTransactions.getDouble("amount"));
				transaction.setDate(dbTransactions.getString("date"));
				transactions.add(transaction);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return transactions;
	}

	public void addTransaction(Long senderAccount, Long receiverAccount, String transactionType, Double amount, Date date) {
		try {
			connectToDb();
			preparedStatement = connection.prepareStatement(
					"insert into transactions(sender_acc_no, receiver_acc_no, transaction_type, amount, date) values(?,?,?,?,?)");
			preparedStatement.setLong(1, senderAccount);
			preparedStatement.setLong(2, receiverAccount);
			preparedStatement.setString(3, transactionType);
			preparedStatement.setDouble(4, amount);
			preparedStatement.setDate(5, date);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addTransactionOther(Long senderAccount, String transactionType, Double amount, Date date) {
		try {
			connectToDb();
			preparedStatement = connection.prepareStatement(
					"insert into transactions(sender_acc_no, transaction_type, amount, date) values(?,?,?,?)");
			preparedStatement.setLong(1, senderAccount);
			preparedStatement.setString(2, transactionType);
			preparedStatement.setDouble(3, amount);
			preparedStatement.setDate(4, date);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}