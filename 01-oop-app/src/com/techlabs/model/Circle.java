package com.techlabs.model;

public class Circle {
	private int radius;
	
	public Circle(int r) {
		radius = r;
	}
	
	public double calculateArea() {
		return radius * radius * 3.14;
		
	}
	
	public int getRadius() {
		return radius;
	}
	
	//public void setRadius(int r) {
		//radius = r;
	//}
}
