package section4.Step04Exercises;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Do Behavior Parameterization for the mapping logic in the following sentence:
 *
 * list squaredNumbers = numbers.stream().map(x -> x * x).collect(Collectors.tolist());
 */
public class BehaviorParameterization {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> squaredNumbers;
        List<Integer> cubeNumbers;
        List<Integer> doubledNumbers;

        Function<Integer, Integer> mappingSquareFunction = number -> number * number;
        Function<Integer, Integer> mappingCubeFunction = number -> number * number * number;
        Function<Integer, Integer> mappingDoubledFunction = number -> number + number;

        squaredNumbers = mapAndCreateNewList(numbers, mappingSquareFunction);
        cubeNumbers = mapAndCreateNewList(numbers, mappingCubeFunction);
        doubledNumbers = mapAndCreateNewList(numbers, mappingDoubledFunction);

        System.out.println(squaredNumbers);
        System.out.println(cubeNumbers);
        System.out.println(doubledNumbers);

    }

    public static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }
}
