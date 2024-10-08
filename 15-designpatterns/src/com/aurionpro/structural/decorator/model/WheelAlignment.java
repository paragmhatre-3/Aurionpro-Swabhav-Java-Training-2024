package com.aurionpro.structural.decorator.model;

public class WheelAlignment extends CarServiceDecorator {

	public WheelAlignment(ICarService carObject) {
		super(carObject);
	}

	@Override
	public double getCost() {
		return 400 + carObject.getCost();
	}

}
