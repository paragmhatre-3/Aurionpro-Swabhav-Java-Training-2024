package com.techlabs.model;

public class RefactoredBox {
	private int width;
	private int height;
	private int depth;
	
	public RefactoredBox(int w, int h, int d) {
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
