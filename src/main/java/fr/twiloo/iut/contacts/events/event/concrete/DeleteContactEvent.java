package fr.twiloo.iut.contacts.events.event.concrete;

import fr.twiloo.iut.contacts.events.event.Event;

public final class DeleteContactEvent extends Event {
    private String contactEmailAddress;

    public String getContactEmailAddress() {
        return contactEmailAddress;
    }

    public DeleteContactEvent setContactEmailAddress(String contactEmailAddress) {
        this.contactEmailAddress = contactEmailAddress;
        return this;
    }
}
