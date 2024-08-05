package com.aurionpro.structural.adapter.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.structural.adapter.model.Biscuit;
import com.aurionpro.structural.adapter.model.Hat;
import com.aurionpro.structural.adapter.model.HatAdapter;
import com.aurionpro.structural.adapter.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ArrayList initialItems = new ArrayList();
		ShoppingCart shopper1 = new ShoppingCart(initialItems);
		
		Biscuit biscuit1 = new Biscuit("Milk Bikis",100);
		Hat hat = new Hat("CowBoy", "Bebop", 200, 25);
		HatAdapter hat1 = new HatAdapter(hat);
		shopper1.addItemtoCart(biscuit1);
		shopper1.addItemtoCart(hat1);
		
		shopper1.getItems();
		System.out.println(shopper1.cartPrice());
		
		

	}

}
