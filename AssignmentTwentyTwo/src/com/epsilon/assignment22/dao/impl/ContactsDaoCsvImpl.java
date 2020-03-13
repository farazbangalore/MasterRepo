package com.epsilon.assignment22.dao.impl;

import java.util.Date;
import java.util.List;

import com.epsilon.assignment22.dao.ContactsDao;
import com.epsilon.assignment22.dao.DaoException;
import com.epsilon.assignment22.entity.Contact;

public class ContactsDaoCsvImpl implements ContactsDao {

	// Need to write code for Data Entry into CSV File

	@Override
	public void addContact(Contact contact) throws DaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public Contact getContact(int id) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateContact(Contact contact) throws DaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteContact(int id) throws DaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public Contact getContactByEmail(String email) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactByPhone(String phone) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getContactsByLastname(String lastname) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getContactsByCity(String city) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getContacts() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getContactsByBirthDate(Date from, Date to) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}
}

// implement the methods from the ContactsDao interface
// that store/retrieve/modify the data stored in the variable 'map'
