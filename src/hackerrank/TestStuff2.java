package hackerrank;

public class TestStuff2 {
    public static String caesarCipher(String s, int k) {
        String ret = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z') {
                char newC = (char) (((c - 'a' + k) % 26) + 'a');
                ret += newC;
            } else {
                char upperC = s.toUpperCase().charAt(i);
                if(upperC >= 'A' && upperC <= 'Z') {
                    char newC = (char) (((upperC - 'A' + k) % 26) + 'A');
                    ret += newC;
                } else {
                    ret += c;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {

        String s = "There's-a-starman-waiting-in-the-sky";
        int k = 3;
        System.out.println(caesarCipher(s, k));
    }
}
