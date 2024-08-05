package com.aurionpro.structural.facade.model;

public class SoundSystem {
	private int volume;
	
	public void turnOn() {
		System.out.println("Sound System turned ON!");
	}
	public void turnOff() {
		System.out.println("Sound System turned OFF!!");
	}
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("Volume Set to:" + this.volume);
	}
}
