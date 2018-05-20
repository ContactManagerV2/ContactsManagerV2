package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





    public class FileIO {
        private static String directory = "data";
        private static String filename = "contacts.txt";
        public static void main(String[] args) {
            createFileIfNotExists(directory,filename);
        }



        public static void createFileIfNotExists(String directory, String filename) {
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (Files.notExists(dataFile)) {
                Files.createFile(dataFile);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }


    }



        public static ArrayList<String> makeList() {
            ArrayList<String> list = new ArrayList<>();
            Input input = new Input();
            String item;

            do {
                item = input.getString("Please input the item you want to add to the list.");
                list.add(item);

            } while(input.yesNo("Do you want to add another item to the list? Press y or Yes to continue"));

            return list;
        }



}
