package com.epsilon.assignment22.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Contact {

	private static int idCounter;

	private int id;
	private String firstname;
	private String lastname;
	private Gender gender = Gender.MALE;
	private String email;
	private String phone;
	private String address;
	private String city = "Bangalore";
	private String state = "Karnataka";
	private Integer pincode;
	private String country = "India";
	private Date birthDate;

	public Contact() {
		this.id = ++idCounter;
	}

	public Contact(String firstname, String lastname, String email, String phone, String city) {
		this.id = ++idCounter;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}

	// add the getters and setters

}