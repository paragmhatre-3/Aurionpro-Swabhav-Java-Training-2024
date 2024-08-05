package com.aurionpro.structural.facade.model;

public class HomeTheatre {
	
	DvdPlayer dvdPlayer = new DvdPlayer();
	Projector projector = new Projector();
	SoundSystem soundSystem = new SoundSystem();
	public void movieTime(int volume) {
		
		dvdPlayer.turnOn();
		projector.turnOn();
		soundSystem.turnOn();
		soundSystem.setVolume(volume);
		
	}
	public void sleepyTime() {
		dvdPlayer.turnOff();
		projector.turnOff();
		soundSystem.turnOff();
	}
}
