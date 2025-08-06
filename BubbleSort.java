package com.coding;

import java.util.Scanner;

public class BubbleSort {

	public static void bubbleSort(int[] a) {
		int n=a.length;
		 for(int i=0;i<n-1;i++) {
			 int flag=0;
			 for(int j=0;j<n-1-i;j++) {
				 if(a[j]>a[j+1]) {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
					 flag=1;
				 }
			 }
			 if(flag==0) {
				 break;
			 }
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
        
        bubbleSort(a);
        System.out.println("sorted array is:");
        for(int num:a) {
        	System.out.println(num+" ");
        }
        
	}

}
