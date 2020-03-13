package com.epsilon.assignment.day.one;

import java.util.Scanner;

@SuppressWarnings("resource")
public class AssignmentNineteen {

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
		for (int i = 0; i < spaces + 2; i++)
			System.out.print("     ");
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf(" %3d ", i);
			if (((i + spaces + 2) % 7 == 0) || (i == days[month]))
				System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		String input;
		int year = 0;
		int month = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date in YYYY-MM Format");
		input = sc.nextLine();
		if (!(input.substring(4, 5).equals("-"))) {
			throw new Exception("Invalid Date Format!");
		}
		try {
			year = Integer.parseInt(input.substring(0, 4));
			month = Integer.parseInt(input.substring(5, 7));
			printCalendar(month, year);
		} catch (Exception e) {
			System.err.println("Inavlid Input!");
		}
	}
}
