package com.assignment;
import java.util.Random;
import java.util.Scanner;

public class PigDiceGame {
    private static final int WINNING_SCORE = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int turnCount = 0;

        while (totalScore < WINNING_SCORE) {
            turnCount++;
            System.out.println("TURN " + turnCount);
            int turnScore = 0;
            boolean turnOver = false;

            while (!turnOver) {
                System.out.print("Roll or hold? (r/h): ");
                char choice = scanner.next().charAt(0);

                if (choice == 'r') {
                    int die = random.nextInt(6) + 1;
                    System.out.println("Die: " + die);
                    if (die == 1) {
                        System.out.println("Turn over. No score.");
                        turnScore = 0;
                        turnOver = true;
                    } else {
                        turnScore += die;
                    }
                } else if (choice == 'h') {
                    totalScore += turnScore;
                    System.out.println("Score for turn: " + turnScore);
                    System.out.println("Total score: " + totalScore);
                    turnOver = true;
                } else {
                    System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
                }
            }

            System.out.println();
        }

        System.out.println("You finished in " + turnCount + " turns!");
        System.out.println("Game over!");
    }
}