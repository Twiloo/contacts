package fr.twiloo.iut.contacts.mvc;

import fr.twiloo.iut.contacts.common.view.MenuView;

import java.util.Scanner;

import static java.lang.System.out;

public class MVCApp implements Runnable {
    @Override
    public void run() {
        while (true) {
            out.println(MenuView.MENU);
            Scanner sc = new Scanner(System.in);
            String choix = sc.nextLine();
            switch (choix) {
                case "1":

            }
        }
    }
}
