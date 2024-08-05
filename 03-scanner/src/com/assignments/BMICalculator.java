package com.assignments;
import java.util.Scanner;
public class BMICalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Height (in meters):");
		double height = sc.nextDouble();
		System.out.println("Enter your Weight (in kilograms):");
		double weight = sc.nextDouble();
		double bmi =  weight / (height*height);
		
		System.out.println("The Body Mass Index (BMI) is:"+bmi);


	}

}
