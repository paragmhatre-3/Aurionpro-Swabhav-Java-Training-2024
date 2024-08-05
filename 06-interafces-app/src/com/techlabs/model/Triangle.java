package com.techlabs.model;

public class Triangle implements Shape{
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public void area() {
		System.out.println("Area of Triangle" + (0.5 * height * width));
		
	}

}
