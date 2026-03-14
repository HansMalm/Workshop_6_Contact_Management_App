package Lexicon.Hans;

import java.util.HashMap;
import java.util.Scanner;

public class ContactsHashMap {

    private static final HashMap<String, String> contactMap = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    //Main Menu
    public static void hashMapMenu() {
        boolean menuLoop = true;

        System.out.println("\nWelcome to Contact Management!\nHashMap version!");
        while(menuLoop) {

        System.out.print("""
                
                1. Add Contact
                2. Search by Name
                3. Display All Contacts
                0. End App
                Input:""" + " ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                addContact();
                break;
            case 2:
                searchContact();
                break;
            case 3:
                displayAllContacts();
                break;
            case 0:
                System.out.println("0. End App.");
                menuLoop = false;
        }
    }
}


    public static void addContact() {
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

    public static void searchContact() {

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

    public static void displayAllContacts() {
        System.out.println("\n3 Display All Contacts:");
        int displayCount = 1;
        for (String i : contactMap.keySet()) {
            System.out.println(displayCount + ". " + contactToString(i, contactMap));
            displayCount++;
        }
    }

    public static String contactToString(String key, HashMap contacts) {
        return (contacts.get(key) + "|" + key);
    }

}
