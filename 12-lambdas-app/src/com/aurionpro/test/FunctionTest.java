package com.aurionpro.test;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<Integer,Integer> squareOfNumber = (Integer number) -> (number*number);
		method(squareOfNumber);
	}
	
	private static void method (Function <Integer,Integer> squareOfNumber) {
		System.out.println(squareOfNumber.apply(5));
	}
}
