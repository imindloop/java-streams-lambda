package section4.Step06Exercises;

import java.util.List;
import java.util.function.BiFunction;

public class ExampleOfBiFunctionFunctionalInterface {

    /**
     * A BiFunction accepts two arguments and returns one result.
     */
    static BiFunction<Integer, String, String> biFunction = (number, str) -> {
        String result = "";

        if (number > 6 && !str.isEmpty()) {
            result = "Passed and delivered homework";
        } else if (number > 6 && str.isEmpty()) {
            result = "Passed but didn't deliver homework.";
        } else if (number < 6) {
            result = "Didn't pass.";
        }

        return result;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(5, "Homework delivered"));
    }

}
