package com.techlabs.model;

public class Student extends Person {
	private int rollNo;
	private double percentage;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", percentage=" + percentage + ", Name=" + getName()
				+ ", Address=" + getAddress() + ", Age=" + getAge() + "]";
	}
}
