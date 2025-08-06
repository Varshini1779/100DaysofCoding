package com.coding;

import java.util.Scanner;

public class MergeSort {
	public static void mergeSort(int[] a, int lb, int ub) {
		if (lb < ub) {
			int mid = (lb + ub) / 2;

			mergeSort(a, lb, mid);   //sort left half
			mergeSort(a, mid + 1, ub);    //sort right half
			merge(a, lb, mid, ub);    //merge sorted 
		}
	}

	public static void merge(int[] a, int lb, int mid, int ub) {
		int i = lb;
		int j = mid + 1;
		int k = lb;

		int[] b = new int[a.length];
		while (i <= mid && j <= ub) {
			if (a[i] < a[j]) {
				b[k] = a[i];
				i++;
				k++;
			} else {
				b[k] = a[j];
				j++;
				k++;
			}
		}
		// Copy remaining elements of left half
		while (i <= mid) {
			b[k] = a[i];
			i++;
			k++;
		}
		 // Copy remaining elements of right half
		while (j <= ub) {
			b[k] = a[j];
			j++;
			k++;
		}
//copy merged elements back to original array
		for (k = lb; k <= ub; k++) {
			a[k] = b[k];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter the element");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		mergeSort(a, 0, n - 1);
		System.out.println("sorted array: ");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i] + " ");
		}

	}

}
