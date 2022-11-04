package chat.model;
        import java.util.ArrayList;
        import java.util.List;
public class User {
    private String username;
    private String password;
    private boolean isOnline;
    private List<User> friends;
    private List<Message> pendingMessages;
    private List<Message> receivedMessages;
    public User(String username, String password, boolean isOnline) {
        this.username = username;
        this.password = password;
        this.isOnline = isOnline;
        this.friends = new ArrayList<>();
        this.pendingMessages = new ArrayList<>();
        this.receivedMessages = new ArrayList<>();
    }
    public void addFriend(User u) {
        this.getFriends().add(u);
        u.getFriends().add(this);
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<Message> getPendingMessages() {
        return pendingMessages;
    }

    public List<Message> getReceivedMessages() {
        return receivedMessages;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public void setPendingMessages(List<Message> sentMessages) {
        this.pendingMessages = sentMessages;
    }

    public void setReceivedMessages(List<Message> receivedMessages) {
        this.receivedMessages = receivedMessages;
    }
}