package chat.model;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private MessageStatus status;

    public Message(User sender, User receiver, String text, MessageStatus status) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.status = MessageStatus.PENDING;
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

    public MessageStatus getStatus() {
        return status;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }
}
