package section2.step6exercises;

import java.util.List;

public class PrintNumberOfCharactersInCourseName {

    public static void main(String[] args) {
        List<String> courseNames = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courseNames.stream()
                .map(courseName -> "Course: " + courseName + " has " + courseName.length() + " letters." )
                .forEach(System.out::println);
    }



}
