package fr.twiloo.iut.contacts.events.event;

import fr.twiloo.iut.contacts.events.handler.Handler;

import java.util.ArrayList;

public abstract class Event {
    protected ArrayList<Handler> handlers = new ArrayList<>();

    public void subscribe(Handler handler) {
        handlers.add(handler);
    }

    public void unsubscribe(Handler handler) {
        handlers.remove(handler);
    }

    public void alert() {
        for (Handler handler : handlers) {
            handler.handle(this);
        }
    }
}
