package com.aurionpro.isp.solution.model;

public class DB_logger implements ILogger{
	public void log(String error){
		System.out.println("Logged In to Database	" + error);
	}
}
