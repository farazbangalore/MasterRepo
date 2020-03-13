package com.epsilon.assignment22.dao;

import com.epsilon.assignment22.dao.impl.ContactsDaoHashMapImpl;

public final class DaoFactory {

	private static final String discriminator = "HASHMAP";

	private DaoFactory() {
	}

	public static ContactsDao getContactsDao() throws DaoException {
		switch (discriminator.toUpperCase()) {
		case "JDBC":
			// return new ContactsDaoJdbcImpl();
			return new ContactsDaoJdbcImpl();
			break;
		case "HASHMAP":
			return new ContactsDaoHashMapImpl();
		case "CSV":
			// return new ContactsDaoCsvImpl();
			return new ContactsDaoJdbcImpl();
			break;
		case "ARRAYLIST":
			// return new ContactsDaoArrayListImpl();
			return new ContactsDaoJdbcImpl();
			break;
		}
		throw new DaoException("No implementation found for discriminator: " + discriminator);
	}
}