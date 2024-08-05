package com.techlabs.model;

public class Car extends FourWheeler {
	private int price;
	
	public Car(String company, int mileage, int price) {
		super(company, mileage);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
