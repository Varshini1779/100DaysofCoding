package com.coding;
import java.util.Scanner;
public class LinearSearch {

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
		 
		for(int i=0;i<n;i++) {
			if(a[i]==key) {
				System.out.println("element found at index:"+i);
				return;
			}
		}
	System.out.println("element not found");	

	}
	
		
	
}
