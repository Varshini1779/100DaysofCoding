package com.coding;

import java.util.Scanner;

public class LeetQ167 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-indexed
            } else if (sum < target) {
                left++; // need bigger sum
            } else {
                right--; // need smaller sum
            }
        }
        return new int[]{}; // no solution case (won't happen here)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " sorted elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Find indices
        int[] result = twoSum(numbers, target);

        // Output result
        if (result.length > 0) {
            System.out.println("Indices (1-based): " + result[0] + " " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
