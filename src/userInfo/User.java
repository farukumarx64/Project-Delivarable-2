package userInfo;

import users.Account;

public class User {
    protected String fullName, email, phoneNumber, address;
    protected Account account;

    public User(String fullName, String phoneNumber, String email, String address, Account account) {
        this.fullName = fullName;
        this.phoneNumber = fullName;
        this.email = email;
        this.address = address;
        this.account = account;
    }
}
