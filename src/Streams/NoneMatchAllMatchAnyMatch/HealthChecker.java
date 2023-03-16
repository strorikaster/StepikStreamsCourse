package Streams.NoneMatchAllMatchAnyMatch;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class HealthChecker {

    public static boolean checkPulseMeasurements(List<Integer> pulseMeasurements) {
        return pulseMeasurements.stream().allMatch(pm -> pm >= 90 && pm <= 150); // write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> measurements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(checkPulseMeasurements(measurements));
    }
}
/* test Cases
    Sample Input 1:

        90 93 100 107 110 105
        Sample Output 1:

        true
        Sample Input 2:

        130 135 142 147 151 144
        Sample Output 2:

        false*/
