package com.aurionpro.structural.decorator.model;

public class StandardHat implements IHat{

	@Override
	public String getName() {
		return "Standard Hat";
	}

	@Override
	public double getPrice() {
		return 100;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return " this is a Sturdy & Standard Hat";
	}

}
