package Lexicon.Hans;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactsMap {

    private Map<Contact, String> contactMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addContact() {
        String inputName, inputNumber;
        System.out.print("\nEnter name: ");
        inputName = scanner.next();
        System.out.print("\nEnter mobile: ");
        inputNumber = scanner.next();
        contactMap
    }

    public boolean searchContact() {
       return;
    }

    public void displayContacts() {

    }
}
