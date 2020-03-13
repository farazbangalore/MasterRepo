package com.epsilon.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Faraz");
		names.add("Haay");
		names.add("Garmi");
		names.add("Harish");
		names.add(1, "Raju");

		System.out.println(names);

		Collections.sort(names);

		names.remove("Faraz");
		System.out.println(names);

		for (String name : names) {
			System.out.println(name);

		}
	}

}
