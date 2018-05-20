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


        String userInput;



//        HashMap<Number, Contact> contacts = new HashMap<>();



        System.out.println("Current Contact List.\n");
        contactApp();
    }

        public static void contactApp () {
            Input input = new Input();
            int menuSelection;
            HashMap<Number, Contact> contacts = new HashMap<>();

            Contact DevilDog = new Contact("Lance", "777-777-7777");
            Contact Airborne = new Contact("Richard", "888-888-8888");


            contacts.put(1, DevilDog);
            contacts.put(2, Airborne);
            do {
                for (Map.Entry<Number, Contact> entry : contacts.entrySet()) {
                    System.out.println("ID: " + entry.getKey() + "  |   " + entry.getValue().getName() + " |  "
                            + entry.getValue().getPhoneNumber());

                }
                System.out.println("\nPlease select a menu option");
                System.out.println("1. View contacts.\n" +
                        "2. Add a new contact.\n" +
                        "3. Search a contact by name.\n" +
                        "4. Delete an existing contact.\n" +
                        "5. Exit.\n" +
                        "Enter an option (1, 2, 3, 4 or 5):");

                menuSelection = input.getInt();

                if (menuSelection == 1) {
                    contactApp();
                }

                    if (menuSelection == 2) {
                    createContact();
//                        Contact Jody = new Contact("Jody", "111-111-1111");
                        contacts.put(3,createContact());
                        System.out.println(("this message"));

                    }
                    if (menuSelection == 5) {
                        System.exit(0);
                    }



            } while ("y" == "y");
        }



    private static Contact createContact() {

        Input input = new Input();
        String id;
        String name;
        String phoneNumber;

            name = input.getString("please enter a name");
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
            phoneNumber = input.getString("Please enter a phone number for " + name + ".");
            if (phoneNumber.length() == 10) {
                phoneNumber = phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);
            } else {
                System.out.println("Please Enter a 10 digit phone number");
                createContact();
            }
            Contact  newContact = new Contact(name,phoneNumber);

            System.out.println(name);


        return newContact;
    }

}