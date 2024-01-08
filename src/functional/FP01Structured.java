package functional;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
//        printNumbers(List.of(9, 12, 5, 122));
        printNumbersFunctional(List.of(9, 12, 5, 122));
    }

    private static void printNumbersFunctional(List<Integer> nums) {
        nums
                .stream()
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println);
    }

    private static void printNum(int num) {
        System.out.println(num);
    }

    private static void printNumbers(List<Integer> nums) {
        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
