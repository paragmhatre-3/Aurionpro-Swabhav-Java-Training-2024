package com.aurionpro.behavioral.state.model;

public interface IPacketState {
	public void next(Packet packet);
	public void current(Packet packet);
	public void previous(Packet packet);
	
}
