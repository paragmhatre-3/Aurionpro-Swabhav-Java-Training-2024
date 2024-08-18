package com.aurionpro.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	
	private String name;
	
	private HardDisk hardDisk;
	
	public Computer() {
		super();
		System.out.println("Inside Computer");
	}
	@Autowired
	public Computer(@Value("Apple") String name, HardDisk hardDisk) {
		super();
		this.name = name;
		this.hardDisk = hardDisk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Inside Computer SETTER1");
	}
	public HardDisk getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
		System.out.println("Inside Computer SETTER2");
	}
	@Override
	public String toString() {
		return "Computer [name=" + name + ", hardDisk=" + hardDisk + "]";
	}
}
