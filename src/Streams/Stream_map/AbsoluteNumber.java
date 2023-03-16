package Streams.Stream_map;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class AbsoluteNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = Arrays.stream(scanner.nextLine().split("\\s+")) // Stream<String>
                // add one or more map invocations here
                //#1
                .map(Integer::parseInt)
                .map(Math::abs)
                //.map(i -> Integer.toString(i))
                .map(String::valueOf)//instead .map(i -> Integer.toString(i))
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
