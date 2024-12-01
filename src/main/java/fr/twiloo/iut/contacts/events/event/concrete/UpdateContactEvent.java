package fr.twiloo.iut.contacts.events.event.concrete;

import fr.twiloo.iut.contacts.events.event.Event;

public final class UpdateContactEvent extends Event {
    private String contactEmail;
    private String newEmailAddress;
    private String newPhoneNumber;
    private String newFirstname;
    private String newLastname;

    public String getContactEmail() {
        return contactEmail;
    }

    public UpdateContactEvent setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    public String getNewEmailAddress() {
        return newEmailAddress;
    }

    public UpdateContactEvent setNewEmailAddress(String newEmailAddress) {
        this.newEmailAddress = newEmailAddress;
        return this;
    }

    public String getNewPhoneNumber() {
        return newPhoneNumber;
    }

    public UpdateContactEvent setNewPhoneNumber(String newPhoneNumber) {
        this.newPhoneNumber = newPhoneNumber;
        return this;
    }

    public String getNewFirstname() {
        return newFirstname;
    }

    public UpdateContactEvent setNewFirstname(String newFirstname) {
        this.newFirstname = newFirstname;
        return this;
    }

    public String getNewLastname() {
        return newLastname;
    }

    public UpdateContactEvent setNewLastname(String newLastname) {
        this.newLastname = newLastname;
        return this;
    }
}
