package hackerrank;

import java.util.List;

public class BigSum {
    public static long aVeryBigSum(List<Long> ar) {
        return ar
                .stream()
                .reduce(0L, Long::sum);

    }
    public static void main(String[] args) {
        System.out.println(aVeryBigSum(List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)));

    }
}
