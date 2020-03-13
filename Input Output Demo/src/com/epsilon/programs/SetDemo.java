package com.epsilon.programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.epsilon.entity.Person;

public class SetDemo {

	public static void main(String[] args) {
		Set<Person> poeple = new TreeSet<>();

		poeple.add(new Person("Faraz", 45, 6.8));
		poeple.add(new Person("Faraz", 54, 5.6));
		poeple.add(new Person("Faraz", 65, 5.8));
		poeple.add(new Person("Faraz", 12, 4.9));
		poeple.add(new Person("Faraz", 02, 8.6));

		for (Person p : poeple) {
			System.out.println(p);

		}

		Set<Integer> nums = new LinkedHashSet<>();
		nums.add(12);// auto boxing
		nums.add(12);
		nums.add(5);
		nums.add(22);
		// sets does not allow duplication
		System.out.println("nums.size =" + nums.size());
		System.out.println(nums);

		Set<String> names = new HashSet<String>();
		names.add("Faraz");

		names.add("Faraz");

		names.add("Faraz");

		names.add("Faraz");

		names.add("Faraz");

		names.add("Faraz");

		names.add("Faraz");

		System.out.println(names);

	}

}
