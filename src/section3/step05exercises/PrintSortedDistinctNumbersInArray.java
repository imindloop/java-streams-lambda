package section3.step05exercises;

import java.util.List;

public class PrintSortedDistinctNumbersInArray {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(8,7,6,4,4,7,5,9,11,2,5,4,9,10);

        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
