package com.dk.Service;

import java.util.List;

import com.dk.Entity.Contact;


public interface ContactService {

	public boolean saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer contactId);
	
	public boolean deleteContactById(Integer contactId);
}
