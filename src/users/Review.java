package users;

import java.util.GregorianCalendar;

public class Review {
    public GregorianCalendar date, time;
    public String text;
    public void review(GregorianCalendar date,GregorianCalendar time,String text){
        this.date = date;
        this.time = time;
        this.text = text;
    }
    void editReview(GregorianCalendar userDate,GregorianCalendar userTime,String userText)
    {
        this.date = userDate;
        this.text = userText;
        this.time = userTime;
    }
    void deleteReview(GregorianCalendar userDate,GregorianCalendar userTime,String userText)
    {
        this.text = "No Reviews yet";
    }
    void viewReview(GregorianCalendar userDate,GregorianCalendar userTime,String userText)
    {
        System.out.println("Date:"+this.date+"\nTime:"+this.time+"\nText:"+this.text);
    }
}
