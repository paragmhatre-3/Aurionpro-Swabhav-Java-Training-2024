package com.techlabs.test;

import com.techlabs.model.Demo;

public class DemoTest {

	public static void main(String[] args) {
		
		Demo demo1 = new Demo();
		Demo.display();
		demo1.increment();
		Demo.display();
		
		Demo demo2 = new Demo();
		Demo.display();
		demo2.increment();
		Demo.display(); 
		
		Demo demo3 = new Demo();
		Demo.display();
		demo3.increment();
		Demo.display();
		System.out.println("=-----------------------------------=");
		
		

	}
	static{
		String[] args = {};
		DemoTest.main(args);
		
	}
	static {
		System.out.println("       *****************************             ");
	}
}
