package com.epsilon.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromKeyboard {

	public static void main1(String[] args) throws IOException {
		// Keyboard is represented by System.in
		System.out.print("Enter your name: ");
		int ch;
		String name = "";
		while ((ch = System.in.read()) != '\n') {
			name += (char) ch;
		}
		System.out.println("Hello " + name);

	}

	public static void main2(String[] args) throws Exception {

		System.out.print("Enter your name: ");
		byte[] bytes = new byte[120];
		System.in.read(bytes);
		String name = new String(bytes).trim();
		System.out.println("--> " + name + " <--");
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Enter your Name: ");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		String name = in.readLine();
		System.out.println("Hello, " + name + "!");

	}

}
