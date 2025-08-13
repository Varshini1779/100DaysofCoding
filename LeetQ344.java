package com.coding;

import java.util.Scanner;

public class LeetQ344 {
	public static void reverseString(char[] s) {
		int left = 0, right = s.length - 1;
		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String input = sc.nextLine();

//convert string to char array
		char[] s = input.toCharArray();
//reverse in-place
		LeetQ344 obj = new LeetQ344();
		obj.reverseString(s);

		System.out.println(new String(s));

	}

}
