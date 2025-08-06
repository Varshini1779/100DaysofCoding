package com.coding;

import java.util.Scanner;

public class QuickSort {
	public static void quickSort(int[] a, int lb, int ub) {
		if (lb < ub) {
			int loc = partition(a, lb, ub);
			quickSort(a, lb, loc - 1);
			quickSort(a, loc + 1, ub);
		}
	}

	public static int partition(int[] a, int lb, int ub){
	int pivot=a[lb];
	int start=lb;
	int end=ub;
	
	while (start<end) {
		while(start<a.length && a[start]<=pivot) {
			start++;
		}
			while(a[end]>pivot) {
				end--;
			}
				if(start<end) {
					//swap a[start] and a[end]
					int temp=a[start];
					a[start]=a[end];
					a[end]=temp;
				}
			}
			 // Swap pivot (a[lb]) with a[end]
			int temp=a[lb];
			a[lb]=a[end];
			a[end]=temp;
			return end;
		}
	
	
	
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

        quickSort(a, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
	}

}
