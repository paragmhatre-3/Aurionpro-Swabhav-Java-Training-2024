package com.techlabs.model;

public class Box {
	private int width;
	private int height;
	private int depth;
	
	public Box(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getDepth() {
		return depth;
	}
	
	
	
	
	public int calculateArea() {
		return width * height * depth;
		
	}
	
}
