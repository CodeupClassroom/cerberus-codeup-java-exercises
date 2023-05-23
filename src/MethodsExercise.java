import java.util.Scanner;

public class MethodsExercise {
    private static final Scanner input = new Scanner(System.in);
    private static final int MAX_INPUT_RANGE = 10;

    public static void main(String[] args) {
//        double result = add(5, 9);
//        System.out.println(result);
//
//        System.out.println(subtract(5, 9));
//        System.out.println(multiply(5, 9));
//        System.out.println(divide(5, 0));
//        System.out.println(mod(5, 9));

//        System.out.print("Enter a number from 1 to " + MAX_INPUT_RANGE + ": ");
//        System.out.println(getInteger(1, MAX_INPUT_RANGE));

//        doSomeFactorials();

        rollSomeDice();
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
//        return a * b;

//        double sum = 0;
//        for (int i = 0; i < b; i++) {
//            sum += a;
//        }
//        return sum;

        if(b == 0) {
            return 0;
        }
        if(b == 1) {
            return a;
        }
        return a + multiply(a, b - 1);
    }

    private static double divide(double a, double b) {
        return a / b;
    }

    private static double mod(double a, double b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        int result = input.nextInt();

        // check if result is between min and max. if not call the function again
        if(result < min || result > max) {
            System.out.println("Dude, why can you not follow instructions!");
            return getInteger(min, max);
        }

        return result;
    }

    private static void doSomeFactorials() {
//        1. Prompt the user to enter an integer from 1 to 10.
//        5. Assume that the user will enter an integer, but verify it’s between 1 and 10.
        while(true) {
            System.out.println("Let's do a factorial!");
            System.out.print("Enter a number from 1 to " + MAX_INPUT_RANGE + ": ");
            int factBase = getInteger(1, MAX_INPUT_RANGE);
            // this really stinks to have to pull the newline out of the scanner
            input.nextLine();

            //        2. Display the factorial of the number entered by the user.
            System.out.println(fact(factBase));

            //        7. Continue only if the user agrees to.
            if(!promptToContinue()) {
                return;
            }
        }

    }

    //        4. Use a for loop to calculate the factorial.
    private static long fact(int factBase) {
//        6. Use the long type to store the factorial.
        long result = 1;
        for (int i = factBase; i >= 2; i--) {
            result *= i;
        }
        return result;
    }

    private static boolean promptToContinue() {
        //        3. Ask if the user wants to continue.
        System.out.print("Continue? y/n ");
        String continueString = input.nextLine();
        if(!continueString.equalsIgnoreCase("y")) {
            return false;
        }
        return true;
    }

    private static void rollSomeDice() {
//        1. Ask the user to enter the number of sides for a pair of dice.
        System.out.print("Enter the number of sides for a die: ");
        int dieSides = getInteger(4, 20);
        // this really stinks to have to pull the newline out of the scanner
        input.nextLine();

//        2. Prompt the user to roll the dice.
        System.out.print("Press enter to roll some dice! ");
        input.nextLine();

//        3. "Roll" two n-sided dice, display the results of each,

//        and then ask the user if he/she wants to roll the dice again.
        int result = rollADie(dieSides);
        System.out.println("You rolled a " + result);

        result = rollADie(dieSides);
        System.out.println("You rolled a " + result);


//        4. Use static methods to implement the method(s) that generate the random numbers.
//        5. Use the .random method of the java.lang.Math class to generate random numbers.
    }

    private static int rollADie(int dieSides) {
        // generate a number from 1 to dieSides
        int result = (int) (Math.random() * dieSides + 1);
        return result;
    }
}
