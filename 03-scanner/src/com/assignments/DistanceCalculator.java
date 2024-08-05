package com.assignments;
import java.util.Scanner;

public class DistanceCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first point x1 co-ordinate:");
		double x1 = sc.nextDouble();
		System.out.println("Enter the first point y1 co-ordinate:");
		double y1 = sc.nextDouble();
		System.out.println("Enter the first point x2 co-ordinate:");
		double x2 = sc.nextDouble();
		System.out.println("Enter the first point y2 co-ordinate:");
		double y2 = sc.nextDouble();
		
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("The Distance between the points given is:"+" "+distance);
	}

}
