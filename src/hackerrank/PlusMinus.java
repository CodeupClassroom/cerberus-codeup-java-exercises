package hackerrank;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // count # of positive elements, negative elements, and zeroes
        double countPositive = 0;
        double countNegative = 0;
        double countZero = 0;

        for (Integer i : arr) {
            if(i < 0) {
                countNegative++;
            } else if(i > 0) {
                countPositive++;
            } else {
                countZero++;
            }
        }

        System.out.printf("%7.6f\n", countPositive / arr.size());
        System.out.printf("%7.6f\n", countNegative / arr.size());
        System.out.printf("%7.6f\n", countZero / arr.size());

    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 1, 0, -1, -1);

        plusMinus(nums);
    }
}
