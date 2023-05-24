package docrob;

import java.util.Scanner;

public class OOLec {
    public static void main(String[] args) {
        // explain difference between Scanner and Math classes
//        Scanner input = new Scanner(System.in);
//        Scanner stringInput = new Scanner("hello world");
//        input.nextLine();

//        int x = Math.abs(-5);

        // what is a class?
            // custom data type
            // like math, can also be a group of related utility functions (static)

        // what is an object?

        // make a simple class
            // fighter with name and health fields
            // make them public for now

        // make a fighter (tom)
//        Fighter tom = new Fighter();
////        tom.name = "Tom";
////        tom.health = 100; // new fighters have a health of 100
//        tom.setName("Tom");
//        tom.setHealth(100);
//
//        Fighter sue = new Fighter();
////        sue.name = "Sue";
////        sue.health = 100;
//        sue.setName("Sue");
//        sue.setHealth(100);

        // why make object classes?
            // to represent the concepts that are what the program is about (design)
            // to group together fields and methods that have something in common (code organization)

            // what are static methods used for?
                // utility classes like Math
                // or when you want to call the method on a class but should not have to have an instance to do it
                    // e.g., BUILDER methods

        // where does the main() go?
            // writing a 2 file program!
            // can fighter have a main()?

        // show my console adventure demo and how many files it has
            // and what each of the game files represents

        // public vs. private fields?
            // how to change if private?

        // 1. constructors
            // overloading constructors
        Fighter tom = new Fighter("Tom");
        Fighter sue = new Fighter("Sue");

        // 2. getters and setters

        // public private guidelines
            // private default for fields
            // private default for methods

        // the toString method
        System.out.println(tom);
        System.out.println(sue);

        // this reference
            // make a printThis method that shows what THIS really refers to

        // finish with a goblin class that can exchange hits with the Fighter
        tom.attackPower50(sue);
        // print out "Tom hits Sue for xxx damage!"
        sue.attackPower50(tom);

        System.out.println(tom);
        System.out.println(sue);

    }
}
