package com.aurionpro.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aurionpro.model.Computer;
import com.aurionpro.model.HardDisk;

public class ComputerTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Computer computer = context.getBean(Computer.class);
		System.out.println(computer);
	}

}
