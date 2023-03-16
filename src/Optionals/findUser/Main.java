//package Optionals.findUser;
//
//import java.util.HashSet;
//import java.util.Optional;
//import java.util.Set;
//
//public class Main {
//    public static void main(String[] args) {
//        Account account1 = new Account("Account1");
//        Account account2 = new Account("Account2");
//        Account account3 = new Account("Account3");
//        Set usersSet = new HashSet();
//        usersSet.add(new User("User1", account1));
//        usersSet.add(new User("User2", account2));
//        usersSet.add(new User("User3", account3));
//        System.out.println(FindUserQuiz.findUserByAccountId(usersSet, "Account1"));//return Optional user object
//        System.out.println(FindUserQuiz.findUserByAccountId(usersSet, "Account22"));//return Optional.empty
//
//
//
//        Optional<String> optional = Optional.of("Hi!");
//
//        optional.ifPresent(System.out::println);
//        optional.ifPresent().OrElse(System.out::println, () -> System.out.println("empty"));
//
//        System.out.println(optional.or(() -> Optional.of("empty")).orElse("empty"));
//        System.out.println(optional.filter(str -> str.length() > 5).orElse("empty"));
//
//    }
//}
