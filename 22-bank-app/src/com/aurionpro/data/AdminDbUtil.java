package com.aurionpro.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDbUtil {
	private Connection connection = null;
	private Statement statement = null;
	
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
	
	public ResultSet getAllAdmins() {
		ResultSet dbAdmins = null;
		try {
			dbAdmins = statement.executeQuery("select * from admins");
			}
		 catch (SQLException e) {
			e.printStackTrace();
		}
		return dbAdmins;
	}
	
	public boolean validateAdmin(String username, String password) {
		ResultSet dbAdmins = getAllAdmins();
		
		try {
			while(dbAdmins.next()) {
				if(dbAdmins.getString("username").equals(username))
					if(dbAdmins.getString("password").equals(password))
						return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
