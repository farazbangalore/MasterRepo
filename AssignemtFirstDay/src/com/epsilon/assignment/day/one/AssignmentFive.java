/*
Write a function called "fibonacci", 
that takes index as paramter and returns the fibonacci number at that index.
*/

package com.epsilon.assignment.day.one;

public class AssignmentFive {

	public static int fibonacci(int index) {
		if (index <= 1)
			return index;
		return fibonacci(index - 1) + fibonacci(index - 2);
	}

	public static void main(String args[]) {
		int n = 10;
		System.out.println(fibonacci(n));
	}

}
