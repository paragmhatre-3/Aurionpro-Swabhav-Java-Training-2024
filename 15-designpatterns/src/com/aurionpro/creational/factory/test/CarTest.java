package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.ICar;
import com.aurionpro.creational.factory.model.ICarFactory;
import com.aurionpro.creational.factory.model.Mahindra;
import com.aurionpro.creational.factory.model.Maruti;
import com.aurionpro.creational.factory.model.MarutiFactory;
import com.aurionpro.creational.factory.model.Tata;
import com.aurionpro.creational.factory.model.TataFactory;
import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.CarType;

public class CarTest {

	public static void main(String[] args) {
//		ICar tata = new Tata();
//		ICar maruti = new Maruti();
//		ICar mahindra = new Mahindra();
//
//		tata.start();
//		tata.stop();
//		
//		maruti.start();
//		maruti.stop();
//		
//		mahindra.start();
//		mahindra.stop();
		
		
		
		//ENUM SOLUTION
//		ICar car;
//		CarFactory carFactory = new CarFactory();
//		car =  carFactory.makeCar(CarType.MARUTI);
//		car.start();
//		car.stop();
		
		
		
		//INTERFACE OF FACTORIES METHOD
		ICarFactory tataFactory = new TataFactory();
		ICar tata = tataFactory.makeCar();
		tata.start();
		tata.stop();

	}

}
