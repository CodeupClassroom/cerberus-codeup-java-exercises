import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
//        1
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f. %n", pi);
        //    2A
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int nextInt = sc.nextInt();
//        System.out.println(nextInt);

//        2B
//        System.out.println("Enter three words: ");
//        String wordOne = sc.next();
//        String wordTwo = sc.next();
//        String wordThree = sc.next();
//
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);

//        System.out.println("Enter a sentence: ");
//        String ourSentence = sc.nextLine();
//        System.out.println("Your sentence is: " + ourSentence);
        sc.useDelimiter("\n");

        System.out.println("Gimme a length: ");
        int length = sc.nextInt();
        System.out.println("Gimme a width: ");
        int width = sc.nextInt();

//        int newLength = parseInt(length);
//        int newWidth = parseInt(width);

        System.out.println("Area:");
        System.out.println(length * width);

        System.out.println("Perimeter:");
        System.out.println((2 * length) + (2 * width));


    }

//    public static int product(int x,int y){
//        if(x==0 ||y ==0){
//            return 0;
//        }
//        else if(x < y ){
//            return product(y,x);
//        }
//        else if(y != 0) {
//            return (x + product(x, y - 1));
//        }
//        else{
//            return -x + product(x,y+1);
//
//        }
//
//    }

}
