package com.aurionpro.structural.decorator.model;

public class HatDecorator implements IHat{
	protected IHat hatObject;
	
	public HatDecorator(IHat hatObject) {
		super();
		this.hatObject = hatObject;
	}

	@Override
	public String getName() {
		return hatObject.getName();
	}

	@Override
	public double getPrice() {
		return hatObject.getPrice();
	}

	@Override
	public String getDescription() {
		return hatObject.getDescription();
	}

}
