package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.aurionpro.list.model.Employee;
import com.aurionpro.list.model.EmployeeComparator;
import com.aurionpro.list.model.Student;
import com.aurionpro.list.model.StudentComparator;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		Scanner scanner = new Scanner(System.in);
		employeeReader(employees, scanner);
		employeePrinter(employees, scanner);
		// System.out.println(students);
		Collections.sort(employees, new EmployeeComparator.SalaryComparator());
		System.out.println("After Sorting by Roll Number :");
		employeePrinter(employees, scanner);

		Collections.sort(employees, new EmployeeComparator.NameComparator());
		System.out.println("After Sorting by Name :");
		employeePrinter(employees, scanner);
	}

	private static void employeePrinter(List<Employee> employees, Scanner scanner) {
		System.out.println("Using FOR(each) loop:");
		for (Employee employee : employees)
			System.out.println(employee);
		System.out.println("-------------------------------------------------------------------");

		// System.out.println("Using Iterator Interface:");
		// Iterator<Student> studentIterator = students.iterator();
		// while (studentIterator.hasNext())
		// System.out.println(studentIterator.next());
		// System.out.println("-------------------------------------------------------------------");
		//
		// System.out.println("Using List Iterator Interface:");
		// ListIterator<Student> studentListIterator = students.listIterator();
		// while (studentListIterator.hasNext())
		// System.out.println(studentListIterator.next());
		// System.out.println("-------------------------------------------------------------------");
		// while (studentListIterator.hasPrevious())
		// System.out.println(studentListIterator.previous());
	}

	private static void employeeReader(List<Employee> employees, Scanner scanner) {
		System.out.println("How many Employees do you want to Register?");
		int size = scanner.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Employee ID number:");
			int employeeId = scanner.nextInt();
			System.out.println("Enter Employee Name:");
			String employeeName = scanner.next();
			System.out.println("Enter Employee Salary:");
			int employeeSalary = scanner.nextInt();

			employees.add(new Employee(employeeId, employeeName, employeeSalary));
		}
	}
}
