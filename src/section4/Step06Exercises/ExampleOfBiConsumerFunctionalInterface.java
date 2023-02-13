package section4.Step06Exercises;

import java.util.function.BiConsumer;

public class ExampleOfBiConsumerFunctionalInterface {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (str1, str2) -> {
            System.out.println(str1);
            System.out.println(str2);
        };

        biConsumer.accept("Carlos", "Rodriguez");
    }

}
