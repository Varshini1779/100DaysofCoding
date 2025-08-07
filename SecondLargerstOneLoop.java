package com.coding;

import java.util.Scanner;

public class SecondLargerstOneLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Enter the elements of array:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int current = a[i];
			if (current > largest) {
				secondLargest = largest;
				largest = current;
			} else if (current > secondLargest && current != largest) {
				secondLargest = current;

			}
		}
		if(secondLargest==Integer.MIN_VALUE) {
			System.out.println("no second largest element found");
		}else {
			System.out.println("second largest element is "+secondLargest);
		}

	}

}
