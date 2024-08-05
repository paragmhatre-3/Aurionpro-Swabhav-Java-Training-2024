package com.aurionpro.ocp.violition.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;
	public FixedDeposit(int accountNumber, String name, double principal, int duration, FestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public FestivalType getFestival() {
		return festival;
	}
	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}
	private double getInterestRates(FestivalType festival) {
		if (festival.equals(FestivalType.NEWYEAR)) {
			double interestRate = 8;
			return interestRate;
		}
		if (festival.equals(FestivalType.DIWALI)) {
			double interestRate = 8.5;
			return interestRate;
		}
		if (festival.equals(FestivalType.HOLI)) {
			double interestRate = 7.5;
			return interestRate;
		}
		double interestRate = 6.5;
		return interestRate;		
	}
	public double calculateSimpleInterest(FestivalType festival){
		return principal*duration*getInterestRates(festival)/100;
	}
	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principal=" + principal
				+ ", duration=" + duration + ", festival=" + festival + ", getAccountNumber()=" + getAccountNumber()
				+ ", getName()=" + getName() + ", getPrincipal()=" + getPrincipal() + ", getDuration()=" + getDuration()
				+ ", getFestival()=" + getFestival() + "]";
	}
	
}
