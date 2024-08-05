package com.poc;

public class BitwisePoc {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		int bitAnd = a & b;
		System.out.println("The value after Bit AND:"+bitAnd);
		
		int bitLeft = a << 1;
		System.out.println("The left shift operation on a results in:"+bitLeft);
		
		int bitRight = b >> 1;
		System.out.println("The right shift operation on b results in:"+bitRight);

	}

}
