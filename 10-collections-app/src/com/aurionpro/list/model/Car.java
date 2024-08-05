package com.aurionpro.list.model;


public class Car {
	private int carId;
	private String companyName;
	private int mileage;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public Car(int carId, String companyName, int mileage) {
		super();
		this.carId = carId;
		this.companyName = companyName;
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", companyName=" + companyName + ", mileage=" + mileage + "]";
	}
	
}
