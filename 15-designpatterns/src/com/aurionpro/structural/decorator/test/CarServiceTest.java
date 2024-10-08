package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.CarInspection;
import com.aurionpro.structural.decorator.model.ICarService;
import com.aurionpro.structural.decorator.model.OilChange;
import com.aurionpro.structural.decorator.model.WheelAlignment;

public class CarServiceTest {

	public static void main(String[] args) {
		ICarService car1 = new CarInspection();
		WheelAlignment wheelAlign = new WheelAlignment(car1);
		OilChange oilChange = new OilChange(wheelAlign);

		System.out.println(oilChange.getCost());

	}

}
