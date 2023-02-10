package section3;

import java.util.List;

public class SumNumbersInArray {

    static int total = 0;

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);

        int result =  numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Total is: " + result);
    }


}
