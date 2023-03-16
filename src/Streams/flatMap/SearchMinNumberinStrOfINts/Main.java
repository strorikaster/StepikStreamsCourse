package Streams.flatMap.SearchMinNumberinStrOfINts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int max = Stream
                .iterate(1, i -> scanner.hasNextLine(), i -> i + 1) // iterates over all input lines
                .map(i -> scanner.nextLine())
                .map(line -> line.split("\\s+"))
                .flatMap(Arrays::stream)
                .filter(string -> string.length() > 0)
                .map(Integer::parseInt)
                // some operations
                .max(Comparator.naturalOrder())
                .orElse(Integer.MIN_VALUE);
    }
}
