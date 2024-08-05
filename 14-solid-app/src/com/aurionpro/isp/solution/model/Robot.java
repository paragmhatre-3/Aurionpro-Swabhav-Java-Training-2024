package com.aurionpro.isp.solution.model;

public class Robot implements IWorkable{

	@Override
	public void start() {
		System.out.println("Robo has Started WORKINGG");
		
	}

	@Override
	public void stop() {
		System.out.println("Robo has Stopped WORKINGG");
		
	}
	
}
