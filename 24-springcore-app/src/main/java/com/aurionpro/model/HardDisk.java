package com.aurionpro.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HardDisk {
	@Value("10")
	private int capacity;

	public HardDisk() {
		super();
		System.out.println("Inside HardDisk");
	}

	public HardDisk(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
		System.out.println("Inside HardDisk SETTER");
	}

	@Override
	public String toString() {
		return "HardDisk [capacity=" + capacity + "]";
	}
	
}
