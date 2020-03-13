package com.epsilon.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.epsilon.entity.Person;

public class SortPersons {

	public static void main(String[] args) {
		List<Person> people = new ArrayList();

		people.add(new Person("Faraz", 45, 6.8));
		people.add(new Person("Faraz", 54, 5.6));
		people.add(new Person("Faraz", 65, 5.8));
		people.add(new Person("Faraz", 12, 4.9));
		people.add(new Person("Faraz", 02, 8.6));
		System.out.println("Before Sort:");
		print(people);
		Collections.sort(people);// sort by natural order
		System.out.println("After Sort:");
		print(people);

//		Comparator<Person> cmp = new Comparator<Person>() {
//			// Curly bracket is a anonymous class
//			@Override
//			public int compare(Person p1, Person p2) {
//				return Double.compare(p1.getHeight(), p2.getHeight());// Interchange p1 and p2 for descending order
//			}
//		};

		Collections.sort(people, (p1, p2) -> Double.compare(p1.getHeight(), p2.getHeight()));

		System.out.println("After Sorting Height:");

		print(people);
	}

	private static void print(List<Person> people) {

		for (Person p : people) {
			System.out.println(p);
		}

	}
}
