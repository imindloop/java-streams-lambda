package section4.step05Exercises;

import java.util.List;
import java.util.function.UnaryOperator;

public class OverviewOfUnaryOperator {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,3,5,4,8,9,6);

        /**
         * An Unary Operator receives one parameter as input and has only one output.
         */
        UnaryOperator<Integer> unaryOperator = number -> 3 * number;

        System.out.println("Testing Unary Operator with number 10 = " + unaryOperator.apply(10));

        numbers.stream()
                .map(unaryOperator)
                .forEach(System.out::println);
    }

}
