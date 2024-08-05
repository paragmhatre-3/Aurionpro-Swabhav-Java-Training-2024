package com.aurionpro.test;

import java.util.function.BiPredicate;


public class BiPredicateTest {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> greaterNumberChecker = (Integer number1, Integer number2) -> (number1 > number2);
//		if(greaterNumberChecker.test(10, 5))
//			System.out.println("The First number is greater!");
//		if(greaterNumberChecker.test(10, 5))
//			System.out.println("Second Number is greater!");
		
		System.out.println(greaterNumberChecker.test(10, 5));
	}

}
