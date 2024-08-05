package com.techlabs.model;

public class FourWheeler extends Vehicle {
	
	public FourWheeler (String company, int mileage) {
		super(company);
		this.mileage = mileage;
		
	}
	
	private int mileage;

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
}
