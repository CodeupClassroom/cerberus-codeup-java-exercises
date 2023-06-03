package docrob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExamReview {
    public static void main(String[] args) {
//        Write a public static method named cubed that accepts an integer as an argument and returns that integer to the third power.
        System.out.println(cubed(3)); // 27

//Write a public static method named difference that accepts two arguments and that works with both integers and doubles (use method overloading). Both variations of the method should return the result of subtracting the second argument from the first argument.
//
        System.out.println(difference(5, 3));
        System.out.println(difference(5.0, 3.0));

//Write a public static method named median that receives an array of ints (please use an array, not a Collection) and returns the median as a double.
//(Hint: there are examples of how to find median of an array in Java all over the internet)
//(Hint: the sort method on the Arrays class may be very helpful here)
//(Hint: make sure the median of [1, 3, 4, 2, 6, 5, 8, 7] is 4.5)
        int [] numbers = {1, 3, 4, 2, 6, 5, 8, 7};

//        System.out.println(median(numbers));

        List<Cat> cats = new ArrayList<>();

        Cat cat = new Cat(5, true, "bob", "splotchy");
        cat.meow();
        System.out.println(cat);
        cats.add(cat);

        cat = new Cat(3, true, "sally", "orange");
        cats.add(cat);

        Dog dog = new Dog(2, false, "spot", "spotty");
        dog.bark();

        cats = uppercaseCatColor(cats);
        System.out.println(cats);

    }

    private static List<Cat> uppercaseCatColor(List<Cat> cats) {
        // 1. for each cat

        // 2. change its color to upper case using the setter
        for (Cat cat : cats) {
            String currentColor = cat.getColor();
            cat.setColor(currentColor.toUpperCase());
        }

        return cats;
    }

    private static double median(int[] numbers) {
        // 1. sort the numbers
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // 2. if the length of the array is odd, pick the middle element
        if(numbers.length % 2 == 1) {
            int middleIndex = (int) (numbers.length / 2);
            return numbers[middleIndex];
        }

        // 3. if the length is even, return the average of the 2 middle elements
        int middleIndex = (int) (numbers.length / 2);

        return (double) (numbers[middleIndex - 1] + numbers[middleIndex]) / 2;
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static double difference(double a, double b) {
        return a - b;
    }

    public static int cubed(int i) {
        return (int) Math.pow(i, 3);
    }
}
