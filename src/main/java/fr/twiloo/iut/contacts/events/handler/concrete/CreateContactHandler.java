package fr.twiloo.iut.contacts.events.handler.concrete;

import fr.twiloo.iut.contacts.common.model.ContactModel;
import fr.twiloo.iut.contacts.common.view.ContactView;
import fr.twiloo.iut.contacts.events.event.concrete.CreateContactEvent;
import fr.twiloo.iut.contacts.events.handler.Handler;

import static java.lang.System.out;

public final class CreateContactHandler extends Handler<CreateContactEvent> {
    @Override
    public void handle(CreateContactEvent event) {
        out.println("Création du contact : " + event.getEmailAddress());

        ContactModel contact = new ContactModel(event.getFirstname(), event.getLastname(), event.getEmailAddress(), event.getPhoneNumber());
        out.println(new ContactView(contact));
    }
}
