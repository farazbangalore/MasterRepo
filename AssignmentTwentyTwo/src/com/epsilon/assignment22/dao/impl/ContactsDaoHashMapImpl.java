package com.epsilon.assignment22.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.epsilon.assignment22.dao.ContactsDao;
import com.epsilon.assignment22.dao.DaoException;
import com.epsilon.assignment22.entity.Contact;

public class ContactsDaoHashMapImpl implements ContactsDao {

	private Map<Integer, Contact> map;

	public ContactsDaoHashMapImpl() {
		map = new HashMap<>();
	}

	@Override
	public void addContact(Contact contact) throws DaoException {
		this.map.put(contact.getId(), contact);
	}

	@Override
	public Contact getContact(int id) throws DaoException {
		return map.get(id);
	}

	@Override
	public void updateContact(Contact contact) throws DaoException {
		map.replace(contact.getId(), contact);

	}

	@Override
	public void deleteContact(int id) throws DaoException {
		map.remove(id);

	}

	@Override
	public Contact getContactByEmail(String email) throws DaoException {
		for (Contact c : map.values()) {
			if (c.getEmail().equals(email)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public Contact getContactByPhone(String phone) throws DaoException {
		for (Contact c : map.values()) {
			if (c.getPhone().equals(phone)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public List<Contact> getContactsByLastname(String lastname) throws DaoException {
		List<Contact> c1 = new ArrayList<Contact>();
		for (Contact c : map.values()) {
			if (c.getLastname().equals(lastname)) {
				c1.add(c);
			}
			return c1;
		}
		return null;
	}

	@Override
	public List<Contact> getContactsByCity(String city) throws DaoException {
		List<Contact> c1 = new ArrayList<Contact>();
		for (Contact c : map.values()) {
			if (c.getCity().equals(city)) {
				c1.add(c);
			}
			return c1;
		}
		return null;
	}

	@Override
	public List<Contact> getContacts() throws DaoException {
		List<Contact> contact = new ArrayList<Contact>();
		contact.addAll(map.values());
		return contact;
	}

	@Override
	public List<Contact> getContactsByBirthDate(Date from, Date to) throws DaoException {

		return null;
	}
}

// implement the methods from the ContactsDao interface
// that store/retrieve/modify the data stored in the variable 'map'
