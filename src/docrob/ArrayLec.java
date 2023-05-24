package docrob;

import java.util.Arrays;

public class ArrayLec {
    public static void main(String[] args) {
        // describe what arrays are (simple diagram on board)

        // declare an array of ints
        int arraySize = 10;
        int [] ages = new int[arraySize];

        // fixed length MUST KNOW AT THE TIME THE ARRAY DECLARATION EXECUTES

        // initial values of array elements
        // show how to print an array Arrays.toString()
//        System.out.println(ages);
        System.out.println(Arrays.toString(ages));

        // accessing elements via bracket notation and indexes
        ages[0] = 25; // the element at subscript 0 in the array ages is 25
        // ages sub 0
        ages[1] = 32; // ages sub 1
        ages[ages.length - 1] = 42; // set the last age to 42, ages sub last
        System.out.println(Arrays.toString(ages));
        System.out.println(ages.length - 1);
        System.out.println(ages[ages.length - 1]);

        // array initializers if you know some/all values when writing the code (e.g., days of the week)
        String [] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        System.out.println(Arrays.toString(daysOfWeek));

        // LOOPS and ARRAYS

        // fori
//        for (int i = 0; i < ages.length; i++) {
//            System.out.printf("The element at index %d is %d\n", i, ages[i]);
//        }

        // foreach
//        for (int age : ages) {
//            System.out.printf("The next element is %d\n", age);
//        }
        for (int age : ages) {
            System.out.printf("The next element is %d\n", age);
        }

        // useful array static methods via the Arrays utility class

        // fill
//        Arrays.fill(daysOfWeek, "blah");
        Arrays.fill(ages, 18);
        System.out.println(Arrays.toString(ages));

        // equals
//        daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        String [] days = new String[7];
        days[0] = "Sun";
        days[1] = "Mon";
        days[2] = "Tue";
        days[3] = "Wed";
        days[4] = "Thu";
        days[5] = "Fri";
        days[6] = "Sat";

        System.out.printf("Are my 2 string arrays equal? %b\n", daysOfWeek == days);
        System.out.println(daysOfWeek);
        System.out.println(days);

        System.out.printf("Are the contents of my 2 string arrays equal? %b\n", Arrays.equals(daysOfWeek, days));

        // copyOf
        String [] myNewWeek = Arrays.copyOf(daysOfWeek, 7);
        myNewWeek[2] = "tue";

        System.out.println("my new week is " + Arrays.toString(myNewWeek));

//        daysOfWeek = Arrays.copyOf(daysOfWeek, 15);
//        System.out.println(Arrays.toString(daysOfWeek));

        // sort
        Arrays.sort(myNewWeek);
        System.out.println("my new sorted week is " + Arrays.toString(myNewWeek));

        // NOW LET'S MAKE AN ARRAY OF FIGHTERS!!!
        Fighter [] arena = new Fighter[3];
        arena[0] = new Fighter("Bob");
        arena[1] = new Fighter("Sue");
        arena[2] = new Fighter("Ragnar");

        arena[0].attackPower50(arena[1]);
    }
}
