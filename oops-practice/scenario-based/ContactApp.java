package scenarioBased;

import java.util.ArrayList;
import java.util.Scanner;
class InvalidPhoneException extends Exception {
    InvalidPhoneException(String msg) {
        super(msg);
    }
}

class Contact {
    String name;
    String phone;

    Contact(String n, String p) {
        name = n;
        phone = p;
    }
}
 public class ContactApp {

    ArrayList<Contact> list = new ArrayList<>();

    void checkPhone(String p) throws InvalidPhoneException {
        if (!p.matches("\\d{10}")) {
            throw new InvalidPhoneException("Phone must be 10 digits");
        }
    }

    void add(String n, String p) throws InvalidPhoneException {
        checkPhone(p);

        for (Contact c : list) {
            if (c.phone.equals(p)) {
                System.out.println("Duplicate contact");
                return;
            }
        }
        list.add(new Contact(n, p));
        System.out.println("Contact added");
    }

    void del(String p) {
        for (Contact c : list) {
            if (c.phone.equals(p)) {
                list.remove(c);
                System.out.println("Contact deleted");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    void find(String p) {
        for (Contact c : list) {
            if (c.phone.equals(p)) {
                System.out.println("Name: " + c.name + ", Phone: " + c.phone);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContactApp app = new ContactApp();

        while (true) {
            System.out.println("\n1.Add 2.Delete 3.Search 4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            try {
                if (ch == 1) {
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    System.out.print("Phone: ");
                    String p = sc.nextLine();
                    app.add(n, p);
                } 
                else if (ch == 2) {
                    System.out.print("Phone: ");
                    String p = sc.nextLine();
                    app.del(p);
                } 
                else if (ch == 3) {
                    System.out.print("Phone: ");
                    String p = sc.nextLine();
                    app.find(p);
                } 
                else if (ch == 4) {
                    System.out.println("Bye");
                    break;
                } 
                else {
                    System.out.println("Invalid choice");
                }
            } catch (InvalidPhoneException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

