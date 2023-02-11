package section3.step04exercises;

import java.util.List;

public class PrintSumOfSquaresInSquareList {

    /**
     * This should return:
     * 3 * 3 + 4 * 4 + 5 * 5 + 6 * 6
     * 9 + 16 + 25 + 36 = 86
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,4,5,6);

        int result = numbers.stream()
                .map(number -> number * number)
                .reduce(0, Integer::sum);

        System.out.println(result);

    }

}
