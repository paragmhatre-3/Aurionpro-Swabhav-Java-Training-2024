package com.aurionpro.creational.factory.model;

public class CarFactory {
	
	public ICar makeCar(CarType carName) {
		ICar car = null;
		if(carName==CarType.MARUTI)
			car = new Maruti();
		if(carName==CarType.TATA)
			car = new Tata();
		if(carName==CarType.MAHINDRA)
			car = new Mahindra();
		return car;
	}
//	public ICar makeCar(String carName) {
//		ICar car = null;
//		if(carName == "Maruti")
//			car = new Maruti();
//		if(carName == "Tata")
//			car = new Tata();
//		if(carName == "Mahindra")
//			car = new Mahindra();
//		return car;
//	}
}
