package section4.Step03Exercises;

import java.util.List;
import java.util.function.Predicate;

public class MethodParameterizationExample {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        /**
         * Let's suppose that we have methods where the inputs are the same, but we want to pass the lambda as a changeable parameter
         * For example if we had two almost identical methods for odd and even numbers. This will result in 2 predicates
         */

        Predicate<Integer> evenIntegerPredicate = number -> number % 2 == 0;
        Predicate<Integer> oddIntegerPredicate = number -> number % 2 != 0;

        /**
         * And a single call with a parameter indicating if we want to process odd or even numbers.
         */

        filterAndPrint(numbers, oddIntegerPredicate);
    }

    public static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }

}
