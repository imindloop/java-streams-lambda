package section4.Step02Exercises;

import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Find functional interface behind the second argument of the reduce method, and create implementation for the Functional Interface
 *
 * int sum = numbers.stream().reduce(0, Integer::sum);
 */
public class CreateFunctionalInterface {

    /**
     * The Functional Interface is a BinaryOperator, which I found by refactoring and then introducing a variable from the second
     * operator which is: Integer::sum
     *
     *
     */
    private static BinaryOperator<Integer> sumBinaryOperator;

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,3,5,7,9);
        CreateFunctionalInterface.sumBinaryOperator = Integer::sum;
        int sum = numbers.stream().reduce(0, CreateFunctionalInterface.sumBinaryOperator);

    }

    /**
     * this is my custom implementation of the BinaryOperator Functional Interface
     */
    BinaryOperator<Integer> mySumBinaryOperatorImplementation = new BinaryOperator<Integer>() {

        @Override
        public Integer apply(Integer integer, Integer integer2) {
            return integer + integer2;
        }
    };

}
