package com.techlabs.model;

public class Student {
	private String name;
	private int age;
	private double percentage;
	
	public Student(String name, int age, double percentage) {
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
	
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getPercentage() {
		return percentage;
	}
	
	public void getGrade() {
		if(percentage > 75) {
			System.out.println("Grade is A");
		}else if(percentage>60 && percentage<=75) {
			System.out.println("Grade is B");
		}else if(percentage>50 && percentage<=60) {
			System.out.println("Grade is C");
		}else if(percentage>40 && percentage<=50) {
			System.out.println("Grade is D");
		}else {
			System.out.println("You Failed");
		}
	}
}
