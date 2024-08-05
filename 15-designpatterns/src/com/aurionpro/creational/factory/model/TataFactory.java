package com.aurionpro.creational.factory.model;

public class TataFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		return new Tata();
	}

}
