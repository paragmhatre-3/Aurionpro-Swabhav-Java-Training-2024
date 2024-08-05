package com.aurionpro.isp.solution.model;

public class Labour implements IWorkable, ILunchInterval{

	@Override
	public void eat() {
		System.out.println("Worker is Eating!");
		
	}

	@Override
	public void rest() {
		System.out.println("Worker is Resting!");

		
	}

	@Override
	public void start() {
		System.out.println("Worker has started working");
		
	}

	@Override
	public void stop() {
		System.out.println("Worker has stopped working");
		
	}

}
