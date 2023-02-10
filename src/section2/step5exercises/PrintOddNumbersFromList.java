package section2.step5exercises;

import java.util.List;

public class PrintOddNumbersFromList {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 7 , 9 , 8 , 11);

        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }


}
