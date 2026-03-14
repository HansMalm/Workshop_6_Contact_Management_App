package Lexicon.Hans;

import java.util.HashMap;
import java.util.Scanner;

public class ContactsHashMap {

    private final HashMap<String, String> contactMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addContact() {
        String inputName, inputNumber;
        boolean addContact = true;

        System.out.println("\n1. Add contact.");
        System.out.print("Enter name: ");
        inputName = scanner.next();
        System.out.print("Enter mobile: ");
        inputNumber = scanner.next();

        for (String i : contactMap.keySet()) {
            if (i.equals(inputNumber)) {
                System.out.println("Input Rejected.\nContact number " + inputNumber + " already exists!");
                addContact = false;
            }
        }
        if (addContact) {
            contactMap.put(inputNumber, inputName);
            System.out.println("New Contact " + contactToString(inputNumber, contactMap) + "\nAdded Successfully!");
        }
    }

    public void searchContact() {

        String searchName;
        boolean noMatch = true;

        System.out.print("\n2. Search by name.\nInput: ");
        searchName = scanner.next();
        for (String i : contactMap.keySet()) {
            if (contactMap.get(i).equals(searchName)) {
                System.out.println("Found Contact: " + contactToString(i, contactMap));
                noMatch = false;
            }
        }
            if (noMatch) {
                System.out.println("No matching contact found.");
            }
    }

    public void displayAllContacts() {
        System.out.println("\n3 Display All Contacts:");
        int displayCount = 1;
        for (String i : contactMap.keySet()) {
            System.out.println(displayCount + ". " + contactToString(i, contactMap));
            displayCount++;
        }
    }

    public String contactToString(String key, HashMap contacts) {
        return (contacts.get(key) + "|" + key);
    }

}
