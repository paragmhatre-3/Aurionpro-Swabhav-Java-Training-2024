package com.aurionpro.test;

import com.aurionpro.model.IGreeting;

public class GreetingTest {

	public static void main(String[] args) {
//		IGreeting greet = new IGreeting() {
//			
//
//			@Override
//			public void say(String name) {
//				// Anonymous Class Method
//				System.out.println("HEllo " + name);
//				
//			}
//			
//		};
		
		IGreeting greet = name -> System.out.println("Hello " + name);
		
		greet.say("Anonymous");

	}

}
