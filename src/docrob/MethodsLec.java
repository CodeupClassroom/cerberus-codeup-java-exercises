package docrob;

import java.util.Scanner;

public class MethodsLec {
    private static final Scanner input = new Scanner(System.in);

    private static String myName;
    private static String x;

    public static void sayHello(String aName) {
        System.out.println("Hello " + aName);
    }

    private static void sayHello() {
        sayHello("there");
    }

    private static void sayHello(int numHellos) {
        for (int i = 0; i < numHellos; i++) {
            sayHello();
        }
    }

    private static String sayHelloJedi() {
        sayHello("General Kenobi");
        return "General Kenobi";
    }

    private static void foo(String aString) {
        aString = "Bob";
        System.out.println("in foo, aString is " + aString);
        x = "Bob";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // technical diff between method and function

        // create a sayHello method with a string param
        // point out the parts of method signature
        // remind students of difference in DEFINING and CALLING a method
        sayHello("Bob");

        // overload with a sayHello method with no parameters
        // introduce NO ARG term
        sayHello();

        // overload with an int to print hello a number of times
        // show reuse by calling the no arg version
        sayHello(5);

        x = sayHelloJedi();
        System.out.println(x); // general kenobi

        // talk about passing by value and how to change a parameter's value OUTSIDE of the function
        // demo string changeMe function
        // 2 ways to change outside variable:
        // 1. pass it contained in an object (WILL SHOW NEXT WEEK)
        // 2. or make it global (show the static shuffle) and advise to be careful

        foo(x); // pass x to foo and see if foo can change it
        System.out.println("in main, x is " + x);

        // fun with recursion!
        // briefly go over codeup's count example
        // BRIEFLY use my fun w recursion slides to talk in more depth
        // maybe show my fibonacci examples

        input.close();
    }


//    private static int getNumberFromOneTo10(Scanner input) {
//        System.out.print("Enter number from 1 to 10: ");
//        int aNumber = input.nextInt();
//        if(aNumber < 1 || aNumber > 10) {
//            return getNumberFromOneTo10(input);
//        }
//        // otherwise you did it right so return it
//        return aNumber;
//    }
//
//    private static String makeNewName(String newName) {
//        return newName;
//    }
//
//    private static void changeMyName(String oldName, String newName) {
//        myName = newName;
//        System.out.println("oldName is now " + myName);
//    }
}