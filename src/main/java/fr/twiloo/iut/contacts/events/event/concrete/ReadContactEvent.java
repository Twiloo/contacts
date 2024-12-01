package fr.twiloo.iut.contacts.events.event.concrete;

import fr.twiloo.iut.contacts.events.event.Event;

public final class ReadContactEvent extends Event {
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public ReadContactEvent setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
}
