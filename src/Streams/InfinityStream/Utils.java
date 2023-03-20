package Streams.InfinityStream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

final class Utils {

    private Utils() { }

    public static Stream<User> generateUsers(int numberOfUsers) {
        return Stream.iterate(1,  i-> i <= numberOfUsers, i -> i + 1)
                .map(user -> new User(user, "user"+ user +"@gmail.com"))
                        /*.limit(numberOfUsers)*/;// or Stream.iterate(1,  i -> i + 1) with limit
    }

    public static void main(String[] args) {
        Utils.generateUsers(3).forEach(user-> System.out.println(user.getId()+" "+user.getEmail()));

        System.out.println(Arrays.toString((new Random()).ints(5, 1, 6).toArray()));

        System.out.println(Arrays.toString(Arrays.stream(new int[] { 1, 2, 3, 4, 5 }, 1, 5).toArray()));

        System.out.println(Arrays.toString("12345".chars().toArray()));

        System.out.println(Arrays.toString(IntStream.rangeClosed(1, 5).toArray()));

        System.out.println(Arrays.toString(IntStream.of(1, 2, 3, 4, 5).toArray()));

    }
}

class User {
    private final long id;
    private final String email;

    User(long id, String email) {
        this.id = id;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}

/* test cases
1 user1@gmail.com
2 user2@gmail.com
3 user3@gmail.com
*/
