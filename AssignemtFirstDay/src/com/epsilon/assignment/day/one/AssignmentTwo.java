/*
Assignment 2
Implement the body for the following function:

static boolean isValidDate(int year, int month, int day) { 
	// do stuff here
	return false; 
}
The function should check if the parameter values constitute a valid calendar date or not. Accordingly return true or false.
*/

package com.epsilon.assignment.day.one;

class AssignmentTwo {
	// Set up maximum and minimum year for Dummy Encapsulation
	static int MAX_VALID_YR = 10000;
	static int MIN_VALID_YR = 1000;

	static boolean isLeap(int year) {
		// Checking if the given year is leap year or not
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}

	static boolean isValidDate(int year, int month, int day) {

		// Check for Year validation
		if (year > MAX_VALID_YR || year < MIN_VALID_YR)
			return false;

		// Check for Month Validation
		if (month < 1 || month > 12)
			return false;

		// Check for Maximum days in a month Validation
		if (day < 1 || day > 31)
			return false;

		// Get into the case of February
		if (month == 2) {
			if (isLeap(year))
				// If leap year, we have 29 Days in February
				return (day <= 29);
			else
				// It not a leap year, we have 28 days in February
				return (day <= 28);
		}

		// we have 30 Days in 4 months and 31 Days in 7 months
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return (day <= 30);

		return true;
	}

	public static void main(String args[]) {
		boolean result_1 = isValidDate(2018, 13, 1);
		boolean result_2 = isValidDate(2018, 2, 29);
		boolean result_3 = isValidDate(2016, 2, 29);
		boolean result_4 = isValidDate(1998, 4, 31);
		boolean result_5 = isValidDate(1998, 3, 31);

		// Print Results
		System.out.println("2018,13,1 is " + result_1);
		System.out.println("2018,2,29 is " + result_2);
		System.out.println("2006,2,29 is " + result_3);
		System.out.println("1998,4,31 is " + result_4);

		System.out.println("1998,3,31 is " + result_5);
		System.out.println("Added by Faraz Hussain");

		System.out.println("Added by Faraz Hussain");

	}
}