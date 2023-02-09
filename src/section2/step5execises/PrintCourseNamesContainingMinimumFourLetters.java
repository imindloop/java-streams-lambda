package section2.step5execises;

import java.util.List;

public class PrintCourseNamesContainingMinimumFourLetters {

    public static void main(String[] args) {
        List<String> courseNames = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courseNames.stream()
                .filter(courseName -> courseName.length() > 4)
                .forEach(System.out::println);
    }
}
