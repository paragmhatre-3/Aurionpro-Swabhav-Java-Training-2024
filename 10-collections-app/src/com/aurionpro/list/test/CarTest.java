package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Car;


public class CarTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> cars = new ArrayList<Car>();
		
		readCars(cars, scanner);
		for (Car car : cars)
			System.out.println(car);
		maximumMileage(cars);
		
	}

	private static void maximumMileage(List<Car> cars) {
		Car maximumMileageCar = cars.get(0);
		for(Car car:cars)
			if(car.getMileage() > maximumMileageCar.getMileage())
				maximumMileageCar = car;
		System.out.println("Car with Maximum Mileage: \n" + maximumMileageCar);
	}

	private static void readCars(List<Car>cars, Scanner scanner) {
		System.out.println("How many Cars do you want?");
		int size = scanner.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Car ID:");
			int carId = scanner.nextInt();
			System.out.println("Enter Company Name:");
			String companyName = scanner.next();
			System.out.println("Enter Mileage:");
			int mileage = scanner.nextInt();

			cars.add(new Car(carId, companyName, mileage));		
	}

}
}
