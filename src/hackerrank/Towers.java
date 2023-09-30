package hackerrank;

import java.util.Arrays;
import java.util.HashMap;

public class Towers {
    public static int towerBreakers(int n, int m) {
        // Write your code here
        // if there is not a y >= 1 and < x and evenly divides x
        // then assume that we can reduce a tower to height 1
        // player 1 needs to decide his/her move

        int currentPlayer = 1; // default to player 1

        // init the n towers to height m
        int [] towers = new int[n];
        for (int i = 0; i < towers.length; i++) {
            towers[i] = m;
        }

        while(true) {
            // if we get here, there was no tower to reduce by a divisor
            // so we will search thru the towers for a maxHeight > 1
            // if no towers have height > 1 then that players loses
            int maxHeight = 1;
            int maxHeightTower = -1;

            int maxDivisor = 1;
            int selectedTower = -1;

            for (int i = 0; i < towers.length; i++) {
                // find a tower to set to height 1
                if(towers[i] > maxHeight) {
                    maxHeight = towers[i];
                    maxHeightTower = i;
                }

                // find the greatest divisor for that tower's height
//                if(maxHeightTower == -1) {
//                    int towerDivisor = towers[i] / 2;
//                    while (towerDivisor > 1 && towers[i] % towerDivisor != 0) {
//                        towerDivisor--;
//                    }
//
//                    // if the tower's divisor is > the maxDivisor then we have found
//                    // a tower that can be lowered
//                    if (towerDivisor > maxDivisor) {
//                        maxDivisor = towerDivisor;
//                        selectedTower = i;
//                    }
//                }

            }
            // if we have a maxHeightTower then we can reduce it's height to 1
            if(maxHeightTower > -1) {
                towers[maxHeightTower] = 1;

                // move to next player
                if(currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }

                // and continue to next iteration
                continue;
            }

//            for (int i = 0; i < towers.length; i++) {
//            }

            // if we found a tower we can reduce then  do that
            if(selectedTower > -1) {
                // reduce the tower's height by max divisor
                towers[selectedTower] = maxDivisor;

                // move to next player
                if(currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }

                // and continue to next iteration
                continue;
            }



            // if we get here, then currentPlayer lost
            // so return the other player's number
            if(currentPlayer == 1) {
                return 2;
            } else {
                return 1;
            }

        }
    }

    static public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // prepare the hashmap where each element in nums is a key in the map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            int targetValue = target - nums[i];
            if(map.containsKey(targetValue) && i != map.get(targetValue)) {
                int [] answer = new int[2];
                answer[0] = i;
                answer[1] = map.get(targetValue);
                return answer;
            }
        }
        return null;
    }

    public static void main(String[] args) {
//        System.out.println(towerBreakers(2, 2));
        int [] nums = {3, 3};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
