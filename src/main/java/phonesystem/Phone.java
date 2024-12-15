package phonesystem;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class Phone {
    private Map<String, String> contacts;

    public Phone() {
        contacts = new LinkedHashMap<>();
    }

    public void addContact(String phoneNumber, String name) {
        if (contacts.containsKey(phoneNumber)) {
            System.out.println("Contact already exists.");
        } else {
            contacts.put(phoneNumber, name);
            System.out.println("Contact added successfully.");
        }
    }

    public String getUserDetails(String phonenumber) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(phonenumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void existContact(String phoneNumber) {
        if (contacts.containsKey(phoneNumber)) {
            System.out.println("User exsist.");
        }
    }

    public void removeContact(String phoneNumber) {
        contacts.remove(phoneNumber);
    }

    public void displayAllContact() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in the phonebook.");
        } else {
            System.out.println("All contacts:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
            }
        }
    }
}


