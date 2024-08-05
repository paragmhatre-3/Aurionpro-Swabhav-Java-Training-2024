package com.aurionpro.test;

import com.aurionpro.model.ISayable;
import com.aurionpro.model.SayableImpl;

public class SayableTest {

	public static void main(String[] args) {
		ISayable sayable = new SayableImpl();
		sayable.say();

	}

}
