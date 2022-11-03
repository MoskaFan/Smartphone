package de.neuefische.muc222.smartphone;

public class Friend extends Contact{

    private String telephoneNumber;

    public Friend() {
    }

    public Friend(String telephoneNumber, String name) {
        this.telephoneNumber = telephoneNumber;
        super.setNameOfContact(name);
    }

    @Override
    public String toString() {
        return "Friend: " +
                "telephoneNumber='" + telephoneNumber + ", name=" + super.getNameOfContact();
    }
}
