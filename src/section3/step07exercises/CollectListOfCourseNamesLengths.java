package section3.step07exercises;

import java.util.List;
import java.util.stream.Collectors;

public class CollectListOfCourseNamesLengths {

    public static void main(String[] args) {
        List<String> courseNames = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<Integer> courseNamesLengths;

        courseNamesLengths = courseNames.stream()
                .map(courseName -> courseName.length())
                .collect(Collectors.toList());

        System.out.println(courseNamesLengths);
    }

}
