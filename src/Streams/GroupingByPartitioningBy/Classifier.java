package Streams.GroupingByPartitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

//Using groupingBy
class Classifier {

    public static Map<Integer, List<String>> group(List<String> words) {
        // write your code here
        //return words.stream().collect(groupingBy(word -> word.length()));
        return words.stream().collect(groupingBy(String::length)); //or shorter
    }

    public static void main(String[] args) {
        String s = "Java stream main util int";
        List<String> words = Arrays.stream(s.split("\\s+")).toList();
        Map <Integer, List<String>> map = Classifier.group(words);
        map.forEach((i, lst) -> System.out.println(i + ":" +
                lst.stream().collect(Collectors.joining(" "))));
    }
}

    /* Test cases
"We going to group this list by length of each words"
    Java stream main util int*/
