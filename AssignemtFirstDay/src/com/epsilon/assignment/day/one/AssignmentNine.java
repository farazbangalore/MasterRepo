/*
Implement the Java function listed below:

public static void printCalendar(int month, int year) {
	/// do stuff here
}
*/
package com.epsilon.assignment.day.one;

public class AssignmentNine {

	public static void printCalendar(int month, int year) {
		int spaces = 1;
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && month == 2)
			days[month] = 29;

		System.out.println("          " + months[month] + " " + year);

		System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");

		spaces = (days[month - 1] + spaces) % 7;

		for (int i = 0; i < spaces; i++)
			System.out.print("     ");
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf(" %3d ", i);
			if (((i + spaces) % 7 == 0) || (i == days[month]))
				System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printCalendar(8, 2018);
		printCalendar(3, 2020);
	}
}
