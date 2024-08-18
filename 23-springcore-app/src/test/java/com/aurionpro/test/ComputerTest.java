package com.aurionpro.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aurionpro.model.Computer;
import com.aurionpro.model.HardDisk;

public class ComputerTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		HardDisk hardDisk = (HardDisk)context.getBean("hardDisk","HardDisk.class");
//		System.out.println(hardDisk);
		
		Computer computer = (Computer) context.getBean("computer","Computer.class");
		System.out.println(computer);
	}

}
