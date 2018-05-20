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

        Contact DevilDog = new Contact("Lance", "777-777-7777");
//        DevilDog.addPhoneNumber("222-111-4444");

        Contact Airborne = new Contact("Richard","888-888-8888");
//        Airborne.addPhoneNumber("888-000-8888");

        HashMap<Number, Contact> contacts = new HashMap<>();

        contacts.put(1, DevilDog);
        contacts.put(2, Airborne);

        System.out.println("Current Contact List.\n");
        do {
            for (Map.Entry<Number, Contact> entry : contacts.entrySet()) {
                System.out.println("ID: " + entry.getKey() + "  |   " + entry.getValue().getName() + " |  "
                + entry.getValue().getPhoneNumber());
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
                for (Map.Entry<Number, Contact> entry : contacts.entrySet()) {
                    System.out.println("ID: " + entry.getKey() + "  |   ");
                }

//                if(menuSelection == 2){
//                    createContact();
//
//                }
            }


        } while ("y" == "y");
    }

//    private static void createContact() {
//
//        Input input = new Input();
//        String id;
//        String name;
//        String phoneNumber;
//        do {
//            id = input.getString("Please enter a new ID");
//
//            name = name.substring(0,1).toUpperCase()+name.substring(1);
//            phoneNumber = input.getString("Please enter a phone number for " + name + ".");
//            if (phoneNumber.length() == 10) {
//                phoneNumber = phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);
//            } else {
//                System.out.println("Please Enter a 10 digit phone number");
//                createContact();
//            }
//            map.put
//            Contact id = new Contact(name,phoneNumber);
//            System.out.println(name);
//        } while (input.yesNo("Do you want to add another name and number"));
//        try {
//            writeListToFile(list, directory, filename);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return list;
    }

