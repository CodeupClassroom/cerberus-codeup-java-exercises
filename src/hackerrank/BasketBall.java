package hackerrank;

import java.util.List;

public class BasketBall {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int lowBreaks = 0;
        int highBreaks = 0;
        int min = scores.get(0);
        int max = scores.get(0);

        for (int i = 1; i < scores.size(); i++) {
            if(scores.get(i) < min) {
                min = scores.get(i);
                lowBreaks++;
            } else if(scores.get(i) > max) {
                max = scores.get(i);
                highBreaks++;
            }
        }

        return List.of(highBreaks, lowBreaks);
    }

    public static void main(String[] args) {
        System.out.println(breakingRecords(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1)));
    }
}
