package com.coding;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int[] a= new int[n];
			System.out.println("enter the elements into array");
			for( int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
				System.out.println("enter the element to search");
				int key=sc.nextInt();
				
				//binary search logic
				int left=0;
				int right=n-1;
				
				while(left<=right) {
					int mid=(left+right)/2;
					
					if(a[mid]==key) {
						System.out.println("element fount at index"+mid);
						return;
					}else if(key<a[mid]) {
						right=mid-1;
					}else {
						left=mid+1;
					}
					
				}
		System.out.println("Element not found");
		
	}

}
