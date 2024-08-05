package com.aurionpro.structural.decorator.model;

public class OilChange extends CarServiceDecorator {

	public OilChange(ICarService carObject) {
		super(carObject);

	}

	@Override
	public double getCost() {
		return 500 + carObject.getCost();
	}

}
