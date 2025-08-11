package com.coding;

import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Input size and elements
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size + 1]; // extra space for new element

		System.out.println("Enter " + size + " elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// Input element and index
		System.out.print("Enter element to insert: ");
		int x = sc.nextInt();
		System.out.print("Enter index to insert at: ");
		int y = sc.nextInt();

		// Shift elements to right
		for (int i = size; i > y; i--) {
			arr[i] = arr[i - 1];
		}
		arr[y] = x; // insert

		// Output result
		System.out.println("Array after insertion:");
		for (int i = 0; i <= size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
