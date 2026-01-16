package AddressBookProblem;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Address Book Program in AddressBook Main class on Master Branch");
		 AddressBook addressBook = new AddressBook();
		 int choice = 0;
	        while (choice != 2) {
	            System.out.println("\nADDRESS BOOK MENU");
	            System.out.println("1. Create New Contact");
	            System.out.println("2. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Create New Contact!");
	                    
	                    System.out.println("Enter First Name: ");
	                    String firstName = scanner.next();

	                    System.out.println("Enter Last Name: ");
	                    String lastName = scanner.next();

	                    System.out.println("Enter Address: ");
	                    String address = scanner.next();

	                    System.out.println("Enter City: ");
	                    String city = scanner.next();

	                    System.out.println("Enter State: ");
	                    String state = scanner.next();

	                    System.out.println("Enter Zip: ");
	                    String zip = scanner.next();

	                    System.out.println("Enter Phone Number: ");
	                    String phoneNumber = scanner.next();

	                    System.out.println("Enter Email: ");
	                    String email = scanner.next();

	                    Contact contact = new Contact(  firstName,lastName,address,city,state,zip,phoneNumber, email);
	                    addressBook.addContact(contact);
	                    addressBook.displayAllContacts();
	                    break;

	                case 2:
	                    System.out.println("Exiting Address Book. Goodbye!");
	                    break;

	                default:
	                    System.out.println("❌ Invalid choice. Please enter 1 or 2.");
	            }
	        }
	        addressBook.displayAllContacts();
	}

}
