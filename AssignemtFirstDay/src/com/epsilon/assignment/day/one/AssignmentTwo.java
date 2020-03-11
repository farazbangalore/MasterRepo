/*
Implement the body for the following function:

static boolean isPrimeNumber(int num) { 
	// do stuff here
	return false; 
}
The function should check and return true only if the number passed as argument is a prime number.

Write a Java program to call the above function multiple times with different values.
*/

package com.epsilon.assignment.day.one;
public class AssignmentTwo {

	public static int isPrimeNumber(int num) {
		int counter = 1;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
					counter++;
			}
		}
		if (counter == 2) {
			System.out.println("Given Number is Prime");
		}
		else
			System.out.println("Given Number is Not a Prime");

		return 0;
	}

	public static void main(String[] args) {
		isPrimeNumber(3);
	}
}
