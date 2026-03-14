package Lexicon.Hans;

import java.util.HashMap;
import java.util.Scanner;

public class ContactsHashMap {

    private final HashMap<String, String> contactMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addContact() {
        String inputName, inputNumber;
        System.out.println("1. Add contact.");
        System.out.print("\nEnter name: ");
        inputName = scanner.next();
        System.out.print("Enter mobile: ");
        inputNumber = scanner.next();
        contactMap.put(inputNumber, inputName);
    }

    public void searchContact() {

        String searchName;
        boolean noMatch = true;

        System.out.print("\n2. Search by name.\nInput: ");
        searchName = scanner.next();
        for (String i : contactMap.keySet()) {
            if (contactMap.get(i).equals(searchName)) {
                System.out.println("Found Contact: " + contactMap.get(i) + "|" + i);
                noMatch = false;
            }
        }
            if (noMatch) {
                System.out.println("No matching contact found.");
            }
    }

    public void displayContacts() {
        System.out.println("\n3 Display All Contacts:");
        for (String i : contactMap.keySet()) {
            System.out.println(contactMap.get(i) + "|" + i);
        }
    }
}
