package contactsManager;
import java.util.*;

import util.Input;


public class ContactsManager {
    private static String directory = "data";
    private static String filename = "contacts.txt";
    static int selection;

    public static void main(String[] args) {

        String userInput;

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
                    System.out.println(" Name              | Phone Number");
                    System.out.println("------------------------------------");
                for (Map.Entry<Number, Contact> entry : contacts.entrySet()) {
                    System.out.printf("\n ID: %-2d %-9s  |  %-14s",entry.getKey(),entry.getValue().getName(), entry.getValue().getPhoneNumber());

                }
                System.out.println("\n\nPlease select a menu option");
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
//                    createContact(contacts);

//                      Contact Jody = new Contact("Jody", "111-111-1111");
                        contacts.put(contacts.size()+1,createContact(contacts));

                    }
                    if (menuSelection == 5) {
                        System.exit(0);
                    }
            } while ("y" == "y");
        }

    private static Contact createContact(HashMap<Number, Contact> contacts) {

        Input input = new Input();
        String name;
        String phoneNumber;

            name = input.getString("please enter a name");
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
            phoneNumber = input.getString("Please enter a phone number for " + name + ".");
            if (phoneNumber.length() == 10) {
                phoneNumber = phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);
            } else {
                System.out.println("Please Enter a 10 digit phone number");
                createContact(contacts);
            }
            Contact  newContact = new Contact(name,phoneNumber);
            System.out.println(name + " " + phoneNumber);
            contacts.put(contacts.size()+1,newContact);
        return newContact;
    }

}