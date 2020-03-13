package com.epsilon.assignment22.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.epsilon.assignment22.dao.ContactsDao;
import com.epsilon.assignment22.entity.Contact;

public class ContactsDaoHashMapIpml implements ContactsDao {

	private Map<Integer, Contact> map;

	public ContactsDaoHashMapIpml() {
		map = new HashMap<>();
	}
}

// implement the methods from the ContactsDao interface
// that store/retrieve/modify the data stored in the variable 'map'
