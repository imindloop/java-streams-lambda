package section4.Step06Exercises;

import java.util.List;
import java.util.function.BiPredicate;

public class ExampleOfBiPredicateFunctionalInterface {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(2,4,9,8,6,5,9);

        BiPredicate<Integer, String> biPredicate = (number, str) -> {
          return number < 10 && str.length() > 4;
        };

        /*
            Testing it.
         */
        System.out.println(biPredicate.test(7, "Hola"));
    }



}
