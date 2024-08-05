package com.assignment;

import java.util.Scanner;

public class AtmSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println("Please choose an option:");
        int choice = sc.nextInt();
        double balance = 100000;
        double deposit;
        double withdraw;
        
        switch(choice){
        case 1:
        System.out.println("Your current balance is:"+balance);
        break;
        
        case 2: System.out.println("Enter amount to deposit:");
        deposit = sc.nextDouble();
        balance += deposit;
        System.out.println("You have deposited$"+deposit+".  Your new balance is:"+balance);
        break;
        
        case 3: System.out.println("Enter amount to withdraw:");
        withdraw = sc.nextDouble();
        balance -= withdraw;
        System.out.println("You have withdrawn$"+withdraw+".  Your new balance is:"+balance);
        break;
        
        case 4:
        System.out.println("Thankyou for using the ATM. Goodbye!");
        break;
        
        default: System.out.println("Invalid Input. Please select appropriate menu item");
        }

	}


}
