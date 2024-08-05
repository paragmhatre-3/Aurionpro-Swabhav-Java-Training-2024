package com.assignment;
import java.util.Scanner;
public class RideHeightAndBillCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height in centimeters(cm):");
		int height = sc.nextInt();
		
		if (height >= 120) {
			System.out.println("Congratulations! You are allowed to Ride!");
			System.out.println("Please enter your age for billing purposes:");
			int age = sc.nextInt();
			int bill = 0;
			if(age<12) {
				bill = 5;
			}else if(age >= 12 & age <18) {
				bill = 7;
			}else if(age >=45 & age<=55) {
				bill = 0;
			}else {
				bill = 12;
			}
			System.out.println("Do you want photos? (Yes/No):");
			sc.nextLine();
			String choice = sc.nextLine().toLowerCase();
				if(choice.equals("yes")) {
					bill += 3;
				}
			System.out.println("Total bill is:"+bill);
		
		}else {
			System.out.println("Unfortunately you are not allowed on this Ride");
		}

	}

}
