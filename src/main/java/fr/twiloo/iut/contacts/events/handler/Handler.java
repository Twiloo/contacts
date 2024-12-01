package fr.twiloo.iut.contacts.events.handler;

import fr.twiloo.iut.contacts.events.event.Event;

public abstract class Handler<T extends Event> {
    public abstract void handle(T event);
}
