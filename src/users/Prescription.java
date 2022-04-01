package users;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Prescription {
    public GregorianCalendar date, time;
    public String prescriptionText;

    public Prescription(String prescriptionText, GregorianCalendar date, GregorianCalendar time) {
        this.prescriptionText = prescriptionText;
        this.date = date;
        this.time = time;
    }

    void view() {
        System.out.println("The prescription text is "+prescriptionText);
        System.out.println("Appointment booked on: \nDate: "+date.get(Calendar.DAY_OF_MONTH)+" "+date.get(Calendar.MONTH)+", "+date.get(Calendar.YEAR));
        System.out.println("Time: "+time.get(Calendar.HOUR_OF_DAY)+":"+date.get(Calendar.MINUTE));
    }

}
