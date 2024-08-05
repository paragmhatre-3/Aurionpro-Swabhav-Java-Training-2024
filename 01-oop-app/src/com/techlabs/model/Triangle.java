package com.techlabs.model;

public class Triangle extends Shape{
	private int width;
	private int height;
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void area() {
		System.out.println("Area of Triangle:" + (0.5 * width * height));
	}
}
