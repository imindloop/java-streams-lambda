package section4.Step06Exercises;

import java.time.Duration;
import java.time.Instant;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class ExploringPrimitiveBasedFunctionalInterfaces {

    // IntBinaryOperator
    // IntConsumer
    // IntFunction
    // IntPredicate
    // IntSupplier
    // IntToDoubleFunction
    // IntToLongFunction

    /**
     * We need to take into account that whenever we do operations with primitive wrappers there's a boxing and unboxing taking place
     * this may be inefficient, and for that reason is better to use primitive interfaces.
     *
     * Example:
     */

    static IntBinaryOperator intBinaryOperator = (number1, number2) -> number1 + number2;
    static BinaryOperator<Integer> integerBinaryOperator = (number1, number2) -> number1 + number2;

    public static void main(String[] args) {

        Instant start = Instant.now();
        System.out.println(intBinaryOperator.applyAsInt(5,5));
        Instant end = Instant.now();

        System.out.println("Elapsed time in primitive: " + Duration.between(start, end).toString());

        Instant start1 = Instant.now();
        System.out.println(integerBinaryOperator.apply(5,5));
        Instant end1 = Instant.now();

        System.out.println("Elapsed time in wrapper: " + Duration.between(start1, end1).toString());
    }
}
