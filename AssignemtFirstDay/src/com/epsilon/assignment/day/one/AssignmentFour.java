/*
Write a function called "sortThreeNumbers", 
which takes 3 distinct integers and prints them in ascending order.
*/

package com.epsilon.assignment.day.one;

import java.util.Arrays;

public class AssignmentFour {

	public static void sortThreeNumbers(int a, int b, int c) {
		{
			int array[] = { a, b, c };

			Arrays.sort(array);

			for (int i = 0; i < 3; i++)
				System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		sortThreeNumbers(1, 2, 3);
		sortThreeNumbers(4, 2, 20);
		sortThreeNumbers(85, 12, 36);
	}

}