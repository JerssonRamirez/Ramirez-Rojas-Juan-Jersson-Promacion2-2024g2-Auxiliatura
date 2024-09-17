import java.io.*;
import java.util.HashMap;

public class AddressBook implements Serializable {
    private static final long serialVersionUID = 1L;
    private HashMap<String, Contact> contacts;

    public AddressBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getEmail())) {
            System.out.println("A contact with this email already exists.");
        } else {
            contacts.put(contact.getEmail(), contact);
            System.out.println("Contact added successfully.");
            storeContacts(); // <-----------------------------------------------------Agregado
        }
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("The address book is empty.");
            return;
        }
        for (Contact contact : this.contacts.values()) {
            System.out.println(contact.toString());
        }
    }

    public void searchContact(String email) {
        if (contacts.containsKey(email)) {
            System.out.println(contacts.get(email));
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(String email) {
        if (contacts.containsKey(email)) {
            contacts.remove(email);
            System.out.println("Contact deleted.");
            storeContacts(); // <-----------------------------------------------------Agregado
        } else {
            System.out.println("No contact found with the provided email.");
        }
    }

    public void storeContacts() { // <-------------------------------------------------Agregado
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contacts.ser"))) {
            oos.writeObject(contacts);
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }

    public void loadContacts() { // <--------------------------------------------------Agregado
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contacts.ser"))) {
            contacts = (HashMap<String, Contact>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading contacts: " + e.getMessage());
        }
    }
}