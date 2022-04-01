import userInfo.User;
import users.Account;
import users.Patient.MedicalProfile;
import users.Patient.Patient;
import users.Patient.PaymentInfo;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyWellnessApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("WELCOME TO MyWellness");

        System.out.println("Create Patient: ");
        System.out.println("Enter Username: ");
        String usern = userInput.next();
        System.out.println("Enter Password: ");
        String pass = userInput.next();
        userInput.nextLine();
        System.out.println("Enter Name: ");
        String name = userInput.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone = userInput.toString();
        System.out.println("Enter Email: ");
        String email = userInput.next();
        userInput.nextLine();
        System.out.println("Enter Address: ");
        String address = userInput.nextLine();
        System.out.println("Enter BirthYear: ");
        int year = userInput.nextInt();
        System.out.println("Enter BirthMonth: ");
        int month = userInput.nextInt();
        System.out.println("Enter BirthDay: ");
        int day = userInput.nextInt();
        GregorianCalendar birthdate = GregorianCalendar(year, month, day);
        userInput.nextLine();
        System.out.println("Enter Holder Name: ");
        String holder_name = userInput.nextLine();
        System.out.println("Enter Card Number");
        long card_num = userInput.nextLong();
        System.out.println("Enter CVV: ");
        int CVV = userInput.nextInt();
        System.out.println("Enter Expiration Date");
        String exp_date = userInput.next();
        System.out.println("Enter Height: ");
        int height = userInput.nextInt();
        System.out.println("Enter Weight: ");
        int weight = userInput.nextInt();
        System.out.println("Do you have Insurance(y/n)?: ");
        boolean insurance;
        if(userInput.next().equals("y")) {
            insurance = true;
        } else {
            insurance = false;
        }
        System.out.println("Enter Allergies: ");
        String allergies = userInput.next();
        System.out.println("Enter Disabilities: ");
        String disabilities = userInput.next();
        System.out.println("Enter Condition: ");
        String condition = userInput.next();
        Account acc = new Account(usern, pass);
        User user = new User(name, phone, email, address, acc);
        MedicalProfile medicalProfile = new MedicalProfile(height, weight, allergies, disabilities, condition, insurance);
        Patient patient = new Patient(name, phone, email, address, acc, birthdate, medicalProfile);
        PaymentInfo pinfo = new PaymentInfo(card_num, holder_name, CVV, exp_date,patient);
        System.out.println(pinfo.toString());

    }
}
    }
}
