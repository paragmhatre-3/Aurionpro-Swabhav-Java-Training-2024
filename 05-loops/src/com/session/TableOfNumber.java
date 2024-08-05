package com.session;
import java.util.Scanner;
public class TableOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			int product = number * i;
			System.out.println(number+" multiplied by "+i+" equals to "+product);
		}

	}

}
