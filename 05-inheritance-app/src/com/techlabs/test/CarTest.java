package com.techlabs.test;

import com.techlabs.model.Car;

public class CarTest {
	
	public static void main(String [] args) {
		Car car1 = new Car("Lambo", 12,50000);
//		car1.setCompany("Lamborghini");
//		car1.setMileage(10);
//		car1.setPrice(600555);
		
		System.out.println(car1.getCompany());
		System.out.println(car1.getMileage());
		System.out.println(car1.getPrice());
		
	}
}
