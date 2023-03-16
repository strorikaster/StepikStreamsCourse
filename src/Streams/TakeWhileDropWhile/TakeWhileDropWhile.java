package Streams.TakeWhileDropWhile;

import java.util.List;

public class TakeWhileDropWhile {
    public static void main(String[] args) {
        List<Integer> digits = List.of(1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

        System.out.println(digits.stream().takeWhile(n -> n == 1).count());
        System.out.println(digits.stream().takeWhile(n -> n < 9).count());
        System.out.println(digits.stream().dropWhile(n -> n == 1).count());
        System.out.println(digits.stream().dropWhile(n -> n > 0).count());
        System.out.println(digits.stream().dropWhile(n -> n > 9).count());
    }
}
