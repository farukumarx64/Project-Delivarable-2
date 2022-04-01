package users.Patient;

import userInfo.User;

import java.util.GregorianCalendar;

public class Patient extends User {
    protected GregorianCalendar birthdate;
    public Patient(String fullName, String phoneNumber, String email, String address, GregorianCalendar birthdate) {
        super(fullName, phoneNumber, email, address);
        this.birthdate = birthdate;
    }
}
