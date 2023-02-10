package section2.step5exercises;

import java.util.List;

public class PrintCourseNamesIndividually {

    public static void main(String[] args) {

        List<String> courseNames = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courseNames.stream()
                .forEach(System.out::println);
    }

}
