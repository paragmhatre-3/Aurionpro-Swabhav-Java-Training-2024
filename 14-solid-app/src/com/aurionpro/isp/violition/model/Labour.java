package com.aurionpro.isp.violition.model;

public class Labour implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Worker Has Started Working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Worker Has Stopped Working");
		
	}

	@Override
	public void eat() {
		System.out.println("Worker is Eating");

		
	}

	@Override
	public void drink() {
		System.out.println("Worker is Drinking");

		
	}

}
