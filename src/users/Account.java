package users;

public class Account {
    private String username, password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void changePassword(String pass) {
        password = pass;
    }
    void changeUserName(String user_name) {
        username = user_name;
    }

    void Authenticate(String pass, String user_name) {
        if (username == user_name && password == pass) {
            System.out.println("Username and Password Correct!");
        } else {
            System.out.println("Username or Password is incorrect!\nPlease try again!");
        }

    }
}
