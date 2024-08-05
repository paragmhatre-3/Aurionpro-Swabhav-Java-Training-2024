package com.techlabs.test;
import java.util.Scanner;

import com.techlabs.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Width, Height and Depth of the box");
		int w = sc.nextInt();
		int h = sc.nextInt();
		int d = sc.nextInt();
		Box box1 = new Box(w,h,d);
		
		System.out.println("The width of box:"+box1.getWidth());
		
		System.out.println("The height of box:"+box1.getHeight());
		
		System.out.println("The depth of box:"+box1.getDepth());
		
		System.out.println("Area:"+box1.calculateArea());
		
	}

}
