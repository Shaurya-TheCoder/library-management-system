import java.util.HashMap;

public class AuthService {
    private HashMap<String, String> credentials = new HashMap<>();
    private HashMap<String, User> users = new HashMap<>();

    public void register(User user, String password){
        users.put(user.userId, user);
        credentials.put(user.userId, password);
    }
    public User login(String userId, String pass){
        if(!users.containsKey(userId)) return null;
        if(credentials.get(userId).equals(pass)) return users.get(userId);
        return null;
    }
}
