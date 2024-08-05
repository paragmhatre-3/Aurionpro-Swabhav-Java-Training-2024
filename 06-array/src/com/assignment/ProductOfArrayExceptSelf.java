package com.assignment;

public class ProductOfArrayExceptSelf {
    
    public static int[] productExceptSelf(int[] array) {
        int number = array.length;
        if (number == 0) return new int[0];

        int[] prefixProducts = new int[number];
        int[] suffixProducts = new int[number];
        int[] prod = new int[number];

        // Fill prefixProducts
        prefixProducts[0] = 1;
        for (int i = 1; i < number; i++) {
            prefixProducts[i] = prefixProducts[i - 1] * array[i - 1];
        }

        // Fill suffixProducts
        suffixProducts[number - 1] = 1;
        for (int i = number - 2; i >= 0; i--) {
            suffixProducts[i] = suffixProducts[i + 1] * array[i + 1];
        }

        // Fill the result product array
        for (int i = 0; i < number; i++) {
            prod[i] = prefixProducts[i] * suffixProducts[i];
        }

        return prod;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 3, 4, 5};
        int[] result1 = productExceptSelf(array1);
        System.out.println(java.util.Arrays.toString(result1));  // Output: [60, 40, 30, 24]

        int[] array2 = {2, 3, 0, 5};
        int[] result2 = productExceptSelf(array2);
        System.out.println(java.util.Arrays.toString(result2));  // Output: [0, 0, 30, 0]

        int[] array3 = {0, 3, 0, 5};
        int[] result3 = productExceptSelf(array3);
        System.out.println(java.util.Arrays.toString(result3));  // Output: [0, 0, 0, 0]
    }
}
