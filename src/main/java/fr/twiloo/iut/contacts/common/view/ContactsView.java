package fr.twiloo.iut.contacts.common.view;

import fr.twiloo.iut.contacts.common.model.ContactModel;

import java.util.ArrayList;

public final class ContactsView {
    private final ArrayList<ContactModel> contacts;

    public ContactsView(ArrayList<ContactModel> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("--- Contacts : ---\n");
        for (int i = 0; i < contacts.size(); i++) {
            builder.append(i)
                    .append(". ")
                    .append(contacts.get(i).toString())
                    .append(" ;\n");
        }
        return builder.delete(builder.length() - 4, builder.length())
                .append(".\n")
                .toString();
    }
}
