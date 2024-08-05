package com.techlabs.test;

import com.techlabs.model.Base;
import com.techlabs.model.Derived1;
import com.techlabs.model.Derived2;

public class BaseTest {

	public static void main(String[] args) {
		Base base = new Base();
		Derived1 derived1 = new Derived1();
		Derived2 derived2 = new Derived2();
		
		base.display();
		derived1.display();
		derived2.display();
		
		base = derived1;
		base.display();
		
		base = derived2;
		base.display();

	}

}
