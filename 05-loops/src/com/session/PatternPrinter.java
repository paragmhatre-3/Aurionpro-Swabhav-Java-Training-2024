package com.session;

public class PatternPrinter {

	public static void main(String[] args) {
		int number = 0;
		int k = 2;
		int sum = 0;
		
		while(k < number) {
			if(number % k == 0) {
				sum += k;
		}k++;
		}
		
		if(sum == 0) {
			System.out.println("The number is Prime!");
		}else {
			System.out.println("It is not Prime");
		}
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++){
				System.out.print("* ");
			}System.out.println(" ");
			
		}

	}

}
