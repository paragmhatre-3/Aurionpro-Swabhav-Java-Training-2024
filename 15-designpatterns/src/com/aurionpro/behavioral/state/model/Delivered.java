package com.aurionpro.behavioral.state.model;

public class Delivered implements IPacketState{

	@Override
	public void next(Packet packet) {
		System.out.println("This is already into Delivered State can't go any further!");
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Packet is in Delivered State!");
		
	}

	@Override
	public void previous(Packet packet) {
		System.out.println("Packet going Into Dispatched State again");
		
	}

}
