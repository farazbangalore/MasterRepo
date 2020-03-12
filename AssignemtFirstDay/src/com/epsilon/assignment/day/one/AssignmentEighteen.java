package com.epsilon.assignment.day.one;

public class AssignmentEighteen {
	public static boolean isInteger(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			Integer.parseInt(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		boolean status = true;
		String isint = "";
		int sum = 0;
		String notint = "";
		int i = 0;
		int j = 0;
		while (status) {
			String input = KeyboardUtil.getString("Enter the Number: ");
			if (isInteger(input)) {
				isint += input + " ";
				int x = Integer.parseInt(input);
				sum += x;
				j++;
			} else {
				notint += input + " ";
			}

			String response = KeyboardUtil.getString("Do you wish to continue? (Yes / No): ");
			String responsel = response.toLowerCase();
			System.out.println(responsel);
			if (responsel.equals("no")) {
				status = false;
			}
			i++;
		}
		System.out.println("The number of inputs are : " + i);
		System.out.println("The number of integer inputs are : " + j);
		System.out.println("The number of non integer inputs are : " + (i - j));
		System.out.println("Sum of all the integers are : " + sum);
		System.out.println("The integer inputs are : " + isint);
		System.out.println("The non-integer inputs are : " + notint);
	}
}
