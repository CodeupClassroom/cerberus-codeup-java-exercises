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

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 3, 2, 1};
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        int answer = lonelyinteger(numList);
        System.out.println(answer);

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
