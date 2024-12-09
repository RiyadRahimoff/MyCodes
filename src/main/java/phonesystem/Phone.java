package phonesystem;

import java.util.LinkedHashMap;
import java.util.Map;


public class Phone {
    private Map<String, String> contacts;

    public Phone() {
        contacts = new LinkedHashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        phoneNumber = "+994" + phoneNumber;
        if (contacts.containsKey(name)) {
            System.out.println("Contact already exists.");
        } else {
            contacts.put(name, phoneNumber);
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

    public void exsistContact(String phoneNumber) {
        if (contacts.containsKey(phoneNumber)) {
            System.out.println("User exsist.");
        }
    }

    public void removeContact(String phoneNumber) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                contacts.remove(phoneNumber, entry.getValue());
            } else {
                System.out.println("User not found.");
            }
        }

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


