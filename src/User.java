import java.util.Scanner;

abstract class User {
    protected String name;
    protected String userId;
    User(String name, String userId){
        this.name = name;
        this.userId = userId;
    }

    public abstract void showMenu();

    public String getUserId(){
        return userId;
    }
}
