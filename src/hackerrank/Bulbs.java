package hackerrank;

import java.util.List;

public class Bulbs {

    public static long turnOffTheLights(int k, List<Integer> c) {
        int moveSize = k + 1;
        int totalCost = 0;
        int currentBulb = 0;

        while(currentBulb < c.size()) {
            currentBulb += moveSize;
            totalCost += c.get(currentBulb);
            currentBulb += moveSize;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        System.out.println(turnOffTheLights(1, List.of(1, 1, 1)));
    }
}
