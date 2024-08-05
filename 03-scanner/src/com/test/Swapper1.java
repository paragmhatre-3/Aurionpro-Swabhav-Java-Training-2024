package com.test;

public class Swapper1 {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("The swapped numbers are:"+number1+" & "+number2);

	}

}
