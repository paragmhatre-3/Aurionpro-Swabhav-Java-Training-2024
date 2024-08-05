package com.aurionpro.isp.solution.model;

public class File_logger implements ILogger{
	public void log(String error){
		System.out.println("Logged In to File	" + error);
	}
}