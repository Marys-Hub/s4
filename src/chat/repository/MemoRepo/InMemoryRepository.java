package chat.repository.MemoRepo;

import chat.model.User;
import chat.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryRepository implements UserRepository{

    private List<User> allUsers;

    public InMemoryRepository() {
        this.allUsers = new ArrayList<>();
        this.populateUsers();
    }

    public void populateUsers() {
        User user1 = new User("ion", "1234", false);
        User user2 = new User("maria", "12345", true);
        User user3 = new User("popescu", "1234", false);

        user1.addFriend(user2);
        user2.addFriend(user3);
    }

    @Override
    public void add(User user){
        //uberprufte, dass der username unique bleibt
        this.allUsers.add(user);
    }

    @Override
    public void delete(String username) {
        User user = this.findbyId(username);
        allUsers.remove(user);
    }

    @Override
    public void update(String s, User user) {

    }

    @Override
    public User findbyId(String s) {
        return null;
    }


    @Override
    public List<User> getAllfriends() {
        return null;
    }
}
