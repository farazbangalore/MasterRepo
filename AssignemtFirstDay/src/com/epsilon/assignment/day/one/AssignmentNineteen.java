package com.epsilon.assignment.day.one;

import java.util.Scanner;

@SuppressWarnings("resource")
public class AssignmentNineteen {

	static void printMonth(int year, int month) {
		printMonthTitle(year, month);
		printMonthBody(year, month);
	}

	static void printMonthTitle(int year, int month) {
		System.out.println("         " + getMonthName(month) + " " + year);
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	static String getMonthName(int month) {

		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String monthName = months[month];
		return monthName;
	}

	static void printMonthBody(int year, int month) {
		int startDay = getStartDay(year, month);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		// Pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("   0");
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			if (i < 10) {
				System.out.print("   " + i);
			} else {
				System.out.print("  " + i);
			}
			if ((i + startDay) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	static int getStartDay(int year, int month) { // Get total number of days since 1/1/1800
		int startDay1800 = 3;
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		return (totalNumberOfDays + startDay1800) % 7;
	}

	static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		for (int i = 1800; i < year; i++) // I have Taken 1800 as a starting year
			if (isLeapYear(i)) {
				total = total + 366;
			} else {
				total = total + 365;
			}
		// Adding days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++) {
			total = total + getNumberOfDaysInMonth(year, i);
		}
		return total;
	}

	static int getNumberOfDaysInMonth(int year, int month) {

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2)
			return isLeapYear(year) ? 29 : 28;

		return 0;
	}

	static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
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
			printMonth(year, month);
		} catch (Exception e) {
			System.err.println("Inavlid Input!");
		}
	}
}
