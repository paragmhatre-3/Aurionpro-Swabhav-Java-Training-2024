package com.aurionpro.structural.decorator.model;

public class RibbonedHat extends HatDecorator{

	public RibbonedHat(IHat hatObject) {
		super(hatObject);
	}
	
	@Override
	public String getName() {
		return "Ribboned Hat, " + hatObject.getName();
	}

	@Override
	public double getPrice() {
		return 120 + hatObject.getPrice();
	}

	@Override
	public String getDescription() {
		return "A Ribboned Hat is quite Cute, " + hatObject.getDescription();
	}
}
