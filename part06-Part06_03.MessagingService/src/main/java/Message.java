
import java.util.Objects;

public class Message {

    private final String sender;
    private final String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public String toString() {
        return this.sender + ": " + this.content;
    }

    // created using the "insert code" feature of NetBeans
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        if (!Objects.equals(this.sender, other.sender)) {
            return false;
        }
        return Objects.equals(this.content, other.content);
    }

}
