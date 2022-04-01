package users;

import java.util.GregorianCalendar;

public class Message {
    public GregorianCalendar date, time;
    public String message;

    public Message(String message, GregorianCalendar date, GregorianCalendar time) {
        this.message = message;
        this.date = date;
        this.time = time;
    }

    void deleteMessage() {
        message = "No message available";
    }

    void editMessage(String userInput) {
        message = userInput;
    }
}
