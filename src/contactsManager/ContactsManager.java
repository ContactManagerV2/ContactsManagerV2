package contactsManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import util.Input;
import util.FileIO;

import static util.FileIO.createFileIfNotExists;


public class ContactsManager {
    private static String directory = "data";
    private static String filename = "contacts.txt";
    static int selection;


    public static void main(String[] args) {
        int menuSelection;
        Input input = new Input();
        String userInput;

        Contact DevilDog = new Contact("Lance");
        DevilDog.addPhoneNumber("222-111-4444");

        Contact Airborne = new Contact("Richard");
        Airborne.addPhoneNumber("888-000-8888");

        HashMap<String, Contact> contacts = new HashMap<>();

        contacts.put("JarHead", DevilDog);
        contacts.put("Grunt", Airborne);

        System.out.println("Current Contact List.\n");
        do {
            for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
                System.out.println("ID: " + entry.getKey() + "  |   " + entry.getValue().getName());
            }


            System.out.println("Please select a menu option");
            System.out.println("1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n" +
                    "Enter an option (1, 2, 3, 4 or 5):");
            menuSelection = input.getInt();

            if (menuSelection == 1) {
                for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
                    System.out.println("ID: " + entry.getKey() + "  |   ");
                }
            }


        } while ("y" == "y");
    }
}