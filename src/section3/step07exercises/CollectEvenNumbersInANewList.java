package section3.step07exercises;

import java.util.List;
import java.util.stream.Collectors;

public class CollectEvenNumbersInANewList {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,6,8,4,7,9,2);
        List<Integer> filteredNumbers;

        filteredNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredNumbers);
    }

}
