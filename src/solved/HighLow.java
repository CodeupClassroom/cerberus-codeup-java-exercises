package solved;

import java.util.Scanner;

public class HighLow {
    private static final Scanner input = new Scanner(System.in);

    private static final int HI_BOUND = 100;
    private static final int MAX_GUESSES = 10;

    public static void main(String[] args) {
        int answer = (int) (Math.random() * HI_BOUND + 1);

        int count = 0;
        while(true) {
            System.out.println("Guess a number from 1 to " + HI_BOUND);
            int guess = getInteger(1, HI_BOUND);
            count++;

            if(guess == answer) {
                System.out.println("Correct!");
                break;
            }
            if(guess < answer) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }

            if(count >= MAX_GUESSES) {
                System.out.println("Sorry, you are out of guesses!");
                break;
            }
        }

        System.out.println("You made " + count + " guesses");
    }

    public static int getInteger(int min, int max) {
        int anInt = input.nextInt();
        if(anInt < min || anInt > max) {
            System.out.printf("That was not between %d and %d! Try again.\n", min, max);
            return getInteger(min, max);
        }
        return anInt;
    }
}
