package hw3;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<PhoneBookContact> contactsList = new ArrayList<>();

    public void add(String name, String phoneNumber) {
        contactsList.add(new PhoneBookContact(name, phoneNumber));
    }

    public List<PhoneBookContact> get(String name) {
        List<PhoneBookContact> availableContacts = new ArrayList<>();
        contactsList.forEach(contact -> {
            if (contact.getName().equalsIgnoreCase(name)) {
                availableContacts.add(new PhoneBookContact(contact.getName(), contact.getPhoneNumber()));
            }
        });

        if (availableContacts.size() == 0) {
            availableContacts.add(new PhoneBookContact("Нет результатов.", ""));
        }

        return availableContacts;
    }

    public void printContacts(List<PhoneBookContact> contactList) {
        contactList.forEach(contact -> {
            System.out.println(contact.getName() + " " + contact.getPhoneNumber());
        });
    }
}
