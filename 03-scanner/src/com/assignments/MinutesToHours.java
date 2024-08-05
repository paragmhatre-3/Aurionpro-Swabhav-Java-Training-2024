package com.assignments;
import java.util.Scanner;

public class MinutesToHours {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter minutes:");
		int total_minutes = sc.nextInt();
		
		int hours = total_minutes / 60;
		int minutes = total_minutes % 60;
		
		System.out.println("The Hour coversion looks like this:"+hours+":"+minutes);

	}

}
