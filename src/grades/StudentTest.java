package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student bob = new Student("Bob");
        bob.addGrade(50);
        bob.addGrade(60);
        bob.addGrade(100);
        bob.addGrade(90);

        System.out.println(bob.getGradeAverage());
    }
}
