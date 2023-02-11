package section3.step04exercises;

import java.util.List;

public class PrintSumOfCubesInCubesList {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 5, 7, 9);

        numbers.stream()
                .map(number ->  Math.round(Math.pow(number, 3)))
                .forEach(System.out::println);
    }
}
