package fr.twiloo.iut.contacts.common.model;

import java.util.ArrayList;

public class ContactsModel {
    private ArrayList<ContactModel> contacts = new ArrayList<>();

    public ContactsModel() { }

    public ContactsModel(ArrayList<ContactModel> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<ContactModel> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<ContactModel> contacts) {
        this.contacts = contacts;
    }

    public void addContact(ContactModel contact) {
        contacts.add(contact);
    }

    public void removeContact(ContactModel contact) {
        contacts.remove(contact);
    }
}
