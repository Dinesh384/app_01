package com.dk.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.Entity.Contact;
import com.dk.Repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repo;

	@Override
	public boolean saveContact(Contact contact) {
		contact.setActiveSw("Y");
		Contact saveObj = repo.save(contact);
		if (saveObj != null && saveObj.getContactId() != null) {
			return true;
		}

		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> findAll = repo.findAll().stream().filter(contact -> contact.getActiveSw() == "Y")
				.collect(Collectors.toList());
		return findAll;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = repo.findById(contactId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		/*
		 * boolean status = repo.existsById(contactId);
		 * 
		 * if(status) { repo.deleteById(contactId);
		 */

		Optional<Contact> optional = repo.findById(contactId);
		if (optional.isPresent()) {
			Contact contact = optional.get();
			contact.setActiveSw("N");
			repo.save(contact);

			return true;
		}

		return false;
	}

}
