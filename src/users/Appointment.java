package users;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Appointment {
    public GregorianCalendar date, time;
    public String status;

    public Appointment(GregorianCalendar date, GregorianCalendar time, String status) {
        this.date = date;
        this.time = time;
        this.status = status;
    }

    void editAppointment(int day, int month, int hour, int minute, String userStatus) {
        date = new GregorianCalendar(2022, month, day);
        time = new GregorianCalendar(2022, month, day, hour, minute);
        status = userStatus;
    }

    void cancelAppointment() {
        date = new GregorianCalendar(0, 0, 0);
        time = new GregorianCalendar(0, 0, 0, 0, 0);
        System.out.println("Appointment cancelled!");
        status = "No appointment available";
    }

    void bookAppointment(int day, int month, int hour, int minute) {
        date = new GregorianCalendar(2022, month, day);
        time = new GregorianCalendar(2022, month, day, hour, minute);
        System.out.println("Appointment booked on: \nDate: "+date.get(Calendar.DAY_OF_MONTH)+" "+date.get(Calendar.MONTH)+", "+date.get(Calendar.YEAR));
        System.out.println("Time: "+time.get(Calendar.HOUR_OF_DAY)+":"+date.get(Calendar.MINUTE));

    }
}
