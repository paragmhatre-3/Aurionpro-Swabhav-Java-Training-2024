package com.assignment;
import java.util.Scanner;

public class PrimePatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numberOfRows = scanner.nextInt();

        int number = 2;
        int primesPrinted = 0;

        for (int row = 1; row <= numberOfRows; row++) {
            for (int column = 0; column < row; column++) {
                while (!isPrime(number)) {
                    number++;
                }
                System.out.print(number + " ");
                number++;
                primesPrinted++;
            }
            System.out.println();
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
