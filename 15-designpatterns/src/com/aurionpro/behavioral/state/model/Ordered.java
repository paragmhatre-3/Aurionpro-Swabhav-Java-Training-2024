package com.aurionpro.behavioral.state.model;

public class Ordered implements IPacketState{

	@Override
	public void next(Packet packet) {
		System.out.println("Packet going Into Dispatched State! Hooray!!");
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Packet is currnently in Ordered State");
		
	}

	@Override
	public void previous(Packet packet) {
		System.out.println("This as Previous as you can get");
		
	}

}
