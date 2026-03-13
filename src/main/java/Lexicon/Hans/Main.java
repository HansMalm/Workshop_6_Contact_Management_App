package Lexicon.Hans;

import java.util.Scanner;
import Lexicon.Hans.ContactsMap;

public class Main {
    static void main() {

        ContactsMap contactsMap = new ContactsMap();
        Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to Contact Management!");
        while (true) {

            System.out.println("""
                1. Add Contact
                2. Search by Name
                3. Display All Contacts
                0. End App
                """ + "\nInput: ");

            int select = scanner.nextInt();

            switch (select) {
                case 1:
                    //add method
                    break;
                case 2:
                    //search method
                    break;
                case 3:
                    //display all method
                    break;
                case 0:
                    //Exit code
            }
        }
    }
}
