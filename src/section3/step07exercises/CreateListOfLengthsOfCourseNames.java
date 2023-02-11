package section3.step07exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CreateListOfLengthsOfCourseNames {

    public static void main(String[] args) {
        List<String> courseNames = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<Integer> courseNamesLength;

        courseNamesLength = courseNames.stream()
                .map(courseName-> courseName.length())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(courseNamesLength);
    }

}
