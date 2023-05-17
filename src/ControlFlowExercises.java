import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        // While loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
        // ----------------
        // Do While
        // Create a do-while loop that will count by 2's starting with 0 and ending at
        // 100. Follow each number with a new line.
        // ---------------
//        int i = 0;
//        do {
//            System.out.printf(i);
//            i += 2;
//        } while (i <= 100);
//        // -----------
//        // Alter your loop to count backwards by 5's from 100 to -10.
//        // -----------
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i > -11);
        // -------------------
        // -Create a do-while loop that starts at 2, and displays the number squared on
        // each line while the number is less than 1,000,000. Output should equal:
        // --------------
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1_000_000);
        // For
        // -Refactor the previous two exercises to use a for loop instead.
        // ----------------------------
//        for(int i = 100; i > -11; i -= 5){
//            System.out.println(i);
//        }

//        for(long i = 2; i <= 1_000_000; i *= i) {
//            System.out.println(i);
//        }
        // ------------------------
        // 2. Fizzbuzz
        // -Write a program that prints the numbers from 1 to 100.
        // -For multiples of three: print “Fizz” instead of the number.
        // -For the multiples of five: print “Buzz”.
        // -For numbers which are multiples of both three and five: print “FizzBuzz”.
        // ---------------------------
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        // -------------------

//       TODO: #3 Display a table of powers.

//       TODO: Prompt the user to enter an integer.

//       TODO: Display a table of squares and cubes from 1 to the value entered.

//       TODO: Ask if the user wants to continue.

//       TODO: Assume that the user will enter valid data.

//       TODO: Only continue if the user agrees to.


        Scanner scanner = new Scanner(System.in);

        boolean confirm;


        do {

            System.out.println("What number would you like to go up to?");
            int userInt = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for(int i = 1; i <= userInt; i++){
                int square = i * i;
                int cubed = i * i * i;
//                The "%-7s" in Java is a string format specifier used with the printf() to format an integer value with a minimum width of 7 characters and left-align it within the field.
//
//The "-" character is used to indicate left-alignment, while "7" indicates the minimum width of the field. "s" is the conversion character for an integer value.
//
//For example, if you have the integer value 123 and you use the format specifier "%-7s", it will be printed as "123 " (with 4 spaces added to the right of the number to make a total width of 7 characters).
                System.out.printf("%-7s|%-9s|%-6s\n", i, square, cubed);
            }
            System.out.print("Continue? [Y/N] ");
            confirm = scanner.next().equalsIgnoreCase("y");
        } while(confirm);
        System.out.println("Cool. See you next time!");


//        TODO: # 4 Prompt the user for a numerical grade from 0 to 100.
//        TODO: Display the corresponding letter grade.
//        TODO: Prompt the user to continue.
//        TODO: Assume that the user will enter valid integers for the grades.
//        TODO: The application should only continue if the user agrees to.

//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

//        boolean confirm;
//
//        do {
//            System.out.print("Enter a numerical grade from 0 to 100: ");
//            int userGrade = scanner.nextInt();
//
//            if(userGrade >= 88){
//                System.out.println("A");
//            } else if(userGrade >= 80){
//                System.out.println("B");
//            } else if(userGrade >= 67){
//                System.out.println("C");
//            } else if(userGrade >= 60){
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//            System.out.print("Continue? [Y/N] ");
//            confirm = scanner.next().equalsIgnoreCase("y");
//
//        } while(confirm);
//        System.out.println("K Thanks Bye");

    }

}