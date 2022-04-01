package users;

import java.util.GregorianCalendar;

public class Visit {
    public GregorianCalendar date, time;
    public void visit(GregorianCalendar date, GregorianCalendar time){
        this.date = date;
        this.time = time;
    }
}
