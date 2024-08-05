package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of employees information you want to give and print:");
		int j = sc.nextInt();
		
		for(int i=1; i <= j; i++) {
			System.out.println("Enter the Employee ID, Employee Name and Salary of the Employee ");
			int employeeid = sc.nextInt();
			String name = sc.next();
			int salary = sc.nextInt();
			Employee employee1 = new Employee(employeeid,name,salary);
		
		employee1.getInfo();
		
		}
		sc.close();

	}

}
