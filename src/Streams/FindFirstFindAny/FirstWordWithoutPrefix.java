package Streams.FindFirstFindAny;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class FirstWordWithoutPrefix {

    public static void printFirstWordWithoutPrefix(List<String> words, String prefix) {
        // write your code here
        System.out.println(
                words.stream()
                .filter(w -> !w.startsWith(prefix))
                .findFirst()
                .orElse(""));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String prefix = scanner.nextLine();

        printFirstWordWithoutPrefix(words, prefix);
    }
}

/*Test cases
    Sample Input:

        bitcoin bitrix bytecode bingo
        bit
        Sample Output:

        bytecode
*/
