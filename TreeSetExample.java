package collectionExample;

import java.util.TreeSet;
class Contact implements Comparable<Contact> {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Contact other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " - " + phoneNumber;
    }
}
public class TreeSetExample {
	
	    public static void main(String[] args) {
	        // Create a TreeSet to store contacts (sorted by name)
	        TreeSet<Contact> contactList = new TreeSet<>();

	        // Add contacts to the list
	        //contactList.add("shilpa","78986");
	        contactList.add(new Contact("Alice", "123-456-7890"));
	        contactList.add(new Contact("Bob", "987-654-3210"));
	        contactList.add(new Contact("Eve", "555-123-4567"));
	        contactList.add(new Contact("David", "111-222-3333"));

	        // Attempt to add a duplicate contact
	        boolean isAdded = contactList.add(new Contact("Alice", "999-888-7777"));

	        if (isAdded) {
	            System.out.println("Contact Alice added successfully.");
	        } else {
	            System.out.println("Contact Alice is already in the list.");
	        }

	        // Print the sorted list of contacts
	        System.out.println("Contact List (Sorted by Name):");
	        for (Contact contact : contactList) {
	            System.out.println(contact);
	        }
	    }
}

