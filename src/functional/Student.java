package functional;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String classification;
    private int age;

    private List<Integer> grades;

    public Student() {
        grades = new ArrayList<>();
    }

    public Student(int id, String name, String classification, int age) {
        this();

        this.id = id;
        this.name = name;
        this.classification = classification;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classification='" + classification + '\'' +
                ", age=" + age +
                ", grades=" + grades +
                '}';
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getGrades() {
        return grades;
    }

}
