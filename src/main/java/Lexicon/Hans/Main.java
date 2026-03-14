package Lexicon.Hans;

import java.util.Scanner;
import Lexicon.Hans.ContactsHashMap;

public class Main {
    static void main() {

        ContactsHashMap contacts = new ContactsHashMap();
        Scanner scanner = new Scanner(System.in);
        boolean mainLoop = true;

            System.out.println("\nWelcome to Contact Management!");
        while (mainLoop) {

            System.out.print("""
                \n1. Add Contact
                2. Search by Name
                3. Display All Contacts
                0. End App
                Input:""" + " ");

            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    contacts.addContact();
                    break;
                case 2:
                    contacts.searchContact();
                    break;
                case 3:
                    contacts.displayContacts();
                    break;
                case 0:
                    System.out.println("0. End App.");
                    mainLoop = false;
            }
        }
    }
}
