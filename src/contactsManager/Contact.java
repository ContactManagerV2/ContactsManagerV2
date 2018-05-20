package contactsManager;
import java.util.ArrayList;

public class Contact {
    private String name;
    ArrayList<String> phoneNumber = new ArrayList<>();


    public Contact(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void addPhoneNumber(String phoneNumber){
//        phoneNumber.add(phoneNumber);
    }


}
