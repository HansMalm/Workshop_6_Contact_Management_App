package Lexicon.Hans;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactsHashMap {

    private Map<String, String> contactMap = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addContact() {
        String inputName, inputNumber;
        System.out.print("\nEnter name: ");
        inputName = scanner.next();
        System.out.print("Enter mobile: ");
        inputNumber = scanner.next();
        contactMap.put(inputNumber, inputName);
    }

    public boolean searchContact() {
       return true;
    }

    public void displayContacts() {
        System.out.println("\nList of All Contacts:");
        for (String i : contactMap.keySet()) {
            System.out.println(i + "|" + contactMap.get(i));
        }
    }
}
