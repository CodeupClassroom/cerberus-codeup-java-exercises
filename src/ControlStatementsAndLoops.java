import java.util.Scanner;
public class ControlStatementsAndLoops {


    public static void main(String[] args){


        //---------------------------------- Boolean expressions ------------------------------------------
//            System.out.println(10 > 5);
//            System.out.println(5 == 5);
//            System.out.println(true == false);
//            System.out.println(2 <= 2);
//            System.out.println();
//            //---------------------------------- Logical operators ------------------------------------------
//            System.out.println((true == true) || (true == false));
        boolean isLoggedIn = true;
        boolean isAdmin = true;
        if (isLoggedIn && isAdmin) {
            System.out.println("admin page");
        }

        //---------------------------------- String comparison ------------------------------------------
        // - strings are not Primitive types, they are Reference types
        //At any given time - a String is an object with properties and everything an object would
        //We need to use .equals
        String stringThing1 = "a";

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Type 'a'");

        String stringThing2 = myScanner.nextLine();

        System.out.println("stringThing1 = " + stringThing1);
        System.out.println("stringThing2 = " + stringThing2);
        System.out.println("stringThing1 == stringThing2 = " + stringThing1 == stringThing2);
//        //The above is wrong - we're asking Java "is this OBJECT OVER HERE the same OBJECT OVER HERE"
//
        System.out.println("stringThing1.equals(stringThing2) = " + stringThing1.equals(stringThing2));
        //The above is right - we're asking Java "does this Object has the same VALUE as this other object"

        //---------------------------------- Control structures  ------------------------------------------
        //If/else if/else
        boolean lectureTime = false;
        if(lectureTime){
            System.out.println("Here's some Java code and conversation");
        }
//
        boolean noClassTomorrow = false;

        if(noClassTomorrow){
            System.out.println("Party Time");
        } else {
            System.out.println("Bummer");
        }
//
        boolean learningJava = false;
        boolean learningCss = false;
        boolean learningJs = false;
        if(learningCss){
            System.out.println("You're learning css today");
        } else if (learningJs) {
            System.out.println("You're learning JS today");
        } else if (learningJava){
            System.out.println("You're learning Java today");
        } else {
            System.out.println("You're learning something else today");
        }
        //---------------------------------- Switch case  ------------------------------------------

        int rand = (int)(Math.random() * 3) + 1;
        System.out.println("rand = " + rand);
//
        switch (rand) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }

        //---------------------------------- While - do-while loop  ------------------------------------------
        boolean needToOrder = true;
        while(needToOrder){
            System.out.println("You need to order some food for lunch!");
            needToOrder = false;
        }

        do{
            System.out.println("You need to order some food for lunch");
            needToOrder = false;
        } while (needToOrder);
////        For
        //Break and Continue

        for(int i = 0; i < 20; i++){

            if(i == 7){
                System.out.println("Whoa - lucky number 7");
                continue;
            }

            if(i == 9){
                System.out.println("Stop this loop!");
                break;
            }

            System.out.println("i = " + i);

        }
    }
}

