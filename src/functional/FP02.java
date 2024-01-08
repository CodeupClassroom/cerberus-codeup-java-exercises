package functional;

import java.util.List;
import java.util.stream.Collectors;

public class FP02 {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        printCourses(courses);

        System.out.println(courses
                .stream()
                .map(String::length)
                .collect(Collectors.toList()));
    }

    private static void printCourses(List<String> courses) {
        courses
                .stream()
                .forEach(System.out::println);

        System.out.println("---------------");

        courses
                .stream()
                .filter((course) -> course.toLowerCase().contains("spring"))
                .forEach(System.out::println);

        System.out.println("---------------");

        courses
                .stream()
                .filter((course) -> course.length() >= 4)
                .forEach(System.out::println);

        courses
                .stream()
                .map(course -> course.length())
                .forEach(System.out::println);
    }
}
