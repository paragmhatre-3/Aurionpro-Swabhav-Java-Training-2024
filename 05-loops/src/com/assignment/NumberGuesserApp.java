package com.assignment;
import java.util.Random;
import java.util.Scanner;

public class NumberGuesserApp {
    static int maxAttempt = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            playGame(sc);
            System.out.print("Do you want to play the game again? (yes/no): ");
            String response = sc.next();
            playAgain = response.equalsIgnoreCase("yes");
        }
    }

    private static void playGame(Scanner sc) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("Random number generated.");

        while (attempts < maxAttempt && !hasWon) {
            System.out.print("Guess a number: ");
            int guess = sc.nextInt();
            attempts++;

            if(guess == randomNumber) {
                hasWon = true;
                System.out.println("You won in attempt: " + attempts);
            }
        }

        if (hasWon != true) {
            System.out.println("You've used all attempts. The correct number was: " + randomNumber);
        }
    }
}
