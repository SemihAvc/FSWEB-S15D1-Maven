package org.example.mobile;

import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber, List<Contact> contacts) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<>();

    }
    public  boolean addNewContact(Contact contact){
        if (contact==null || contact.getName()==null || contact.getPhoneNumber()==null){
            return false;
        }
        if (findContact(contact.getName())>=0){
            return false;
        }
        this.contacts.add(contact);
        return true;
    }

    public int findContact(String name) {
        for (int i =0 ; i< contacts.size(); i++){
            Contact contact = contacts.get(i);
            if (contact.getName().equalsIgnoreCase(name)){
                return i;
            }
        }

        return -1 ;
    }
    private  int findContact(Contact contact){
        return  this.contacts.indexOf(contact);
    }
    public  boolean updateContact(Contact oldContact, Contact newContact){
        int oldContactIndex = findContact(oldContact);
        if (oldContactIndex<0){
            return false;
        }
this.contacts.set(oldContactIndex,newContact);
        return  true;
    }
    public  boolean removeContact(Contact contact){
        if (findContact(contact)<0){
            return false;

        }
        this.contacts.remove(contact);
        return  true;
    }


    public  Contact queryContact(String contactName){
        int contactIndex = findContact(contactName);
        if (contactIndex<0){
            return null;
        }
        return  this.contacts.get(contactIndex);
    }
    public  void  printContact(){
        contacts.forEach(contact -> System.out.println((contacts.indexOf(contact) + 1) + "+" + contact.getName() + "+" + contact.getPhoneNumber()));
    }

    public InsnList getMyContacts() {
        return null;
    }
}
