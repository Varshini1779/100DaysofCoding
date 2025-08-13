package com.coding;

import java.util.Scanner;

public class LeetQ125 {

	public boolean isPalindrome(String s) {

		if (s == null)
			return false;

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			// Skip non-alphanumeric from the left
			while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			// Skip non-alphanumeric from the right
			while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}

			// Compare lowercase versions
			if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}

			left++;
			right--;
		}
		return true;
	}
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter string to check palindrome:");
	        String input = sc.nextLine();

	        LeetQ125 obj = new LeetQ125();
	        boolean result = obj.isPalindrome(input);

	        System.out.println("Is palindrome? " + result);
	        sc.close();
	    }
}
