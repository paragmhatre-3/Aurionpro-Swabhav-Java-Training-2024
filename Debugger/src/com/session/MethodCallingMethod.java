package com.session;
import java.util.Scanner;
public class MethodCallingMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter first number:");
		int number1 = sc.nextInt();
		Integer number1Obj = number1;
		
		System.out.println("ENter second number:");
		int number2 =sc.nextInt();
		int result1 = addition(number1,number2);
		System.out.println(result1);

	}
	
private static int addition(int number1,int number2){
		int result = number1 + number2;
		half(result);
		return result;
		
	}
private static int half(int result) {
	return result = result/2;
	
}
	
}

