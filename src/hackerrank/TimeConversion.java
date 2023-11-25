package hackerrank;

public class TimeConversion {
    public static String timeConversion(String s) {
        // 1. take apart the 12-hour time string
        String hourPart = s.substring(0, 2);
        String minutesPart = s.substring(2, 8);
        String amPM = s.substring(8, 10);

//        System.out.println(minutesPart + " " + amPM);
        int hour12 = Integer.parseInt(hourPart); // 1 to 12
        int hour24 = hour12; // for 1AM to 12PM, 24 hour is the same

        // midnight is 24 hour 0
        if(amPM.equals("AM") && hour12 == 12) {
            hour24 = 0;
        } else if(amPM.equals("PM") && hour12 < 12) {
            // 1pm to 11pm is 13 to 23
            hour24 += 12;
        }

        String time24 = hour24 + minutesPart;
        // pad with a zero if hour < 10
        if(hour24 < 10) {
            time24 = "0" + time24;
        }

        return time24;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("05:01:00PM"));
    }
}
