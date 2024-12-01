package fr.twiloo.iut.contacts.common.view;

public enum MenuView {
    MENU("--- Choisissez une option : ---\n1 : Ajouter un contact ;\n2 : Lister les contacts existants ;\n3 : Modifier un contact ;\n4 : Supprimer un contact ;\n5 : Quitter l'application.\n"),



    ;

    final private String text;

    MenuView(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
