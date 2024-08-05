package com.techlabs.model;

public class Circle implements Shape{
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle:" + (radius * radius * 3.14));
		
	}
	
}
