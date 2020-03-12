package com.epsilon.assignment.day.one;

import java.util.Scanner;

@SuppressWarnings("resource") // Resource leak warning is supressed
public class KeyboardUtil {

	private KeyboardUtil() {

	}

	public static String getString(String message) {
		System.out.print(message);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();

	}

	public static int getInt(String message) {
		System.out.print(message);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	public static Double getDouble(String message) {
		System.out.print(message);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextDouble();
	}

}
