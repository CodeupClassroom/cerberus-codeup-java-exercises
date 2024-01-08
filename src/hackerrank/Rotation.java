package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Rotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> nums = new ArrayList<>(arr);

        for (int i = 0; i < d; i++) {
            int removed = nums.remove(0);
            nums.add(removed);
        }
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        System.out.println(rotateLeft(4, nums));
    }
}
