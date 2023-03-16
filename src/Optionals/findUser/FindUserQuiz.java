package Optionals.findUser;

import java.util.*;

class FindUserQuiz {

    public static Optional<User> findUserByAccountId(Set<User> users, String id) {
        // write your code here
        for(User user : users) {
            if(user.getAccount().isPresent()) {
                if(user.getAccount().get().getId().equals(id)) {
                    return Optional.of(user);
                }
            }
        }
        return Optional.empty();
    }
}

class Account {
    private final String id;

    public Account(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

class User {
    private final String login;
    private final Account account;

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
