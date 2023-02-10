package section2.step6exercises;

import java.util.List;

public class PrintSquareOfEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 115, 10, 25, 7, 9);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

}
