package hackerrank;

public class TestStuff3 {

    public static void main(String[] args) {
        int [][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < nums.length; i++) { // i is the outer/slower loop
            for (int j = 0; j < nums[0].length; j++) { // j is the innter/faster loop

                System.out.println(nums[j][i]);
            }

        }

    }
}
