package section3.step06exercises;

import java.util.Comparator;
import java.util.List;

public class PrintCourseNamesWithCustomComparator {

    public static void main(String[] args) {
        List<String> courseNames = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courseNames.stream()
                .sorted(Comparator.comparing(string -> string.length()))
                .forEach(System.out::println);
    }
}
