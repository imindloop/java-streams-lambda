package section4;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExtractingPredicatesFromLambdas {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        /**
         *  Variable to hold filter predicate
         *
         *  The Predicate is a FunctionalInterface which has ONLY ONE METHOD named test()
         *  whith returns the result from the body of the lambda expression on the predicate.
         */
        Predicate<Integer> evenIntegerPredicate = number -> number % 2 == 0;

        /** Variable yo hold a function that gets a squared number
         *
         * The function is a construct that accept a parameter and produces an output.
         */
        Function<Integer, Integer> squareFunction = number -> number * number;

        /** Consumer to print
         *
         *
         */
        Consumer<Integer> printer = System.out::println;

        numbers.stream()
                .filter(evenIntegerPredicate)
                .map(squareFunction)
                .forEach(printer);
    }

}
