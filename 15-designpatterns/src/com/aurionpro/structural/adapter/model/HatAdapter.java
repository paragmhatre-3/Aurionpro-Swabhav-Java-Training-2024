package com.aurionpro.structural.adapter.model;

public class HatAdapter implements IItems {
	private Hat hat;

	@Override
	public String toString() {
		return "Hat [Name=" + getItemName() + ", Price=" + getItemPrice()
				+ "]";
	}

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {

		return hat.getShortName() + " " + hat.getLongName();
	}

	@Override
	public double getItemPrice() {
		return hat.getBasicPrice() + hat.getTax();
	}

}
