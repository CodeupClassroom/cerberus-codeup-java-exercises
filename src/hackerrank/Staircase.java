package hackerrank;

public class Staircase {
    public static void staircase(int n) {
        // loop n times, each iteration makes a step
        // assume n = 4, first iteration outputs
        // "   #"
        // second iteration outputs
        // "  ##"
        for (int i = 0; i < n; i++) {
            String line = "";
            // build the line
            // 1. concat some # of spaces
            // e.g., first row when n = 4, should give us 3 spaces
            // every line is length n
            // first line has 3 spaces and 1 #
            // second line has 2 spaces and 2 #
            // third line has 1 space and 3 #
            int numSpaces = n - (i + 1);
            line += " ".repeat(numSpaces);

            // 2. concat some # of #s
            int numPounds = i + 1; // first line has 1 pound, second line has 2 pounds, etc.
            line += "#".repeat(numPounds);

            System.out.println(line);
        }

    }

    public static void main(String[] args) {
        staircase(100);
    }

}
