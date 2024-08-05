package com.aurionpro.structural.decorator.model;

public class PremiumHat implements IHat{

	@Override
	public String getName() {
		return "Premium Hat";
	}

	@Override
	public double getPrice() {
		return 250;
	}

	@Override
	public String getDescription() {
		return "This is a Premium Hat with quality material";
	}

}
