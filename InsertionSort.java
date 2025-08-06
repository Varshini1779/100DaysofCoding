package com.coding;

import java.util.Scanner;

public class InsertionSort {
	public static void insertionSort(int[] a) {
		int n=a.length;
		for(int i=1;i<n;i++) {
			int temp=a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        insertionSort(a);
        System.out.println("sorted array");
        for(int num:a) {
        	System.out.println(num+" ");
        }
        sc.close();
	}

}
