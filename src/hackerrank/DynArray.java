package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DynArray {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // answers go here
        List<Integer> results = new ArrayList<>();

        // 2d work array
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        int lastAnswer = 0;
        for (List<Integer> query : queries) {
            int queryType = query.get(0);
            int x = query.get(1);
            int y = query.get(2);
            int idx = (x ^ lastAnswer) % n;
            if(queryType == 1) {
                arr.get(idx).add(y);
            } else { // must be a 2
                int idx2 = y % arr.get(idx).size();
                lastAnswer = arr.get(idx).get(idx2);
                results.add(lastAnswer);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(List.of(1, 0, 5));
        lists.add(List.of(1, 1, 7));
        lists.add(List.of(1, 0, 3));
        lists.add(List.of(2, 1, 0));
        lists.add(List.of(2, 1, 1));

        System.out.println(dynamicArray(2, lists));
    }
}
