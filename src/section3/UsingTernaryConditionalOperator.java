package section3;

import java.util.List;

public class UsingTernaryConditionalOperator {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 17, 15, 22, 25);

        System.out.println(numbers.stream()
                .reduce(0, (aggregator, streamElement) -> aggregator > streamElement ? streamElement:aggregator));
    }

}
