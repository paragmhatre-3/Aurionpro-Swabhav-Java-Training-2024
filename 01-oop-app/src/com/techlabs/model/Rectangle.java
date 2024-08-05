package com.techlabs.model;

public class Rectangle  extends Shape{
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area() {
		System.out.println("ARea of Rectangle:" + (length * breadth));
	}
	
	
}
