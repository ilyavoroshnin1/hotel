package tasks.day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender,receiver,text));
    }

    public static void showDialog(User user1, User user2) {
        for (Message message : messages) {
            if (message.getSender() == user1 && message.getReceiver() == user2
                || message.getSender() == user2 && message.getReceiver() == user1) {
                System.out.println(message.getSender() + " : " + message.getText());
            }
        }
    }
}
