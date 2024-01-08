package functional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {

    public static void main(String[] args) {
        List<Student> students = makeStudents();

        // print all the students
        students.stream()
                .forEach(System.out::println);

        // print the student with id of 3
        System.out.println("-----------------------");
        students.stream()
                .filter(student -> student.getId() == 3)
                .forEach(System.out::println);

        // print the juniors
        System.out.println("-----------------------");
        students.stream()
                .filter(student -> student.getClassification().equals("Junior"))
                .forEach(System.out::println);

        // print the student names
        System.out.println("-----------------------");
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        // print the two oldest students
        System.out.println("-----------------------");
        students.stream()
                .sorted(Comparator.comparing(Student::getAge).reversed())
                .limit(2)
                .forEach(System.out::println);

        // print the youngest student
        System.out.println("-----------------------");
        System.out.println(students.stream()
                .min(Comparator.comparing(Student::getAge)));

        // print the average age
        System.out.println("-----------------------");
        System.out.println(students.stream()
                .mapToInt(Student::getAge)
                .average());

        // print the students and their grade averages
        System.out.println("-----------------------");
        students.stream()
                .map(student -> {
                    return student.getName()
                            + " : "
                            +  student.getGrades().stream().mapToInt(Integer::intValue).average();
                })
                .forEach(System.out::println);

        // print the overall average grade in the course
        // ignore students without any grades
        System.out.println("-----------------------");
        System.out.println(students.stream()
                .filter(student -> !student.getGrades().isEmpty())
                .mapToDouble((student) -> student.getGrades().stream().mapToInt(Integer::intValue).average().getAsDouble())
                .average());

        // print the sorted student names per classification
        System.out.println("-----------------------");
        System.out.println(students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.groupingBy(Student::getClassification
                    , Collectors.mapping(Student::getName, Collectors.toList()))));
    }

    private static List<Student> makeStudents() {
        List<Student> students = new ArrayList<>();

        Student s = new Student(1, "Bob", "Junior", 21);
        s.addGrade(75);
        s.addGrade(87);
        s.addGrade(52);
        students.add(s);

        s = new Student(2, "Sue", "Sophomore", 19);
        s.addGrade(100);
        s.addGrade(91);
        s.addGrade(93);
        s.addGrade(85);
        students.add(s);

        s = new Student(3, "Tom", "Junior", 20);
        s.addGrade(77);
        s.addGrade(78);
        s.addGrade(80);
        students.add(s);

        s = new Student(4, "Jill", "Freshman", 18);
        s.addGrade(65);
        s.addGrade(82);
        s.addGrade(80);
        students.add(s);

        s = new Student(5, "Lou", "Senior", 21);
        s.addGrade(88);
        s.addGrade(97);
        s.addGrade(89);
        students.add(s);
        return students;
    }

}
