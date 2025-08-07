package com.coding;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = sc.nextLine();
		input = input + " ";

		String word = "", result = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch != ' ') {
				word += ch;
			} else {
				result = word + " " + result;
				word = "";
			}
		}

		System.out.println("Reversed words: " + result.trim());
	}

}
