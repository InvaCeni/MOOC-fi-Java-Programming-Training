import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();

        Message message1 = new Message("Alice", "Hello, Bob!");
        Message message2 = new Message("Bob", "Hi, Alice! How are you?");
        Message message3 = new Message("Alice", "I'm doing well, thank you!");

        messagingService.add(message1);
        messagingService.add(message2);
        messagingService.add(message3);

        ArrayList<Message> messages = messagingService.getMessages();
        for (Message message : messages) {
            System.out.println("Sender: " + message.getSender() + ", Content: " + message.getContent());
        }
    }
}