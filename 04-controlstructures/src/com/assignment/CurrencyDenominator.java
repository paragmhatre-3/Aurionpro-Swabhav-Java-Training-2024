package com.assignment;
import java.util.Scanner;

public class CurrencyDenominator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount > 50000) {
            System.out.println("Error: Amount exceeds 50,000!");
        } else if (amount % 100 != 0) {
            System.out.println("Error: Amount must be a multiple of 100.");
        } else {
            int twoThousand = 0, fiveHundred = 0, twoHundred = 0, oneHundred = 0;

            if (amount >= 2000) {
                twoThousand = amount / 2000;
                amount %= 2000;
            }
            if (amount >= 500) {
                fiveHundred = amount / 500;
                amount %= 500;
            }
            if (amount >= 200) {
                twoHundred = amount / 200;
                amount %= 200;
            }
            if (amount >= 100) {
                oneHundred = amount / 100;
                amount %= 100;
            }

            System.out.println("Denominations of the Amount you provided:");
            if (twoThousand > 0) System.out.println("Two Thousand : " + twoThousand);
            if (fiveHundred > 0) System.out.println("Five Hundred : " + fiveHundred);
            if (twoHundred > 0) System.out.println("Two Hundred : " + twoHundred);
            if (oneHundred > 0) System.out.println("One Hundred : " + oneHundred);
        }

    }

}
