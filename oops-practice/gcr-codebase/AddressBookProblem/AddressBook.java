package AddressBookProblem;
import java.util.*;

public class AddressBook {
	 private List<Contact> contactList;
	 public AddressBook() {
	        contactList = new ArrayList<>();
	    }
	 public void addContact(Contact contact) {
		 contactList.add(contact);
		 System.out.println("contact added!");
	 }
	// Display All Contacts
	 public void displayAllContacts() {
	        if (contactList.isEmpty()) {
	            System.out.println("No contacts found.");
	            return;
	        }
	        for (Contact contact : contactList) {
	            contact.displayContact();
	        }
	 }
}
