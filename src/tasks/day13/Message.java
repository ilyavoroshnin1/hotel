package tasks.day13;

import java.util.Date;

public class Message {
    private User sender; // отправитель, объект класса User
    private User receiver; // получатель
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date(); // при создании объекта класса Message будет созд-ся новый объект Date, в кот. будет текущее время
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String toString() {
        return " FROM: " + this.sender + "\nTO: " + receiver +
                "\nON: " + date + "\n" + text + "\n";
    }
}
