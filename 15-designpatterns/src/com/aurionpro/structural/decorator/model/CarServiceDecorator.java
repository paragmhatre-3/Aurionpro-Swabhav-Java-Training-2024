package com.aurionpro.structural.decorator.model;

public abstract class CarServiceDecorator implements ICarService {
	protected ICarService carObject;

	public CarServiceDecorator(ICarService carObject) {
		super();
		this.carObject = carObject;
	}

	@Override
	public double getCost() {
		return carObject.getCost();
	}
}
