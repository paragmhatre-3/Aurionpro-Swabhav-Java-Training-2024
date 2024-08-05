package com.poc;
public class LogicalPoc {

	public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical Operations
        boolean andResult = x && y;
        boolean orResult = x || y;
        boolean notX = !x;
        boolean notY = !y;

        // Display results
        System.out.println("x && y: " + andResult);
        System.out.println("x || y: " + orResult);
        System.out.println("!x: " + notX);
        System.out.println("!y: " + notY);
    }


}