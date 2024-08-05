package com.aurionpro.structural.adapter.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private ArrayList<IItems> cartItems;

	public ShoppingCart(ArrayList<IItems> cartItems) {
		super();
		this.cartItems = cartItems;
	}
	
	public void addItemtoCart(IItems item) {
		cartItems.add(item);
	}
	public void getItems(){
		for(IItems item:cartItems)
			System.out.println(item);
		
	}
	public double cartPrice() {
		double price = 0;
		for(IItems item:cartItems)
			price += item.getItemPrice();
		return price;
	}
}
