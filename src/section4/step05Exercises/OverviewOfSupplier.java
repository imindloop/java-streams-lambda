package section4.step05Exercises;

import java.util.function.Supplier;

public class OverviewOfSupplier {

    /**
     * A Supplier doesn't receive any input, but it produces and returns an output.
     *
     * For example we could return a number.
     */
    static Supplier<Integer> randomIntegerSupplier = () -> {
        Double random =  Math.random();
        int randomInt =(int) Math.round(random * 10);

        return randomInt;
    };

    public static void main(String[] args) {
        System.out.println(randomIntegerSupplier.get());
    }

}
