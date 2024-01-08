package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Leaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> prevRanked, List<Integer> players) {
        List<Integer> newRanks = new ArrayList<>();

//        List<Integer> ranked = new ArrayList<>();
//        prevRanked.stream().distinct().sorted().forEach(ranked::add);
        List<Integer> ranked = prevRanked.stream().distinct().sorted().collect(Collectors.toList());

        System.out.println(ranked);

        for (Integer player : players) {
            int idx = Collections.binarySearch(ranked, player);
            if(idx < 0) {
                idx = idx * -1 - 1;
                ranked.add(idx, player);
            }
//            System.out.println("rank is " + (ranked.size() - idx));
            newRanks.add(ranked.size() - idx);
//            System.out.println(idx);
//            ranked.add(player);
//            Collections.sort(ranked);
//            Collections.reverse(ranked);
//            int lastScore = ranked.get(0);
//            int currentRank = 1;
//
//            if(lastScore == player) {
//                newRanks.add(currentRank);
//                break;
//            }
//            for (int i = 1; i < ranked.size(); i++) {
//                if(ranked.get(i) != lastScore) {
//                    currentRank++;
//                    lastScore = ranked.get(i);
//
//                    if(lastScore == player) {
//                        newRanks.add(currentRank);
//                        break;
//                    }
//                }
//            }
        }

        return newRanks;
    }

    public static void main(String[] args) {
        List<Integer> ranked = List.of(100, 90, 90, 80);
        List<Integer> players = List.of(79, 80, 105);

        System.out.println(climbingLeaderboard(ranked, players));
    }
}
