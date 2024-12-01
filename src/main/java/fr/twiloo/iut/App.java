package fr.twiloo.iut;

import fr.twiloo.iut.contacts.events.EventsApp;

public class App {

    public static void main( String[] args ) {
//        out.println("--- Choisissez l'application à utiliser : ---");
//        out.println("1 : MVC ; 2 : Microservices ; 3 : Events");
//        out.println();
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//        switch (choice) {
//            case 1:
//                out.println("Application MVC sélectionnée");
//                new MVCApp().run();
//                break;
//            case 2:
//                out.println("Application Microservices sélectionnée");
//                new MicroserviceApp().run();
//                break;
//            case 3:
//                out.println("Application Events sélectionnée");
        new EventsApp().run();
//                break;
//        }
    }

}
