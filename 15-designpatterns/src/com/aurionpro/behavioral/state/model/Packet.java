package com.aurionpro.behavioral.state.model;

public class Packet {
	private IPacketState state;

	public Packet(IPacketState state) {
		super();
		this.state = state;
	}
	public void printStatus() {
		state.current(this);
	}
	public void gotoNextState() {
		state.next(this);
	}
	public void gotoPreviousState() {
		state.previous(this);
	}
}
