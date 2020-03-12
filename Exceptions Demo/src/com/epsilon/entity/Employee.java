package com.epsilon.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class Employee {

	private int id;
	private String name;
	private double salary;
	private Gender gender;

	public Employee(int id, String name, double salary, Gender gender)
			throws invalidIdException, InvalidNameException, InvalidSalaryException {
		setId(id);
		setName(name);
		setSalary(salary);
		setGender(gender);
	}

	public void setId(int id) throws invalidIdException {
		if (id < 1) {
			throw new invalidIdException("Id Must be >= 1!");
		}
		this.id = id;
	}

	public void setName(String name) throws InvalidNameException {
		if (name == null || name.trim().length() == 0) {// trim removes whitespace
			throw new InvalidNameException("Name must contain 3 or more letters!");

		}
		this.name = name;
	}

	public void setSalary(double salary) throws InvalidSalaryException {
		if (salary < 20000) {
			throw new InvalidSalaryException("Salary must be >= Rs.20,000!");
		}
		this.salary = salary;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
