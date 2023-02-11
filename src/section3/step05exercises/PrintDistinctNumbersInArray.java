package section3.step05exercises;

import java.util.List;

public class PrintDistinctNumbersInArray {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,4,5,6,7,7,7,8,9);
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }




}
