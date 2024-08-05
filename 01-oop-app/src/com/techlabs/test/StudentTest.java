package com.techlabs.test;
import java.util.Scanner;

import com.techlabs.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=1; i <= 1; i++) {
			System.out.println("Enter the Student's Name, Student's Age and Percentage of the Student ");
			String name = sc.next();
			int age = sc.nextInt();
			double percentage = sc.nextDouble();
			Student student1 = new Student(name,age,percentage);
		
		System.out.println("Student Information:"+student1.getName()+"\nAge:"+student1.getAge()+"\nPercentage"+student1.getPercentage());
		student1.getGrade();
		
		}
		sc.close();
	}

}
