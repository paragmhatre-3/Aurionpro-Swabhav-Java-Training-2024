package com.techlabs.test;
import java.util.Scanner;
import com.techlabs.model.Circle;

public class CircleTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of Circle:");
		int r = sc.nextInt();
		Circle c = new Circle(r);
		
		System.out.println("Radius of the Circle:"+c.getRadius());
		System.out.println("Area of the Circle:"+c.calculateArea());

	}

}
