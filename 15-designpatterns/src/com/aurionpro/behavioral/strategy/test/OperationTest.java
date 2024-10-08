package com.aurionpro.behavioral.strategy.test;

import com.aurionpro.behavioral.strategy.model.AddOperation;
import com.aurionpro.behavioral.strategy.model.MultiplyOperation;
import com.aurionpro.behavioral.strategy.model.OperationStrategy;

public class OperationTest {

	public static void main(String[] args) {
		OperationStrategy operation1 = new OperationStrategy(new AddOperation());
		System.out.println(operation1.doOperation(10, 10));
		
		operation1.setOperation(new MultiplyOperation());
		System.out.println(operation1.doOperation(5, 2));
		
		

	}

}
