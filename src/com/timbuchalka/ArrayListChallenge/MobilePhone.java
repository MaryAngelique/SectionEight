package com.timbuchalka.ArrayListChallenge;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {

        if(findContact(contact.getName()) >= 0) {

            System.out.println("Contact is already on file");
            return false;

        }

        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact) {

        return this.myContacts.indexOf(contact);

    }
}
