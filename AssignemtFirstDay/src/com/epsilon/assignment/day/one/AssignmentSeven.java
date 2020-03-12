/*
Write a Java program to print the following pattern:

*
**
***
****
*****
The number of rows should be based on the value of a variable "num",
and the number of stars in a row is based on the row number itself.
*/

package com.epsilon.assignment.day.one;

public class AssignmentSeven {

	public static void printPattern(int num) {
		int k = 0;
		for (int i = 1; i <= num; ++i, k = 0) {
			for (int space = 1; space <= num - i; ++space) {
				System.out.print("  ");
			}

			while (k != 2 * i - 1) {
				System.out.print("* ");
				++k;
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPattern(5);
	}
}
