package functional;

import java.util.List;
import java.util.function.Function;

public class FP03 {

    public static void mapAndPrint(List<Integer> nums, Function<Integer, Integer> f) {
        nums
                .stream()
                .map(f)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        nums
//                .stream()
//                .filter(num -> num % 2 != 0)
//                .map(num -> num * num * num)
//                .forEach(System.out::println);

        mapAndPrint(nums, x -> x * x);
        mapAndPrint(nums, x -> x * x * x);
    }
}
