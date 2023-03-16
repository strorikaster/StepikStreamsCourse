package Optionals.printLoginIfPro;

import java.util.*;

class PrintLoginQuiz {

    public static void printLoginIfPro(Set<User> users, String id) {
        // write your code here
        for(User user : users) {
            if(user.getAccount().isPresent()) {
                if(user.getAccount().get().getId().equals(id)) {
                   Optional<User> us = (Optional.ofNullable(user).filter(user1 -> user.getAccount().get().getType().equals("pro")));
                    System.out.println(us.map((User::getLogin)).orElse(""));
                }
            }
        }
    }
}

class Account {
    private String id;
    private String type;

    public Account(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}

class User {
    private String login;
    private Account account;

    public User(String login, Account account) {
        this.login = login;
        this.account = account;
    }

    public String getLogin() {
        return login;
    }

    public Optional<Account> getAccount() {
        return Optional.ofNullable(account);
    }
}
