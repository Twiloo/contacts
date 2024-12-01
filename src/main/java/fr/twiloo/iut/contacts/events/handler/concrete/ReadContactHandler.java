package fr.twiloo.iut.contacts.events.handler.concrete;

import fr.twiloo.iut.contacts.events.event.concrete.ReadContactEvent;
import fr.twiloo.iut.contacts.events.handler.Handler;

import static java.lang.System.out;

public final class ReadContactHandler extends Handler<ReadContactEvent> {
    @Override
    public void handle(ReadContactEvent event) {
        out.println();

    }
}
