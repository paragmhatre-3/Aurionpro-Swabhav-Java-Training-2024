package com.aurionpro.list.model;

import java.util.Comparator;

public class EmployeeComparator {
	public static class SalaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			return employee1.getEmployeeSalary() - employee2.getEmployeeSalary();
		}

	}
	
	public static class NameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee employee1, Employee employee2) {
			return employee1.getEmployeeName().compareTo(employee2.getEmployeeName());
			
		}

	}
}
