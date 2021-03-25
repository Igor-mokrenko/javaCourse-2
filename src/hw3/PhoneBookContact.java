package hw3;

public class PhoneBookContact {
    private final String name;
    private final String phoneNumber;

    public PhoneBookContact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
