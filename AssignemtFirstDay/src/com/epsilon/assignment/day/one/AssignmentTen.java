/*
 Write a function called "sumOfEvensAndOdds", that takes an array of integers as 
input and returns another array of integers of length 2. The first element in the 
returned array is the sum of all even numbers in the input array, and the second 
element in the returned array is the sum of all odd numbers in the input array.
*/
package com.epsilon.assignment.day.one;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentTen {
	private static Scanner sc;

	public static void main(String[] args) {
		int size;
		sc = new Scanner(System.in);
		System.out.print(" Please Enter Number of elements in an array : ");
		size = sc.nextInt();
		int[] a = new int[size];

		System.out.print(" Please Enter " + size + " elements of an Array  : ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Even and Odd of Array is " + Arrays.toString(sumOfEvensAndOdds(a)));
	}

	public static int[] sumOfEvensAndOdds(int[] nums) {
		int i, size, EvenSum = 0, OddSum = 0;
		size = nums.length;
		for (i = 0; i < size; i++) {
			if (nums[i] % 2 == 0) {
				EvenSum = EvenSum + nums[i];
			} else {
				OddSum = OddSum + nums[i];
			}
		}
		int[] result = { EvenSum, OddSum };
		return result;
	}
}
