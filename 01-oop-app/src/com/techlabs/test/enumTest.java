package com.techlabs.test;

public class enumTest {

	enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	    public static void main(String[] args) {
	       
	        Day today = Day.WEDNESDAY;
	        System.out.println("Today is: " + today);

	        switch (today) {
	            case MONDAY:
	                System.out.println("Start of the work week.");
	                break;
	            case FRIDAY:
	                System.out.println("End of the work week.");
	                break;
	            case SATURDAY: case SUNDAY:
	                System.out.println("Weekend!");
	                break;
	            default:
	                System.out.println("Midweek days.");
	                break;
	        }

	        System.out.println("All days of the week:");
	        for (Day day : Day.values()) {
	            System.out.println(day);
	        }
	    }
}
