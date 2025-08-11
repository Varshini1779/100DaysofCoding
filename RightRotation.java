package com.coding;
import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations: ");
        int n = sc.nextInt();
        n = n % arr.length; // To handle rotations greater than size

        for (int r = 0; r < n; r++) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }

        System.out.println("Array after right rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
