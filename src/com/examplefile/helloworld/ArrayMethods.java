package com.examplefile.helloworld;

import java.util.*;

public class ArrayMethods {
    // Can call equals(), toString() or Arrays.toString(), length(), compare(), mismatch()
    public static void main(String[] args) {
        String[] bugs = {"spider", "cricket", "ladybug"};
        String[] alias = bugs;

//        System.out.println(bugs.equals(alias)); // true confirms the two arrays point to the same object.
//        System.out.println(bugs.toString()); // Prints the hashcode.
//        System.out.println(Arrays.toString(bugs)); // Prints the actual array.

        int[] numbers = {23, 6, 15, 92, 64};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);  // Prints numbers each on separate lines.
        }
//        System.out.println(Arrays.toString(numbers)); // Prints numbers inside the array.

        // Array MUST be sorted then we can do a search.
//        System.out.println(Arrays.binarySearch(numbers, 92));  // Tells you the index position the number is located in.

        // If number not found, we negate the index number then subract 1 which is what it will return.
//        System.out.println(Arrays.binarySearch(numbers, 8)); // Prints -2.

        // compare()
        int[] numbers2 = {1, 2};
        int[] numbers3 = {1, 2};
//        System.out.println(Arrays.compare(numbers2, numbers3)); // The same so prints 0.

        int[] numbers4 = {1, 2};
        int[] numbers5 = {1};
//        System.out.println(Arrays.compare(numbers4, numbers5)); // Returns positive number since the first array has an extra element.

        int[] numbers6 = {1};
        int[] numbers7 = {1, 2};
//        System.out.println(Arrays.compare(numbers6, numbers7)); // Returns a negative number since the second array has an extra element.

        // With mismatch() if the arrays are equal, it will return -1. Or will return the first index where they differ.
//        System.out.println(Arrays.mismatch(numbers2, numbers3));
//        System.out.println(Arrays.mismatch(numbers4, numbers5));

        // Once instantiated, an array cannot change the amount of indexes it has in it.
        // Must copy it into a new array if that needs to be changed.
        int[][] twoD = new int[3][4];
        int value = 1;
        for(int i = 0; i < twoD.length; i++) {
            for(int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = value++;
            }
        }
        for(int i = 0; i < twoD.length; i++) {
            for(int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
