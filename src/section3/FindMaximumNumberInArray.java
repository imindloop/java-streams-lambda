package section3;

import java.util.List;

public class FindMaximumNumberInArray {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 11, 25, 7, 9, 2);

        System.out.println(numbers.stream()
                .reduce(0, Integer::max));
    }

}
