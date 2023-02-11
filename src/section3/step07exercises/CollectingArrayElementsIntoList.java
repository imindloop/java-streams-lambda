package section3.step07exercises;

import java.util.List;
import java.util.stream.Collectors;

public class CollectingArrayElementsIntoList {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<Integer> collectedNumbers = doubleList(numbers);

        System.out.println(collectedNumbers);
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }
}
