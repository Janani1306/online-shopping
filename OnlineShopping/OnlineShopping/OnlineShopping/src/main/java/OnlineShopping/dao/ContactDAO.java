package OnlineShopping.dao;

import java.util.List;

import OnlineShopping.model.Contact;

public interface ContactDAO {
	
	public void addContact(Contact contact);
	
	public List<Contact> getAllContacts();

	public void deleteContact(Integer contactId);

	public Contact updateContact(Contact contact);

	public Contact getContact(int contactid);
}
