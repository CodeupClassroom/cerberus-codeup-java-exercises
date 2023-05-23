import java.util.Scanner;

public class HighLow {
    private static final Scanner input = new Scanner(System.in);
    private static final int MAX_GUESSES = 5;

    /*
    Keep track of how many guesses a user makes.
Set an upper limit on the number of guesses.
     */
    public static void main(String[] args) {
        //        1. Game picks a random number between 1 and 100 ONCE!!!
        int answer = rollADie(100);

        int guessCounter = 0;
        while(true) {
            System.out.println("CHEAT: answer is " + answer);
            //        2. Prompts user to guess the number.
            System.out.print("Guess a number from 1 to 100: ");
            int guess = getInteger(1, 100);
            guessCounter++;

            boolean guessedIt = checkGuess(guess, answer);
            if(guessedIt) {
                break;
            }

            if(guessCounter >= MAX_GUESSES) {
                System.out.println("LOSER!");
                break;
            }
        }

        System.out.println("Bye!");
        System.out.println("You made " + guessCounter + " guesses");

    }

    private static int rollADie(int dieSides) {
        // generate a number from 1 to dieSides
        int result = (int) (Math.random() * dieSides + 1);
        return result;
    }

    public static int getInteger(int min, int max) {
//        3. All user inputs are validated.
        int result = input.nextInt();

        // check if result is between min and max. if not call the function again
        if(result < min || result > max) {
            System.out.println("Dude, why can you not follow instructions!");
            return getInteger(min, max);
        }

        return result;
    }

    private static boolean checkGuess(int guess, int answer) {
        //        6. If a user guesses the number, the game should declare "GOOD GUESS!"
//        System.out.println(guess + " " + answer);
        if(guess == answer) {
            System.out.println("Good guess!!!");
            return true;
        } else if(guess > answer) {
//        4. If user's guess is less than the number, it outputs "HIGHER".
            System.out.println("Too high!");
        } else {
//        5. If user's guess is more than the number, it outputs "LOWER".
            System.out.println("Too low!");
        }
        return false;
    }

}
