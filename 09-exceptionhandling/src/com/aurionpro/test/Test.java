package com.aurionpro.test;

public class Test {
	public static void main(String[] args) {
		try{
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			
			double result = number1/number2;
			System.out.println("Division Is:" + result);
		}
		catch(ArithmeticException exception){
			System.out.println("Wrong Input for numbers!");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Please provide two numbers!");
		}
		catch(NumberFormatException exception) {
			System.out.println("Only Integer values are allowed");
		}
		catch(Exception exception) {
			System.out.println("Something went wrong and it Looks like this: " + exception);
		}
		finally {
			System.out.println("Inside Finally Block. Used for CLOSING ACTIVITIES");
		}
		System.out.println("Exiting Main");
	}
}

