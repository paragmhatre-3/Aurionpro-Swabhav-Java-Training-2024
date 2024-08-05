package com.techlabs.test;

import com.techlabs.model.Circle;
import com.techlabs.model.Shape;
import com.techlabs.model.Triangle;

public class ShapeTest {

	public static void main(String[] args) {
//		Circle circle = new Circle(9);
//		Triangle triangle = new Triangle(5,6);
		Shape shape;
		shape = new Circle(9);
		shape.area();
		
		shape = new Triangle(5,6);
		shape.area();
		

	}

}
