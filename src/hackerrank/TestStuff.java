package hackerrank;

import java.math.BigInteger;
import java.util.*;

public class TestStuff {
    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (Integer el : arr) {
            // count up the positive elements in the arr
            if(el > 0) {
                positiveCount++;
            }
            // count up the negative elements in the arr
            if(el < 0) {
                negativeCount++;
            }
            // count up the zero elements in the arr
            if(el == 0) {
                zeroCount++;
            }
        }

        System.out.printf("%.6f\n", (double) positiveCount / arr.size());
        System.out.printf("%.6f\n", (double) negativeCount / arr.size());
        System.out.printf("%.6f\n", (double) zeroCount / arr.size());

    }

    public static void miniMaxSum(List<Integer> arr) {
        // sort the numbers
//        Arrays.sort(arr.toArray());
        Collections.sort(arr);
//        System.out.println(arr);

        // print the sum of the left 4 elements
        BigInteger a = BigInteger.ZERO;
        a = a.add(BigInteger.valueOf(arr.get(0)));
        a = a.add(BigInteger.valueOf(arr.get(1)));
        a = a.add(BigInteger.valueOf(arr.get(2)));
        a = a.add(BigInteger.valueOf(arr.get(3)));
        System.out.printf("%d", a.longValue());

        System.out.print(" ");

        // print the sum of the right 4 elements
        a = BigInteger.ZERO;
        a = a.add(BigInteger.valueOf(arr.get(arr.size() - 1)));
        a = a.add(BigInteger.valueOf(arr.get(arr.size() - 2)));
        a = a.add(BigInteger.valueOf(arr.get(arr.size() - 3)));
        a = a.add(BigInteger.valueOf(arr.get(arr.size() - 4)));
        System.out.printf("%d", a.longValue());

    }

    public static String timeConversion(String s) {
        // parameter format is hh:mm:ssAM (or PM)
        String solution = "";

        // 1. parse out hours
        String hourString = s.substring(0, 2);

        // 2. parse out minutes
        String minuteString = s.substring(3, 5);

        // 3. parse out seconds
        String secondsString = s.substring(6, 8);

        // 4. parse out AM/PM
        String amPm = s.substring(8, 10);

        // 5. convert hours from 12-hour to 24-hour
        // if AM 12 -> 00, 1 to 11 -> 1 to 11
            // if hours are less than 10 then will need to put a 0 in front of hours
        // if PM 12 -> 12, 1 to 11 -> 1 to 11 + 12
        String convertedHours = "";
        int hours = Integer.parseInt(hourString);
        if(amPm.equals("AM")) {
            if(hours == 12) {
                convertedHours = "00";
            } else {
                if(hours < 10) {
                    convertedHours += "0" + hours;
                } else {
                    convertedHours += hours;
                }
            }
        } else {
            // we know it is PM here
            if(hours == 12) {
                convertedHours = "12";
            } else {
                convertedHours += hours + 12;
            }
        }

        // 6. add the converted pieces to the solution
        solution = convertedHours;
        solution += ":" + minuteString;
        solution += ":" + secondsString;

        return solution;
    }

    public static int lonelyinteger(List<Integer> a) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        // 1. for each num in a
        for (Integer num : a) {
            // 2. store the num in hashmap and increment a counter
            if(counts.containsKey(num)) {
                // found the num so set its counter to 2
                counts.put(num, 2);
            } else {
                // not in hashmap so set its counter to 1
                counts.put(num, 1);
            }
        }

        // 3. after the loop, find the element in the hashmap that has a counter of 1
            // and return that value
//        System.out.println(counts);
        // all the counts are done
        // so find the element with a count of 1 and that's the answer
        for (Integer num : a) {
            if(counts.get(num) == 1) {
                return num;
            }
        }

        // this will never execute but whatever java
        return 0;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // [ [ 1, 2, 3 ], [ 4, 5, 6 ] ]
        int n = arr.size();

        // add up the left diag elements
        int leftDiag = 0;
        for (int i = 0; i < n; i++) {
            leftDiag += arr.get(i).get(i);
        }

        // add up the right diag elements
        int rightDiag = 0;
        // for each row
        for (int i = 0; i < n; i++) {
            int j = n - i - 1;
            // 2nd index is n - 1 - i
            rightDiag += arr.get(i).get(j);
        }
//        int leftDiag = arr.get(0).get(0) + arr.get(1).get(1) + arr.get(2).get(2);
        // n = 3
        // i = 0, j = n - i - 1 = 2
        // when i = 0, j (the 2nd index) is n - 1 - i, or 3 - 1 - 0 = 2
        // i = 1, j = 3 - 1 - 1 = 1
        // i = 2, j = 3 - 1 - 2 = 0
//        int rightDiag = arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0);
        int absDiff = Math.abs(leftDiag - rightDiag);
        return absDiff;
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        Integer [] sorted = new Integer[100];

        // initialize sorted elements to 0
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = 0;
        }

        // foreach element in arr
        for (Integer element : arr) {
            int index = element;
            //      increment sorted[element]
            sorted[index]++;
        }

        return Arrays.asList(sorted);
    }

    public static void main(String[] args) {
        Integer [] nums = {1, 1, 3, 2, 1};
        List<Integer> numList = Arrays.asList(nums);

        List<Integer> sortedList = countingSort(numList);
        System.out.println(sortedList);

//        List<List<Integer>> outsideList = new ArrayList<>();
//        List<Integer> insideList = new ArrayList<>();
//
//        insideList.add(11);
//        insideList.add(2);
//        insideList.add(4);
//        outsideList.add(insideList);
//
//        insideList = new ArrayList<>();
//        insideList.add(4);
//        insideList.add(5);
//        insideList.add(6);
//        outsideList.add(insideList);
//
//        insideList = new ArrayList<>();
//        insideList.add(10);
//        insideList.add(8);
//        insideList.add(-12);
//        outsideList.add(insideList);
//
//        System.out.println(outsideList);
//        System.out.println(diagonalDifference(outsideList));

//        int [] nums = {1, 2, 3, 4, 3, 2, 1};
//        List<Integer> numList = new ArrayList<>();
//        for (int num : nums) {
//            numList.add(num);
//        }
//        int answer = lonelyinteger(numList);
//        System.out.println(answer);

//        String solution = timeConversion("07:05:45AM");
//        System.out.println(solution);

//        List<Integer> nums = new ArrayList<>();
//        nums.add(256741038);
//        nums.add(623958417 );
//        nums.add(467905213 );
//        nums.add(714532089 );
//        nums.add(938071625);
//
////        plusMinus(nums);
//        miniMaxSum(nums);

    }
}
