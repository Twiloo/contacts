package fr.twiloo.iut.contacts.microservices;

import java.util.Scanner;

import static java.lang.System.out;

public class MicroserviceApp implements Runnable {

    @Override
    public void run() {
        out.println("--- Choisissez le service à utiliser : ---");
        out.println("1 : UI ; 2 : Contact");
        out.println();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                out.println("Service UI sélectionné");

                break;
            case 2:
                out.println("Service contact sélectionné");

                break;
        }

    }
}
