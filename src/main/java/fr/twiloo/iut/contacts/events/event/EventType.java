package fr.twiloo.iut.contacts.events.event;

import fr.twiloo.iut.contacts.events.event.concrete.CreateContactEvent;
import fr.twiloo.iut.contacts.events.event.concrete.DeleteContactEvent;
import fr.twiloo.iut.contacts.events.event.concrete.ReadContactEvent;
import fr.twiloo.iut.contacts.events.event.concrete.UpdateContactEvent;

public enum EventType {
    CREATE(CreateContactEvent.class),
    READ(ReadContactEvent.class),
    UPDATE(UpdateContactEvent.class),
    DELETE(DeleteContactEvent.class);

    private final Class className;

    EventType(Class className) {
        this.className = className;
    }

    public Class getClassName() {
        return className;
    }
}
