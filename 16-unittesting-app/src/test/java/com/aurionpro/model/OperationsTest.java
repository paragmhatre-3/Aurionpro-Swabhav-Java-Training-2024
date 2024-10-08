package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	Operations operation;
	
	@BeforeEach
	void init() {
		Operations operation = new Operations();
	}
	@AfterEach
	void status() {
		System.out.println("Test Finished!");
	}
	
	@Test
	public void testAddition() {
		assertEquals(30,operation.addition(20, 10));
	}
	@Test
	public void testSubtraction() {
		assertEquals(10,operation.subtraction(20, 10));
	}
	@Test
	public void testMultiplication() {
		assertEquals(200,operation.multiplication(20, 10));
	}
	

}
