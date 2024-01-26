package hackerrank;

import java.util.List;

public class Subarray {
    public static int birthday(List<Integer> s, int d, int m) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }
        if(sum == d) {
            count++;
        }

        for (int i = m; i < s.size(); i++) {
            // drop off first val in segment
            sum -= s.get(i - m);

            // add last val in segment
            sum += s.get(i);

            if(sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 2, 1, 3, 2);
        System.out.println(birthday(nums, 4, 2));
    }
}
