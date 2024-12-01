package fr.twiloo.iut.contacts.events;

import fr.twiloo.iut.contacts.common.view.MenuView;
import fr.twiloo.iut.contacts.events.event.concrete.CreateContactEvent;
import fr.twiloo.iut.contacts.events.event.concrete.DeleteContactEvent;
import fr.twiloo.iut.contacts.events.event.concrete.ReadContactEvent;
import fr.twiloo.iut.contacts.events.event.concrete.UpdateContactEvent;
import fr.twiloo.iut.contacts.events.handler.concrete.CreateContactHandler;
import fr.twiloo.iut.contacts.events.handler.concrete.DeleteContactHandler;
import fr.twiloo.iut.contacts.events.handler.concrete.ReadContactHandler;
import fr.twiloo.iut.contacts.events.handler.concrete.UpdateContactHandler;

import java.util.Scanner;

import static java.lang.System.out;

public class EventsApp implements Runnable {
    @Override
    public void run() {
        CreateContactEvent createContactEvent = new CreateContactEvent();
        ReadContactEvent readContactEvent = new ReadContactEvent();
        UpdateContactEvent updateContactEvent = new UpdateContactEvent();
        DeleteContactEvent deleteContactEvent = new DeleteContactEvent();

        createContactEvent.subscribe(new CreateContactHandler());
        readContactEvent.subscribe(new ReadContactHandler());
        updateContactEvent.subscribe(new UpdateContactHandler());
        deleteContactEvent.subscribe(new DeleteContactHandler());

        while (true) {
            out.println(MenuView.MENU);
            Scanner sc = new Scanner(System.in);
            String choix = sc.nextLine();
            switch (choix) {
                case "1":
                    out.println("Informations de création :");
                    out.println("Nom :");
                    createContactEvent.setLastname(sc.nextLine());
                    out.println("Prenom :");
                    createContactEvent.setFirstname(sc.nextLine());
                    out.println("Email :");
                    createContactEvent.setEmailAddress(sc.nextLine());
                    out.println("Numéro de téléphone :");
                    createContactEvent.setPhoneNumber(sc.nextLine());
                    createContactEvent.alert();
                    break;
                case "2":
                    readContactEvent.alert();
                    break;
                case "3":
                    updateContactEvent.alert();
                    break;
                case "4":
                    deleteContactEvent.alert();
                    break;
                case "5":
                    return;
            }
        }
    }
}
