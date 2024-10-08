package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.GoldenHat;
import com.aurionpro.structural.decorator.model.IHat;
import com.aurionpro.structural.decorator.model.PremiumHat;
import com.aurionpro.structural.decorator.model.RibbonedHat;
import com.aurionpro.structural.decorator.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		IHat hat1 = new StandardHat();
		RibbonedHat ribbonedHat1 = new RibbonedHat(hat1);
		System.out.println("Name: " + ribbonedHat1.getName());
		System.out.println("Price: " + ribbonedHat1.getPrice());
		System.out.println("Description: " + ribbonedHat1.getDescription());

		System.out.println("---------------------------------------------------------------------------------------------");

		IHat hat2 = new PremiumHat();
		GoldenHat goldenHat1 = new GoldenHat(hat2);
		System.out.println("Name: " + goldenHat1.getName());
		System.out.println("Price: " + goldenHat1.getPrice());
		System.out.println("Description: " + goldenHat1.getDescription());
		
		System.out.println("---------------------------------------------------------------------------------------------");
		
		IHat hat3 = new StandardHat();
		GoldenHat goldenHat2 = new GoldenHat(hat3);
		System.out.println("Name: " + goldenHat2.getName());
		System.out.println("Price: " + goldenHat2.getPrice());
		System.out.println("Description: " + goldenHat2.getDescription());
		
		System.out.println("---------------------------------------------------------------------------------------------");
		
		IHat hat4 = new PremiumHat();
		RibbonedHat ribbonedHat2 = new RibbonedHat(hat4);
		System.out.println("Name: " + ribbonedHat2.getName());
		System.out.println("Price: " + ribbonedHat2.getPrice());
		System.out.println("Description: " + ribbonedHat2.getDescription());
	}

}
