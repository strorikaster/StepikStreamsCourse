package Streams.reduce.InflationProblem;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class InflationProblem {

    public static long calculateTotalPriceInFuture(int numberOfYears, List<Grocery> groceries) {
        return groceries.stream()
                .map(grocery -> grocery.getCost() * (long)Math.pow(grocery.getTimes(), numberOfYears))
                .reduce(0L,Long::sum);// write your code here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfYears = Integer.parseInt(scanner.nextLine());

        List<Grocery> groceries = Stream.iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine())
                .map(inputLine -> {
                    String[] parts = inputLine.split("\\s+");
                    return new Grocery(Long.parseLong(parts[0]), Category.valueOf(parts[1]));
                })
                .collect(Collectors.toList());

        long totalPriceInFuture = calculateTotalPriceInFuture(numberOfYears, groceries);

        System.out.println(totalPriceInFuture);
    }
}

enum Category {
    VEGETABLES,
    FRUITS,
    DAIRY
}

class Grocery {
    private final long cost;
    private final Category category;

    // Imagine that this class has some other fields but they are skipped for simplicity

    public Grocery(long cost, Category category) {
        this.cost = cost;
        this.category = category;
    }

    public long getCost() {
        return cost;
    }

    public Category getCategory() {
        return category;
    }
    public Long getTimes() {
        long times = 0;
        //  return Long priceInNYears = initialPrice * pow(times, numberOfYears);
        switch (category) {
            case DAIRY:
                return times = 2;
            case VEGETABLES:
                return times = 3;
            case FRUITS:
                return times = 4;
        }
        return times = 1;
    }
}

/* Another Solution


import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;
        import java.util.stream.Stream;

class InflationProblem {

    public static long calculateTotalPriceInFuture(int numberOfYears, List<Grocery> groceries) {
        return groceries.stream()
                .mapToLong(grocery -> (long) (grocery.cost() * Math.pow(grocery.category().getInflate(), numberOfYears)))
                .sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfYears = Integer.parseInt(scanner.nextLine());

        List<Grocery> groceries = Stream.iterate(1, i -> scanner.hasNextLine(), i -> i + 1)
                .map(i -> scanner.nextLine())
                .map(inputLine -> {
                    String[] parts = inputLine.split("\\s+");
                    return new Grocery(Long.parseLong(parts[0]), Category.valueOf(parts[1]));
                })
                .toList();

        long totalPriceInFuture = calculateTotalPriceInFuture(numberOfYears, groceries);

        System.out.println(totalPriceInFuture);
    }
}

enum Category {
    VEGETABLES(3),
    FRUITS(4),
    DAIRY(2);

    private final int inflate;

    Category(int times) {
        this.inflate = times;
    }

    public int getInflate() {
        return inflate;
    }
}

record Grocery(long cost, Category category) {
}*/

/* Test cases




Sample Input 1:

        1
        15 VEGETABLES
        30 VEGETABLES
        10 FRUITS
        20 DAIRY
        Sample Output 1:

        215
        Sample Input 2:

        3
        10 FRUITS
        20 DAIRY
        Sample Output 2:

        800
        Sample Input 3:

        0
        15 VEGETABLES
        Sample Output 3:

        15*/
