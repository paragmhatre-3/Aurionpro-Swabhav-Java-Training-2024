package com.assignment;
import java.util.Scanner;
public class TreasureHuntGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome! Welcome! Welcome!... To the TREASURE ISLAND! Your Mision is to find the Treasure!!!");
		System.out.println("Make a choice: LEFT OR... RIGHT.");
		String choice1 = sc.nextLine().toLowerCase();
		
		if(choice1.equals("left")) {
			System.out.println("Make a Choice: SWIM OR... WAIT.");
			String choice2 = sc.nextLine().toLowerCase();
			
			if(choice2.equals("wait")) {
				System.out.println("Which DOOR? RED... BLUE... or YELLOW...");
				String choice3 = sc.nextLine().toLowerCase();
				
				if(choice3.equals("yellow")) {
					System.out.println("You WIN!!!!!!!!!!");
				}else if(choice3.equals("red")) {
					System.out.println("Burned by FIRE!!! GAME OVER");
				}else if(choice3.equals("blue")) {
					System.out.println("Eaten by Beasts. GAME OVER");
				}else {
					System.out.println("GAME OVER");
				}
			}else {
				System.out.println("Attacked by TROUT. GAME OVER");
			}
		}else {
			System.out.println("Fall into a hole! GAME OVER");
		}
		
		
		

	}

}
