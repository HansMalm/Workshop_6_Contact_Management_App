package Lexicon.Hans;

public class Contact {

    private String firstName;
    private String mobileNumber;

    public Contact(String name, String number) {
        this.firstName = name;
        this.mobileNumber = number;
    }

    public String getName() {
        return firstName;
    }

    public String getNumber() {
        return mobileNumber;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public void setNumber(String number) {
        this.mobileNumber = number;
    }

    @Override
    public String toString() {
        return firstName + "|" + mobileNumber;
    }
}
