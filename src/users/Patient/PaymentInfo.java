package users.Patient;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class PaymentInfo {
    private String holderName, expiryDate;
    private int cvv, cardNumber;

    public PaymentInfo(int cardNumber, String holderName, int cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    void updatePaymentInfo() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the card number: ");
        userInput.nextLine();
        cardNumber = userInput.nextInt();

        System.out.println("Please enter the card holder name: ");
        userInput.nextLine();
        holderName = userInput.toString();

        System.out.println("Please enter the card cvv: ");
        userInput.nextLine();
        cvv = userInput.nextInt();

        System.out.println("Please enter the card expiry date: ");
        userInput.nextLine();
        expiryDate = userInput.toString();
    }
}
