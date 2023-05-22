package solved;

import java.util.Scanner;

public class MethodsExercises {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(addition(5, 11));
        System.out.println(subtraction(5, 11));
        System.out.println(multiplication(5, 11));
        System.out.println(division(5, 11));
        System.out.println(mod(5, 11));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("You entered " + userInput);

        manyFactorials();

        manyDiceRolls();
    }

    private static double addition(double a, double b) {
        return a + b;
    }

    private static double subtraction(double a, double b) {
        return a - b;
    }

    private static double multiplication(double a, double b) {
//        return a * b;

//        double sum = 0;
//        for (int i = 0; i < b; i++) {
//            sum += a;
//        }
//        return sum;

        if(b == 0) {
            return 0;
        }
        return a + multiplication(a, b - 1);
    }

    private static double division(double a, double b) {
        return a / b;
    }

    private static double mod(double a, double b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        int anInt = input.nextInt();
        if(anInt < min || anInt > max) {
            System.out.printf("That was not between %d and %d! Try again.\n", min, max);
            return getInteger(min, max);
        }
        return anInt;
    }

    private static void manyFactorials() {
        while(true) {
            doSingleFactorial();

            // get rid of newline that is still hanging out in the scanner's buffer
            input.nextLine();

            if(!keepGoing()) {
                break;
            }
        }
    }

    private static void doSingleFactorial() {
        System.out.print("Enter a number between 1 and 10: ");
        int base = getInteger(1, 10);
        System.out.printf("%d! = %d\n", base, fact(base));
    }

    public static long fact(long n) {
        // hallmark #2 (a way to stop)
        if(n == 1 || n == 2) {
            return n;
        }

        // hallmark #1 (answer is in smaller terms of itself)
        return n * fact(n - 1);
    }

    private static boolean keepGoing() {
        System.out.print("Continue (y/n)? ");
        String response = input.nextLine();
        if(!response.equalsIgnoreCase("y")) {
            return false;
        }
        return true;
    }

    private static void manyDiceRolls() {
        while(true) {
            System.out.println("How many sides on your die are there? ");
            int n = getInteger(1, 20);

            int dieRoll = rollDie(n);
            System.out.println("First roll is a " + dieRoll);

            dieRoll = rollDie(n);
            System.out.println("Second roll is a " + dieRoll);

            // get rid of newline that is still hanging out in the scanner's buffer
            input.nextLine();

            if (!keepGoing()) {
                break;
            }
        }
    }

    private static int rollDie(int n) {
        return (int) (Math.random() * n + 1);
    }

}
