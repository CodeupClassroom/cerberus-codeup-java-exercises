package hackerrank;

public class Caesar {
    public static String caesarCipher(String s, int k) {
        String encrypted = "";

        // iterate thru s 1 char at a time
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // if c is an alphabet char then do the below stuff, else just concat c onto return
            // if c is in the lowercase alphabet
            if((c >= 'a' && c <= 'z')) {
                // get the char's position in the alphabet
                int pos = c - 'a';
                // find the new position offset by k and rotate using mod
                pos = (pos + k) % 26;

                // find c's new mapping
                char newC = (char) ('a' + pos);
                //            System.out.println(c + " maps to " + newC);
                encrypted += newC;
            } else if(c >= 'A' && c <= 'Z') { // if c is in uppercase alphabet
                // get the char's position in the alphabet
                int pos = c - 'A';
                // find the new position offset by k and rotate using mod
                pos = (pos + k) % 26;

                // find c's new mapping
                char newC = (char) ('A' + pos);
                //            System.out.println(c + " maps to " + newC);
                encrypted += newC;
            } else {
                encrypted += c;
            }
        }
        return encrypted;
    }

    public static void main(String[] args) {
//        System.out.println(27 % 7);
//        System.out.println(13 % 10);
//        System.out.println('b' - 'a');
        System.out.println(caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5));
    }
}
