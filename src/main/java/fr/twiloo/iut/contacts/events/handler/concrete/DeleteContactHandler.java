package fr.twiloo.iut.contacts.events.handler.concrete;

import fr.twiloo.iut.contacts.events.event.concrete.DeleteContactEvent;
import fr.twiloo.iut.contacts.events.handler.Handler;

import static java.lang.System.out;

public final class DeleteContactHandler extends Handler<DeleteContactEvent> {
    @Override
    public void handle(DeleteContactEvent event) {
        out.println("Suppression du contact : " + event.getContactEmailAddress());
    }
}
