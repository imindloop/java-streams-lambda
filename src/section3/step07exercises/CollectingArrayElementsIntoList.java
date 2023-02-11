package section3.step07exercises;

import java.util.List;
import java.util.stream.Collectors;

public class CollectingArrayElementsIntoList {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,3,5,4,6,8,7,9);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number)
                .collect(Collectors.toList());

        System.out.println(filteredNumbers);
    }

}
