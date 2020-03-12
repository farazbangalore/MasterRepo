/*
 #14 Implement the following function:
public static void printAllCombinations(String word) {
	// do stuff here
}
The function should take a word (no spaces and special characters, only alpha numeric), 
and print all possible combinations of letters in the given word.
*/

package com.epsilon.assignment.day.one;

import java.util.Scanner;

@SuppressWarnings("resource")
public class AssignmentFourteen {

	static public void printAllCombinations(String input) {
		printAllCombinations("", input);
	}

	private static void printAllCombinations(String permutation, String input) {
		if (input.length() == 0) {
			System.out.println(permutation);

		} else {
			for (int i = 0; i < input.length(); i++) {
				printAllCombinations(permutation + input.charAt(i),
						input.substring(0, i) + input.substring(i + 1, input.length()));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word: ");
		String word = sc.nextLine();
		printAllCombinations(word);

	}
}