package fr.twiloo.iut.contacts.events.event.concrete;

import fr.twiloo.iut.contacts.events.event.Event;

public final class CreateContactEvent extends Event {
    private String firstname;
    private String lastname;
    private String emailAddress;
    private String phoneNumber;

    public String getFirstname() {
        return firstname;
    }

    public CreateContactEvent setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public CreateContactEvent setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public CreateContactEvent setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public CreateContactEvent setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
