package com.aurionpro.structural.adapter.model;

public class Biscuit implements IItems {
	private String name;
	private int mrp;

	@Override
	public String toString() {
		return "Biscuit [Name=" + name + ", Price=" + mrp +  "]";
	}

	public Biscuit(String name, int mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

	@Override
	public String getItemName() {
		return this.name;
	}

	@Override
	public double getItemPrice() {
		return this.mrp;
	}

}
