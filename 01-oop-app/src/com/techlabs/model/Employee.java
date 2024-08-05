package com.techlabs.model;

public class Employee {
	private int employeeid;
	private String name;
	private int salary;
	
	//constructor
	public Employee(int employeeid, String name, int salaray) {
		this.employeeid = employeeid;
		this.name = name;
		this.salary = salaray;
	}
	
	//getter methods
	public int getEmployeeId() {
		return employeeid;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void getInfo() {
		System.out.println("Employee Id:"+getEmployeeId());
		System.out.println("Employee Name:"+getName());
		System.out.println("Employee Salary:"+getSalary());
	}
	
	
}
