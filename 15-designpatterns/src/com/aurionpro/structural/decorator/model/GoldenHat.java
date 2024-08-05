package com.aurionpro.structural.decorator.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hatObject) {
		super(hatObject);
	}
	
	@Override
	public String getName() {
		return "Golden Hat, " + hatObject.getName();
	}

	@Override
	public double getPrice() {
		return 250 + hatObject.getPrice();
	}

	@Override
	public String getDescription() {
		return "A Golden Hat is quite Uncommon, " + hatObject.getDescription();
	}
}
