package com.coding;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed words: " + reversedSentence);

        sc.close();
    }
		
	public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        return reversed.trim();
		
		
	}

}
