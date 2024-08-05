package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.aurionpro.list.model.Student;
import com.aurionpro.list.model.StudentComparator;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		studentReader(students, scanner);
		studentPrinter(students, scanner);
		// System.out.println(students);
		Collections.sort(students, new StudentComparator.RollNumberComparator());
		System.out.println("After Sorting by Roll Number :");
		studentPrinter(students, scanner);

		Collections.sort(students, new StudentComparator.NameComparator());
		System.out.println("After Sorting by Name :");
		studentPrinter(students, scanner);
	}

	private static void studentPrinter(List<Student> students, Scanner scanner) {
		System.out.println("Using FOR(each) loop:");
		for (Student student : students)
			System.out.println(student);
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

	private static void studentReader(List<Student> students, Scanner scanner) {
		System.out.println("How many students do you want?");
		int size = scanner.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Roll noumber:");
			int rollNumber = scanner.nextInt();
			System.out.println("Enter Name:");
			String name = scanner.next();
			System.out.println("Enter Percentage:");
			double percentage = scanner.nextDouble();

			students.add(new Student(rollNumber, name, percentage));
		}
	}
}
