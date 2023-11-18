package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagDiff {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagSum = 0;
        int secondDiagSum = 0;
        int index = 0;

        // compute sum of first diag (upper left to lower right)
        /*
        1  2  3
        4  5  6
        9  8  9
         */
        // iterate thru rows
        // for each row, add the appropriate element to the appropriate sum
        index = 0;
        for (List<Integer> row : arr) {
            firstDiagSum += row.get(index);
            index++;
        }

        // compute sum of second diag (upper right to lower left)
        index = arr.size() - 1;
        for (List<Integer> row : arr) {
            secondDiagSum += row.get(index);
            index--;
        }

        // return abs value of difference of the 2 sums
        return Math.abs(firstDiagSum - secondDiagSum);
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> row = Arrays.asList(1, 2, 3);
        matrix.add(row);
        row = Arrays.asList(4, 5, 6);
        matrix.add(row);
        row = Arrays.asList(9, 8, 9);
        matrix.add(row);

        System.out.println(diagonalDifference(matrix));

    }
}
