package com.assignments;
import java.util.Scanner;


public class TrapezoidAreaCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first base of the trapezoid:");
		double base1 = sc.nextDouble();
		
		System.out.println("Enter the second base of the trapezoid:");
		double base2 = sc.nextDouble();
		
		System.out.println("Enter the Height of the trapezoid:");
		double height = sc.nextDouble();
		
		double area = (base1 + base2) / 2 * height;
		
		System.out.println("The area of the Trapezoid is:"+area);

	}

}
