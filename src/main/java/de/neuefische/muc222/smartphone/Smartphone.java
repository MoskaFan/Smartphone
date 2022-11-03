package de.neuefische.muc222.smartphone;

import java.util.List;

public class Smartphone implements Radio, GPS{

    private String modell;
    private String nameOfManufacturer;
    private List<Contact> contactList;

    public Smartphone() {
    }

    public Smartphone(String modell, String nameOfManufacturer, List<Contact> contactList) {
        this.modell = modell;
        this.nameOfManufacturer = nameOfManufacturer;
        this.contactList = contactList;
    }
    public boolean addContact(Contact contact){
        return this.contactList.add(contact);
    }

    public Contact getContact(int index){
        return this.contactList.get(index);
    }
    public Contact getContactByName(String name){

        for (Contact item : contactList) {

            if(item.getNameOfContact().toLowerCase().equals(name)){
                return item;
            }

        }
        return null;

    }
    public boolean removeContactByName(String name){

        for (Contact item : contactList) {

            if(item.getNameOfContact().toLowerCase().equals(name)){
                contactList.remove(item);
            }

        }
        return false;

    }

    @Override
    public String getPosition() {
        return "Koeln";


    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;

    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;

    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modell='" + modell + '\'' +
                ", nameOfManufacturer='" + nameOfManufacturer + '\'' +
                ", contactList=" + contactList +
                '}';
    }
}
