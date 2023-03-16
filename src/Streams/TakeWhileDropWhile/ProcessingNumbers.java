package Streams.TakeWhileDropWhile;

import java.util.*;
        import java.util.stream.Collectors;
        import java.util.stream.Stream;

class ProcessingNumbers {

    public static Stream<Integer> getStream(Collection<Integer> numbers) {
        //return numbers
        // .stream()
        // .sorted()
        // .distinct()
        // .takeWhile(n -> n < 100); // write your code here

        //return numbers
        // .stream()
        // .distinct()
        // .sorted(Comparator.reverseOrder())
        // .dropWhile(i -> i >= 100)
        // .sorted();

        return numbers
                .stream()
                .distinct()
                .sorted()
                .filter(n -> n < 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String result = getStream(numbers)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
/*
Test cases
    Sample Input:

        bitcoin bitrix bytecode bingo
        bit
        Sample Output:

        bytecode*/
