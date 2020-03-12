/*
Write a function called "reverseByWords", that takes a sentence (string) as an input, 
and returns another string. The return value must be a sentence in which the words 
in the original sentence appear in reverse order.
*/

package com.epsilon.assignment.day.one;

import java.util.regex.Pattern;

public class AssignmentEleven {
	public static String reverseByWords(String str) {
		Pattern pattern = Pattern.compile("\\s");

		String[] temp = pattern.split(str);
		String result = "";

		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1)
				result = temp[i] + result;
			else
				result = " " + temp[i] + result;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(reverseByWords("Welcome to geeksforgeeks"));
		System.out.println(reverseByWords("I love Java Programming"));
	}
}
