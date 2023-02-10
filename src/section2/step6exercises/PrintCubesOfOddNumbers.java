package section2.step6exercises;

import java.util.List;

public class PrintCubesOfOddNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(3, 17, 25, 13, 8, 9, 5);

        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> Math.pow(number, 3))
                .forEach(System.out::println);
    }

}
