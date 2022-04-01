package users.Doctor;

import userInfo.User;
import users.Prescription;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Doctor extends User {
    protected String medicalSpecialty, region;
    protected boolean availability;
    public Doctor(String fullName, String phoneNumber, String email, String address, String medicalSpecialty, String region, boolean availability) {
        super(fullName, phoneNumber, email, address);
        this.medicalSpecialty = medicalSpecialty;
        this.availability = availability;
        this.region = region;
    }

    void postAvailability() {
        if (availability) {
            System.out.println("The doctor is available!");
        } else {
            System.out.println("The doctor is not available!\nPlease try again later");
        }
    }

    void updateAvailability(boolean update) {
        availability = update;
    }

    void generatePrescription() {
        GregorianCalendar date = new GregorianCalendar();
        String prescriptionText;
        Prescription prescription;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a prescription: ");
        prescriptionText = userInput.nextLine();
        prescription = new Prescription(prescriptionText, date, date);
    }

    int returnWaitTime() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a wait time in seconds: ");
        userInput.nextLine();
        return(userInput.nextInt());
    }
}
