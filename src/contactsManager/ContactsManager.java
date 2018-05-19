package contactsManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import util.Input;
import util.FileIO;

import static util.FileIO.createFileIfNotExists;


public class ContactsManager {
    private static String directory = "data";
    private static String filename = "contacts.txt";
    public static void main(String[] args) {
        createFileIfNotExists(directory,filename);
        mainApp();
    }



    public static void mainApp() {
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
                }

    }
