package com.epsilon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Person implements Comparable<Person> {

	private String name;
	private int age;
	private double height;

	// defines the natural ordering of two objects of this class
	@Override
	public int compareTo(Person that) {
		int c = this.name.compareTo(that.name);
		if (c == 0) {
			c = this.age - that.age;
			if (c == 0) {
				c = Double.compare(this.height, that.height);
				return c;
			}
		}
		return c;
	}

}
