package fr.twiloo.iut.contacts.common.model;

public record ContactModel(String firstname, String lastname, String emailAddress, String phoneNumber) {

    @Override
    public String toString() {
        return "Prénom : " + firstname + " ; Nom :  " + lastname + " ; Addresse email : " + emailAddress + " ; Numéro de téléphone : " + phoneNumber;
    }
}
