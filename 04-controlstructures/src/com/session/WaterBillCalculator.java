package com.session;
import java.util.Scanner;
public class WaterBillCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Meter_charge = 75;
		
		System.out.println("Enter the number of units consumed by you:");
		int NumberOfUnits = sc.nextInt();
		
		if(NumberOfUnits <= 100) {
			int charge = (NumberOfUnits * 5) + Meter_charge;
			System.out.println("The total bill is:" +charge);
		}
		else if(NumberOfUnits <= 250){
			int charge = (NumberOfUnits * 10) + Meter_charge;
			System.out.println("The total bill is:" +charge);
		}
		else {
			int charge = (NumberOfUnits * 20) + Meter_charge;
			System.out.println("The total bill is:" +charge);
		}

	}

}
