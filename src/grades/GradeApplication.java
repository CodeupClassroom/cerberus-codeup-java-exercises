package grades;

import util.Input;

import java.util.HashMap;

public class GradeApplication {

    private static HashMap<String,Student> students;

    public static void main(String[] args) {
        students = makeStudents();
        printWelcome();
        printChoice();
    }

    public static HashMap<String,Student> makeStudents(){
        HashMap<String, Student> students = new HashMap<>();
        Student DocRob = new Student("Mark");
        DocRob.addGrade(90);
        DocRob.addGrade(100);
        DocRob.addGrade(80);
        Student Lola = new Student("Lola");
        Lola.addGrade(80);
        Lola.addGrade(70);
        Lola.addGrade(90);
        Student Kenneth = new Student("Ken");
        Kenneth.addGrade(90);
        Kenneth.addGrade(70);
        Kenneth.addGrade(85);
        Student Joshua = new Student("Joshua");
        Joshua.addGrade(90);
        Joshua.addGrade(95);
        Joshua.addGrade(90);


        students.put("DocRob",DocRob);
        students.put("Lola",Lola);
        students.put("Kenneth",Kenneth);
        students.put("Joshua",Joshua);

        return students;
    }

    private static void printWelcome(){
        System.out.println("""
                Welcome!
                
                Here are the Github usernames of out Students:
                """
        );
        for (String key : students.keySet()){
            System.out.printf("|%s| ", key);
        }
        System.out.println();

    }

    private static void printChoice(){
        String userInput = "";
        do{
        System.out.println("What student would you like to see more information on ?");
        Input in = new Input();
        String userChoice = in.getString();

        if (students.containsKey(userChoice)){
            System.out.println("Name: " + students.get(userChoice).getName() + " - GitHubUsername: " + userChoice);
            System.out.println("Current Average: " + students.get(userChoice).getGradeAverage());
            System.out.println("Would you like to continue?(y for yes and n for no)");
            userInput = in.getString();
        }else{
            System.out.println("Sorry, that doesn't match anyone in our database");
            System.out.println("Would you like to continue?(y for yes and n for no)");
            userInput = in.getString();
        }

        }while(userInput.equalsIgnoreCase("y"));
        System.out.println("goodye");


    }
}
