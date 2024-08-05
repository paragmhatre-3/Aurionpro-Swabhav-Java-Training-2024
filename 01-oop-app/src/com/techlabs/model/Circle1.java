package com.techlabs.model;

public class Circle1 extends Shape{
	private int radius;

	public Circle1(int radius) {
		super();
		this.radius = radius;
	}
	
	public void area() {
		System.out.println("Area of Circle:" + (radius * radius * 3.14));
	}
}
