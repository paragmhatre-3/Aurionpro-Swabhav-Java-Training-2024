package com.session;
import java.util.Scanner;

public class WaterBillCalculatorv2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Meter_charge = 75;
		
		System.out.println("Enter the number of units consumed by you:");
		int NumberOfUnits = sc.nextInt();
		
		if(NumberOfUnits <= 250) {
			
			int NumberOfUnits_above250 = NumberOfUnits -250;
			int charge = NumberOfUnits_above250 * 20;
		}
		else if(NumberOfUnits <= 250){
			int NumberOfUnits_above250 = NumberOfUnits -250;
			int charge = NumberOfUnits_above250 * 20;
		}
		else {
			int charge = (NumberOfUnits * 20) + Meter_charge;
			System.out.println("The total bill is:" +charge);
		}
	}

}
