package fr.twiloo.iut.contacts.common.view;

import fr.twiloo.iut.contacts.common.model.ContactModel;

public final class ContactView {
    private final ContactModel contact;

    public ContactView(ContactModel contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return contact.toString();
    }
}
