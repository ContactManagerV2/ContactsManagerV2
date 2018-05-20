package contactsManager;
import java.util.ArrayList;

public class Contact {
    private String name;
    private String phoneNumber;


    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return name;
    }

    public void addPhoneNumber(String phoneNumber){

    }


    public String getPhoneNumber() {
        return phoneNumber;
    }
}
