package hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedTest {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);

        // arr will be sorted at this point
        long lowSum = arr.get(0);
        lowSum += arr.get(1);
        lowSum += arr.get(2);
        lowSum += arr.get(3);

        long hiSum = arr.get(4);
        hiSum += arr.get(3);
        hiSum += arr.get(2);
        hiSum += arr.get(1);

        System.out.printf("%d %d%n", lowSum, hiSum);
    }

    public static void main(String[] args) {
        // input 256741038 623958417 467905213 714532089 938071625
        // expected 2063136757 2744467344
        List<Integer> nums = Arrays.asList(256741038
                , 623958417
                , 467905213
                , 714532089
                , 938071625);

        miniMaxSum(nums);

    }
}
