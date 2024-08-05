package com.assignment;

public class SecondLargestElementFinder {

    public static int getSecondLargestNumber(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : array) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest element");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        System.out.println("Second largest number is: " + getSecondLargestNumber(array1));  // Output: 3

        int[] array2 = {5, 5, 5, 5};
        try {
            System.out.println("Second largest number is: " + getSecondLargestNumber(array2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Output: There is no second largest element
        }

        int[] array3 = {9, 2, 3, 6};
        System.out.println("Second largest number is: " + getSecondLargestNumber(array3));  // Output: 6
    }
}

