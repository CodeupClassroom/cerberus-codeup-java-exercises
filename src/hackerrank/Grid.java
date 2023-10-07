package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grid {

    public static String gridChallenge(List<String> grid) {
        // before sort
//        System.out.println(grid);

        int numRows = grid.size(); // number of strings in the list
        int numCols = grid.get(0).length(); // number of chars in a string
        
        char [][] cGrid = new char[numRows][numCols];
        
        // 1. convert arraylist of strings to a 2d char array
        int i = 0;
        for (String s : grid) {
            char [] cs = s.toCharArray();
            // 2. subproblem 1: sort all rows of chars (each row is a 1d array of chars)
            Arrays.sort(cs);
            cGrid[i] = cs;

//            System.out.println(Arrays.toString(cGrid[i]));

            i++; // move on to the next row in cGrid
        }


        // 3. subproblem 2: check each column in the 2d array to see if its elements are ordered
        // iterate over the grid column by column
        for (int colIndex = 0; colIndex < numCols; colIndex++) {
            
            // iterate over the elements IN that column and compare 2 of those elements at a time
            for (int rowIndex = 0; rowIndex < (numRows - 1); rowIndex++) {
                char c1 = cGrid[rowIndex][colIndex];
                char c2 = cGrid[rowIndex + 1][colIndex];

                if(c1 > c2) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("abc");
        grid.add("hjk");
        grid.add("hjk");
        grid.add("rtv");
//        grid.add("xywuv");
        System.out.println(gridChallenge(grid));
    }
}
