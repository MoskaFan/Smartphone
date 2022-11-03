package org.example;

import de.neuefische.muc222.smartphone.Contact;
import de.neuefische.muc222.smartphone.Friend;
import de.neuefische.muc222.smartphone.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contact friend1 = new Friend("8213265", "Peter");
        Contact friend2 = new Friend("8213265", "Hans");

        List<Contact> contactList = new ArrayList<>();
        contactList.add(friend1);
        contactList.add(friend2);

        Smartphone smartphone = new Smartphone("Apple", "Iphone", contactList);
        System.out.println(smartphone);

    }
}