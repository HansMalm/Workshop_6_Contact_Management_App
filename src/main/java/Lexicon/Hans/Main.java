package Lexicon.Hans;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean mainLoop = true;

        while (mainLoop) {
            System.out.print("""
                    
                    1. Load ArrayList Contacts App.
                    2. Load HashMap Contacts App.
                    0. Exit.
                    Input:""" + " ");
            int menuSelect = scanner.nextInt();

            switch (menuSelect) {
                case 1:
                    System.out.println("Not implemented yet");
                    break;
                case 2:
                    ContactsHashMap.hashMapMenu();
                    break;
                case 0:
                    System.out.println("Exit.");
                    mainLoop = false;
            }
        }
    }
}
