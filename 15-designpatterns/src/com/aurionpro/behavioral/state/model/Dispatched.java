package com.aurionpro.behavioral.state.model;

public class Dispatched implements IPacketState{

	@Override
	public void next(Packet packet) {
		System.out.println("Packet going Into Delivered State! Hooray!!");
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Packet is currently in Dispatched State");
		
	}

	@Override
	public void previous(Packet packet) {
		System.out.println("Packet is going Into Ordered State again");
		
	}

}
