package com.coding;

import java.util.Scanner;

public class DuplicateLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		char[] ch = str.toCharArray();
		System.out.print("Duplicate characters: ");
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			if (ch[i] != '0') {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
						ch[j] = '0'; // Mark as visited
					}
				}
				if (count > 1) {
					System.out.print(ch[i] + " ");
				}
			}
		}
	}

}
