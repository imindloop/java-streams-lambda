package section2.step5execises;

import java.util.List;

public class PrintCourseNamesContainingWordSpring {

    public static void main(String[] args) {
        List<String> courseNames = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courseNames.stream()
                .filter(name -> name.contains("Spring"))
                .forEach(System.out::println);
    }

}
