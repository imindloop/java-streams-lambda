package section3.step04exercises;

import java.util.List;

public class PrintSumOfOddNumbersInArray {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11);

        System.out.println(numbers.stream()
                .filter(number -> number % 2 != 0)
                .reduce(0, Integer::sum));
    }
}
