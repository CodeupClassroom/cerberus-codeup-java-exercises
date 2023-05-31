import java.util.Scanner;

public class IndentationException extends Exception {
    public IndentationException(String s) {
        super(s);
    }

    public static String getIndentationPreference() throws IndentationException {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();
        if (indentationPreference.equals("tabs")) {
            throw new IndentationException("Spaces are superior!");
        }
        return indentationPreference;
    }
    public static void main(String[] args) {
        try {
            String preference = getIndentationPreference();
            System.out.println("Cool, I like " + preference + " too.");
        } catch (IndentationException e) {
            System.out.println("You monster!");
        }
    }
}
